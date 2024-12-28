package PackageArmadietto;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Lotto {

    @Id
    @GeneratedValue
    private int ID;

    private Date data_scadenza;
    private double quantity;

    public Date getData_scadenza() {return data_scadenza;}

    public void setData_scadenza(Date data_scadenza) {this.data_scadenza = data_scadenza;}

    public double getQuantity() {return quantity;}

    public void setQuantity(double quantity) {this.quantity = quantity;}
}
