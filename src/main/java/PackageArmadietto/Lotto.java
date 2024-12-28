package PackageArmadietto;

import jakarta.persistence.*;

import java.util.Date;

/**
 * Questa classe rappresenta i lotti presenti nell'armadietto.
 */

@Entity
public class Lotto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private Date data_scadenza;
    private double quantita;

    public Date getData_scadenza() {return data_scadenza;}

    public void setData_scadenza(Date data_scadenza) {this.data_scadenza = data_scadenza;}

    public double getQuantita() {return quantita;}

    public void setQuantita(double quantita) {this.quantita = quantita;}
}
