package PackageRicercatore;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//todo: eliminare managerid dal class diagram

/**
 * Classe Entity che rappresenta un team nel Database.
 */
@Entity
public class TeamJPA {

    /**
     * ID del Team
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    /**
     * Nome del Team
     */
    private String nomeTeam;

    /**
     * Lista dei ricercatori che fanno parte di questo team
     */
    @OneToMany(mappedBy = "team")
    private ArrayList<RicercatoreJPA> ricercatori;

    /**
     * Lista dei progetti assegnati a questo team
     */
    @OneToMany(mappedBy = "team")
    private ArrayList<ProgettoJPA> progetti;

    /**
     * Costruttore predefinito
     */
    public TeamJPA(){}

    /**
     * Costruttore parametrico che inizializza i campi
     * @param nomeTeam nome del team
     * @param ricercatori lista di oggetti ricercatore
     * @param progetti lista di oggetti progetto
     */
    public TeamJPA(String nomeTeam , ArrayList<RicercatoreJPA> ricercatori , ArrayList<ProgettoJPA> progetti){
        this.nomeTeam = nomeTeam;
        this.progetti = progetti;
        this.ricercatori = ricercatori;
    }

    /**
     * Ritorna l'id del team
     * @return id Team
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Ritorna il nome del Team
     * @return nome Team
     */
    public String getNomeTeam() {
        return this.nomeTeam;
    }

    /**
     * Ritorna la lista dei progetti assegnati al Team
     * @return lista progetti
     */
    public List<ProgettoJPA> getProgetti() {
        return this.progetti;
    }

    /**
     * Ritorna la lista dei ricercatori che appartengono al Team
     * @return lista ricercatori
     */
    public List<RicercatoreJPA> getRicercatori() {
        return this.ricercatori;
    }

    /**
     * Setta il nome del Team
     * @param nomeTeam nome Team
     */
    public void setNomeTeam(String nomeTeam) {
        this.nomeTeam = nomeTeam;
    }

    /**
     * Setta la lista dei progetti ssegnati al Team
     * @param progetti lista progetti
     */
    public void setProgetti(ArrayList<ProgettoJPA> progetti) {
        this.progetti = progetti;
    }

    /**
     * Setta la lista dei ricercatori che appartengono al Team
     * @param ricercatori lista ricercatori
     */
    public void setRicercatori(ArrayList<RicercatoreJPA> ricercatori) {
        this.ricercatori = ricercatori;
    }
}
