package PackageRicercatore;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Entity che rappresenta un ricercatore nel Database.
 */

@Entity
public class RicercatoreJPA {

    /**
     * ID del ricercatore
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    /**
     * Nome del ricecatore
     */
    private String nome;
    /**
     * Username del ricercatore
     */
    private String username;
    /**
     * Password del ricercatore
     */
    private String password;

    /**
     * Lista dei prelievi effettuati dal ricercatore
     */
    @OneToMany(mappedBy = "ricercatore")
    private ArrayList<PrelievoJPA> prelievi;

    /**
     * Team a cui appartiene il ricercatore
     */
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamJPA team;

    /**
     * Costruttore predefinito
     */
    public RicercatoreJPA(){}

    /***
     * Costruttore parametrico che inizializza i campi
     * @param nome nome del ricercatore
     * @param username username del ricercatore
     * @param password password del ricercatore
     * @param prelievi preliev effettuati dal ricercatore
     * @param team team a cui appartiene il ricercatore
     */
    public RicercatoreJPA(String nome , String username , String password , ArrayList<PrelievoJPA> prelievi , TeamJPA team){
        this.nome = nome;
        this.password = password;
        this.username = username;
        this.team = team;
        this.prelievi = prelievi;
    }

    /**
     * Ritorna l'ID del ricecatore
     * @return id ricercatore
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Ritorna la lista dei prelievi effettuati dal ricercatore
     * @return lista dei prelievi
     */
    public List<PrelievoJPA> getPrelievi() {
        return this.prelievi;
    }

    /**
     * Ritorna il nome del ricercatore
     * @return nome ricercatore
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Ritorna la password del ricercatore
     * @return passwod ricercatore
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Ritorna lo username del ricercatore
     * @return username ricercatore
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Ritorna il team a cui appatiene il ricercatore
     * @return team ricercatore
     */
    public TeamJPA getTeam() {
        return this.team;
    }

    /**
     * Setta i prelievi effettuati dal ricecatore
     * @param prelievi relievi del ricercatore
     */
    public void setPrelievi(ArrayList<PrelievoJPA> prelievi) {
        this.prelievi = prelievi;
    }

    /**
     * Setta il nome del ricercatore
     * @param nome nome ricercatore
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Setta la password del ricercatore
     * @param password password ricercatore
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Setta il team a cui fa parte il ricercatore
     * @param team Oggetto team
     */
    public void setTeam(TeamJPA team) {
        this.team = team;
    }

    /**
     * Setta lo username del ricercatore
     * @param username username ricercatore
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
