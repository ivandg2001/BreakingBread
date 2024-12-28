package PackageArmadietto;

import jakarta.persistence.*;

import java.util.Date;

/**
 * Questa classe rappresenta i lotti presenti nell'armadietto.
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
    private Date data_scadenza;
    /**
     * Quantità di sostanza attualmente presente nel lotto
     */
    private double quantita;

    /**
     * Costruttore vuoto
     */
    public Lotto() {}

    /**
     * Restituisce la data di scadenza del lotto
     *
     * @return data di scadenza dell'oggetto corrente
     */
    public Date getData_scadenza() {return this.data_scadenza;}

    /**
     * Imposta la data di scadenza di un lotto
     *
     * @param data_scadenza data di scadenza
     */
    public void setData_scadenza(Date data_scadenza) {this.data_scadenza = data_scadenza;}

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
}
