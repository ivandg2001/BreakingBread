package PackageArmadietto;

import PackageResponsabile.Ordine;
import PackageRicercatore.Prelievo;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;

/**
 * Classe Entity che rappresenta un lotto presente nel Database.
 */

@Entity
public class Lotto {

    /**
     * ID usato per identificare singolarmente i lotti nel database
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    /**
     * Data di scadenza del lotto
     */
    private LocalDate dataScadenza;
    /**
     * Quantità di sostanza attualmente presente nel lotto
     */
    private double quantita;

    /**
     * Ordine che contiene questo lotto
     */
    @OneToOne(mappedBy = "lotto") // La proprietà "lotto" nella classe Ordine gestisce la relazione
    private Ordine ordine;

    /**
     * Sostanza contenuta nel lotto, si fa riferimento all'ID
     */
    @ManyToOne
    @JoinColumn(name = "sostanza_id", referencedColumnName = "id")
    private Sostanza sostanza;

    /**
     * Lista dei prelievi effettuati su questo lotto
     */
    @OneToMany(mappedBy = "lotto")
    private List<Prelievo> prelievi;

    /**
     * Costruttore predefinito
     */
    public Lotto() {}

    /**
     * Costruttore parametrico per inizializzare i campi dell'entità
     * @param dataScadenza data di scadenza del lotto
     * @param quantita quantità rimanente della sostanza nel lotto
     * @param sostanza ID della sostanza contenuta nel lotto
     */
    public Lotto(LocalDate dataScadenza , double quantita , Sostanza sostanza, Ordine ordine){
        this.dataScadenza = dataScadenza;
        this.sostanza = sostanza;
        this.quantita = quantita;
        this.ordine = ordine;
    }

    /**
     * Restituisce l'id del lotto
     * @return ID del lotto
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Restituisce la data di scadenza del lotto
     *
     * @return data di scadenza dell'oggetto corrente
     */

    public LocalDate getDataScadenza() {return this.dataScadenza;}

    /**
     * Imposta la data di scadenza di un lotto
     *
     * @param dataScadenza data di scadenza
     */
    public void setDataScadenza(LocalDate dataScadenza) {this.dataScadenza = dataScadenza;}

    /**
     * Restituisce la quantità di sostanza presente nel lotto
     *
     * @return quantità della sostanza nel lotto
     */
    public double getQuantita() {return quantita;}

    /**
     * Imposta la data quantità di sostanza nel lotto
     *
     * @param quantita quantità di sostanza nel lotto
     */
    public void setQuantita(double quantita) {this.quantita = quantita;}

    /**
     * Ritorna la sostanza contenuta ne lotto
     * @return oggetto sostanza
     */
    public Sostanza getSostanza() {
        return this.sostanza;
    }

    /**
     * Setta la sostanza contenuta nel lotto
     * @param sostanza oggetto sostanza
     */
    public void setSostanza(Sostanza sostanza) {
        this.sostanza = sostanza;
    }

    /**
     * Ritorna l'ordine in cui viene comprato questo lotto
     * @return Oggetto ordine
     */
    public Ordine getOrdine() {
        return this.ordine;
    }

    /**
     * Setta l'ordine in cui si è comprato questo lotto
     * @param ordine Oggetto ordine
     */
    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    /**
     * Ritorna la lista dei prelievi effettuati su questo lotto
     * @return Lista di oggetti prelievo
     */
    public List<Prelievo> getPrelievi() {
        return this.prelievi;
    }

    /**
     * Setta la lista dei prelievi effettuati su questo lotto
     * @param prelievi Lista di prelievi
     */
    public void setPrelievi(List<Prelievo> prelievi) {
        this.prelievi = prelievi;
    }
}
