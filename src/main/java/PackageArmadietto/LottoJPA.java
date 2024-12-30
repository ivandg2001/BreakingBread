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
     * Sostanza contenuta nel lotto, si fa riferimento all'ID
     */
    @ManyToOne
    @JoinColumn(name = "sostanza_id", referencedColumnName = "id")
    private SostanzaJPA sostanza;

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
    public LottoJPA(LocalDate dataScadenza , double quantita , SostanzaJPA sostanza){
        this.dataScadenza = dataScadenza;
        this.sostanza = sostanza;
        this.quantita = quantita;
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
     * Setta id del lotto
     * @param ID id lotto
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}
