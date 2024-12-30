package PackageResponsabile;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * Classe Entity che rappresenta un responssabile nel Database.
 *
 */
@Entity
public class ResponsabileJPA {

    /**
     * Id dell'oggetto responsabile, chiave primaria della tabella, proprieta' di autoincrement.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    /**
     * Nome del responsabile.
     */
    private String nome;

    /**
     * Password utilizzata dal responsabile per loggarsi.
     */
    private String password;
    /**
     * Username utilizzato dal responsabile per loggarsi.
     */
    private String username;

    /**
     * Costruttore predefinito, serve a JPA
     */
    public ResponsabileJPA() {

    }

    /**
     * Costruttore parametrico per inizializzare i campi dell'entità.
     * @param nome nome del responsabile
     * @param password password del responsabile
     * @param username username del responsabile
     */
    public ResponsabileJPA(String nome, String password, String username) {
        this.nome = nome;
        this.password = password;
        this.username = username;
    }

    //--Getters and Setters--

    /**
     * Ritorna l'id del resposabile
     * @return id responsabile
     */
    public int getId() {
        return this.ID;
    }

    /**
     * Ritorna il nome del responsabile
     * @return Nome del del responsabile, formato String
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Setta il nome del responsabile
     * @param nome Nome del responsabile
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Ritorna la password del responsabile
     * @return Password del responsabile, formato String
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setta la password del responsabile
     * @param password Password del responsabile
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Ritorna lo username del responsabile
     * @return Username del responsabile
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setta lo username del responsabile
     * @param username Username del reponsabile
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Setta l'id del responsabile
     * @param ID id responsabile
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}
