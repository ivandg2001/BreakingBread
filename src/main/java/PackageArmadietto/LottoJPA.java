package PackageArmadietto;

import PackageResponsabile.OrdineJPA;
import PackageRicercatore.PrelievoJPA;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Classe Entity che rappresenta un lotto presente nel Database.
 */

@Entity
public class LottoJPA {

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
    private OrdineJPA ordine;

    /**
     * Sostanza contenuta nel lotto, si fa riferimento all'ID
     */
    @ManyToOne
    @JoinColumn(name = "sostanza_id", referencedColumnName = "id")
    private SostanzaJPA sostanza;

    /**
     * Lista dei prelievi effettuati su questo lotto
     */
    @OneToMany(mappedBy = "lotto")
    private ArrayList<PrelievoJPA> prelievi;

    /**
     * Costruttore predefinito
     */
    public LottoJPA() {

    }

    /**
     * Costruttore parametrico per inizializzare i campi dell'entità
     * @param dataScadenza data di scadenza del lotto
     * @param quantita quantità rimanente della sostanza nel lotto
     * @param sostanza ID della sostanza contenuta nel lotto
     */
    public LottoJPA(LocalDate dataScadenza , double quantita , SostanzaJPA sostanza, OrdineJPA ordine){
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
    public SostanzaJPA getSostanza() {
        return this.sostanza;
    }

    /**
     * Setta la sostanza contenuta nel lotto
     * @param sostanza oggetto sostanza
     */
    public void setSostanza(SostanzaJPA sostanza) {
        this.sostanza = sostanza;
    }

    /**
     * Ritorna l'ordine in cui viene comprato questo lotto
     * @return Oggetto ordine
     */
    public OrdineJPA getOrdine() {
        return this.ordine;
    }

    /**
     * Setta l'ordine in cui si è comprato questo lotto
     * @param ordine Oggetto ordine
     */
    public void setOrdine(OrdineJPA ordine) {
        this.ordine = ordine;
    }

    /**
     * Ritorna la lista dei prelievi effettuati su questo lotto
     * @return Lista di oggetti prelievo
     */
    public ArrayList<PrelievoJPA> getPrelievi() {
        return this.prelievi;
    }

    /**
     * Setta la lista dei prelievi effettuati su questo lotto
     * @param prelievi Lista di prelievi
     */
    public void setPrelievi(ArrayList<PrelievoJPA> prelievi) {
        this.prelievi = prelievi;
    }
}
