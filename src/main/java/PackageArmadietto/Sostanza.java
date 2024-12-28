package PackageArmadietto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Sostanza {

    /**
     * ID usato per identificare singolarmente le sostanze nel database
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    /**
     * Data di scadenza del lotto
     */
    private String nome;
    /**
     * Quantità di sostanza attualmente presente nel lotto
     */
    private String formula;
    /**
     * Costo della sostanza per ogni unità della stessa
     */
    private double costo_unitario;

    /**
     * Costruttore vuoto
     */
    public Sostanza() {}


    /**
     * Restituisce il nome della sostanza
     *
     * @return nome della sostanza
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome della sostanza
     *
     * @param nome nome della sostanza
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce la formula della sostanza
     *
     * @return formula della sostanza
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Imposta la formula della sostanza
     *
     * @param formula formula della sostanza
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * Restituisce il costo della sostanza per unità
     *
     * @return costo della sostanza per unità
     */
    public double getCosto_unitario() {
        return costo_unitario;
    }

    /**
     * Imposta il costo della sostanza per unitò
     *
     * @param costo_unitario costo della sostanza per unità
     */
    public void setCosto_unitario(double costo_unitario) {
        this.costo_unitario = costo_unitario;
    }
}
