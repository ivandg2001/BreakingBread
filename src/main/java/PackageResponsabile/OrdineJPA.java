package PackageResponsabile;

import PackageArmadietto.LottoJPA;
import jakarta.persistence.*;

import java.time.LocalDate;


/**
 *
 * Classe Entity che rappresenta un ordine nel Database.
 *
 */

@Entity
public class OrdineJPA {

    /**
     *  Id dell'oggetto ordine, chiave primaria della tabella, proprieta' di autoincrement.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;      //Chiavie primaria, autoincrement

    /**
     * Data in cui e' stato effettuato l'ordine.
     */

    private LocalDate dataOrdine;     //

    /**
     * Costo totale dell'ordine effettuato.
     */

    private double costo;

    /**
     * Priorita' dell'ordine
     */
    private int priorita;

    /**
     * Responsabile che ha effettuato l'ordine
     */
    @ManyToOne
    @JoinColumn(name = "responsabile_id", referencedColumnName = "id")
    private ResponsabileJPA responsabile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lotto_id", referencedColumnName = "id", nullable = false)
    private LottoJPA lotto;

    /**
     * Costruttore predefinito, serve a JPA.
     */
    public OrdineJPA() {

    }

    /**
     * Costruttore parametrico per inizializzare i campi dell'entità.
     *
     * @param dataOrdine data in cui è stato effettuato l'ordine.
     * @param costo      costo totale dell'ordine.
     * @param responsabile responsaile che ha effettuto l'ordine
     * @param lotto lotto ordinato
     */
    public OrdineJPA(LocalDate dataOrdine, double costo , ResponsabileJPA responsabile, LottoJPA lotto , int priorita) {
        this.dataOrdine = dataOrdine;
        this.costo = costo;
        this.responsabile = responsabile;
        this.lotto = lotto;

        if (priorita < 0 || priorita > 3 ) {
            throw new IllegalArgumentException();
        }else {
            this.priorita = priorita;
        }
    }

    //--Getters and Setters--

    /**
     * Ritorna l'id dell'ordine
     * @return id dell'ordine
     */
    public Integer getID() {
        return this.ID;
    }

    /**
     * Ritorna la data dell'ordine effettuato.
     * @return Data dell'ordine, formato LocalDate.
     */
    public LocalDate getDataOrdine() {
        return this.dataOrdine;
    }

    /**
     * Setta la data in cui e' stato effettuato l'ordine.
     * @param dataOrdine data in cui e' stato effettuato l'ordine.
     */
    public void setDataOrdine(LocalDate dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    /**
     * Ritorna il costo dell'ordine.
     * @return costo dell'ordine, double.
     */
    public double getCosto() {
        return this.costo;
    }

    /**
     * Setta il costo dell'ordine effettuato.
     * @param costo costo dell'ordine effettuato.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Setta il responsabile associato a questo ordine.
     * @param responsabile responsabile associato a questo ordine.
     */
    public void setResponsabile(ResponsabileJPA responsabile) {
        this.responsabile = responsabile;
    }

    /**
     * Ritorna il responsabile che ha effettuato questo ordine
     * @return Reponsabile dell'ordine
     */
    public ResponsabileJPA getResponsabile() {
        return this.responsabile;
    }

    /**
     * Setta la priorita' dell'ordine
     * @param priorita priorita' ordine
     */
    public void setPriorita(int priorita) {
        if (priorita < 0 || priorita > 3 ) {
            throw new IllegalArgumentException();
        }else {
            this.priorita = priorita;
        }
    }

    /**
     * Ritorna la priorita' dell'ordine
     * @return priorita ordine
     */
    public int getPriorita() {
        return this.priorita;
    }

    /**
     * Setta id dell'ordine
     * @param ID id ordine
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Setta il lotto
     * @param lotto lotto ordinato
     */
    public void setLotto(LottoJPA lotto) {
        this.lotto = lotto;
    }
}
