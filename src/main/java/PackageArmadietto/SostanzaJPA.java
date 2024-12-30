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
     *
     * Lista dei lotti in cui è contenuta tale sostanza
     */
    @OneToMany(mappedBy = "sostanza", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LottoJPA> lotto;

    /**
     * Costruttore vuoto
     */
    public SostanzaJPA() {}


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
}
