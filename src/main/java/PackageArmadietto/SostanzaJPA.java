package PackageArmadietto;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SostanzaJPA {

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
    private double costoUnitario;

    /**
     * Costruttore vuoto
     */
    public SostanzaJPA() {}

    /**
     * Costruttore parametrico per inizializzare i campi
     * @param nome nome della sostanza
     * @param formula formula della sostanza
     * @param costoUnitario costo unitario della sostanza
     */
    public SostanzaJPA(String nome, String formula, double costoUnitario) {
        this.nome = nome;
        this.formula = formula;
        this.costoUnitario = costoUnitario;
    }

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
    public double getCostoUnitario() {
        return costoUnitario;
    }

    /**
     * Imposta il costo della sostanza per unitò
     *
     * @param costoUnitario costo della sostanza per unità
     */
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    /**
     * Ritorna l'id della sostanza
     * @return id sostanza
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Setta l'id della sostanza
     * @param ID id sostanza
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}
