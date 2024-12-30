package PackageRicercatore;

import PackageArmadietto.LottoJPA;
import jakarta.persistence.*;

import java.time.LocalDate;

// todo: rivedere la molteplicità tra prelievo e lotto. Aggungere il campo quantità
/**
 * Classe Entity che rappresenta un Prelievo di una sostanza nel Database.
 */

@Entity
public class PrelievoJPA {

    /**
     * Id del prelievo di una sostanza
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    /**
     * Data in cui è stato effettuato il prelievo
     */
    private LocalDate date;

    /**
     * Quantità di sostanza prelevata dal prelievo
     */
    private double quantita;

    /**
     * Lotto su cui è stato effettuato il prelievo
     */
    @ManyToOne
    @JoinColumn(name = "lotto_id" , referencedColumnName = "ID")
    private LottoJPA lotto;

    /**
     * ricercatore che ha effettuato l'ordine
     */
    @ManyToOne
    @JoinColumn(name = "ricercatore_id" , referencedColumnName = "id")
    private RicercatoreJPA ricercatore;

    /**
     * Costruttore predefinito
     */
    public PrelievoJPA(){}

    /**
     * Costruttore parametrico per inizializzare i campi
     * @param Date Data in cui è stato effettuato il prelievo
     * @param lotto Lotto su cui è stato effettuato il prelievo
     */
    public PrelievoJPA(LocalDate Date , LottoJPA lotto , double quantita){
        this.date = Date;
        this.lotto = lotto;
        this.quantita = quantita;
    }

    /**
     * Ritorna l'ID del prelievo
     * @return ID prelievo
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Ritorna il lotto su cui è stato effettuato il prelievo
     * @return Oggetto lotto
     */
    public LottoJPA getLotto() {
        return this.lotto;
    }

    /**
     * Setta il lotto su cui effettuare il prelievo
     * @param lotto Oggetto lotto
     */
    public void setLotto(LottoJPA lotto) {
        this.lotto = lotto;
    }

    /**
     * Ritorna la data in cui è stato effettuato il prelievo
     * @return campo Date
     */
    public LocalDate getDate() {
        return this.date;
    }

    /**
     * Setta la data i cui è stato effettuato l'ordine
     * @param date campo date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Ritorna la quantità prelevata con questo prelievo
     * @return campo quantità
     */
    public double getQuantita() {
        return this.quantita;
    }

    /**
     * Setta la quantità da prelevare con questo prelievo
     * @param quantita campo quantità
     */
    public void setQuantita(double quantita) {
        this.quantita = quantita;
    }

    /**
     * Ritorna il ricercatore che ha effettuato il prelievo
     * @return oggetto ricercatore
     */
    public RicercatoreJPA getRicercatore() {
        return this.ricercatore;
    }

    /**
     * Setta il ricercatore che ha effettuato questo prelievo
     * @param ricercatore oggetto ricercatore
     */
    public void setRicercatore(RicercatoreJPA ricercatore) {
        this.ricercatore = ricercatore;
    }
}
