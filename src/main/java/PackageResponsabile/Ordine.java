package PackageResponsabile;

import jakarta.persistence.*;

import java.time.LocalDate;

//todo: aggiungere la foreign key di Lotto

/**
 *
 * Classe Entity che rappresenta un ordine nel Database.
 *
 */

@Entity
public class Ordine {

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
     * Responsabile che ha effettuato l'ordine
     */
    @ManyToOne
    @JoinColumn(name = "Responsabile_ID", referencedColumnName = "ID")
    private Responsabile responsabile;

    /**
     * Costruttore predefinito, serve a JPA.
     */
    public Ordine() {

    }

    /**
     * Costruttore parametrico per inizializzare i campi dell'entità.
     *
     * @param dataOrdine data in cui è stato effettuato l'ordine.
     * @param costo      costo totale dell'ordine.
     */
    public Ordine(LocalDate dataOrdine, double costo) {
        this.dataOrdine = dataOrdine;
        this.costo = costo;
    }

    //--Getters and Setters--

    /**
     * Ritorna l'id dell'ordine
     * @return id dell'ordine
     */
    public int getID() {
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
    public void setResponsabile(Responsabile responsabile) {
        this.responsabile = responsabile;
    }

    /**
     * Ritorna il responsabile che ha effettuato questo ordine
     * @return Reponsabile dell'ordine
     */
    public Responsabile getResponsabile() {
        return this.responsabile;
    }
}
