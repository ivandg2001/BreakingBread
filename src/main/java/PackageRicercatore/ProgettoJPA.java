package PackageRicercatore;

import jakarta.persistence.*;

/**
 * Classe Entity che rappresenta un progetto nel Database.
 */
@Entity
public class ProgettoJPA {


    /**
     * Id del progetto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    /**
     * Nome del progetto
     */
    private String nomeProgetto;

    /**
     * Team a cui è stato assegnato il progetto.
     */
    @ManyToOne
    @JoinColumn(name = "team_id" , referencedColumnName = "id")
    private TeamJPA team;

    /**
     * Costruttore predefinito.
     */
    public ProgettoJPA(){}

    /**
     * Costruttore parametrico che inizializza i campi.
     * @param nomeProgetto nome del progetto
     * @param team team a cui è assegnato il progetto
     */
    public ProgettoJPA(String nomeProgetto , TeamJPA team){
        this.nomeProgetto = nomeProgetto;
        this.team = team;
    }

    /**
     * Ritorna l'ID del progetto
     * @return id progetto
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Ritorna il team a cui è assegnato il progetto
     * @return team progetto
     */
    public TeamJPA getTeam() {
        return this.team;
    }

    /**
     * Ritorna il nome del progetto
     * @return nome progetto
     */
    public String getNomeProgetto() {
        return this.nomeProgetto;
    }

    /**
     * Setta il team a cui è assegnato il progetto
     * @param team team progetto
     */
    public void setTeam(TeamJPA team) {
        this.team = team;
    }

    /**
     * Setta il nome del progetto
     * @param nomeProgetto nome progetto
     */
    public void setNomeProgetto(String nomeProgetto) {
        this.nomeProgetto = nomeProgetto;
    }
}
