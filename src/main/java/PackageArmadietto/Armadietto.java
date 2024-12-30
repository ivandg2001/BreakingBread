package PackageArmadietto;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Entity che rappresenta l'armadietto.
 */
public class Armadietto {

    /**
     * Lista dei lotti presenti nel laboratorio
     */
    private ArrayList<LottoJPA> lotti;

    /**
     * Costruttore predefinito
     */
    public Armadietto(){
        this.lotti = new ArrayList<LottoJPA>();
    }

    /**
     * Costruttore parametrico che inizializza il campo
     * @param lotti lotti del laboratorio
     */
    public Armadietto(ArrayList<LottoJPA> lotti){
        this.lotti = lotti;
    }

    /**
     * Ritorna la lista dei lotti
     * @return lista lotti
     */
    public List<LottoJPA> getLotti() {
        return lotti;
    }

    /**
     * Setta la lista dei lotti
     * @param lotti lista lotti
     */
    public void setLotti(ArrayList<LottoJPA> lotti) {
        this.lotti = lotti;
    }

    /**
     * Metodo che permette di aggiungere un lotto alla lista dei lotti
     * @param lotto
     */
    public void addLotto(LottoJPA lotto){
        this.lotti.add(lotto);
    }
}
