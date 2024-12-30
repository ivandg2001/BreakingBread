package PackageArmadietto;

import java.util.List;

/**
 * Classe POJO che rappresenta una sostanza nel sistema, mappato da un adapter JPA.
 */
public class Sostanza {

    /**
     * ID usato per identificare singolarmente le sostanze nel database
     */
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
     *
     * Lista dei lotti in cui è contenuta tale sostanza
     */
    private List<Lotto> lotto;

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
     * Ritorna i lotti in cui e'presente tale sostanza
     * @return lista di lotti
     */
    public List<Lotto> getLotto() {
        return this.lotto;
    }

    /**
     * Setta i lotti in cui si trova la sostanza
     * @param lotto lista di lotti
     */
    public void setLotto(List<Lotto> lotto) {
        this.lotto = lotto;
    }
}
