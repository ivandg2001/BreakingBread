package PackageResponsabile;

import PackageArmadietto.Armadietto;
import PackageArmadietto.ArmadiettoFacade;
import PackageArmadietto.Lotto;
import PackageArmadietto.Sostanza;

import java.time.LocalDate;
import java.util.ArrayList;

public class NuovoOrdineController {

    public static void creaNuovoOrdine(Responsabile responsabile) {

        // acquisizione lista sostanze
        ArmadiettoFacade armadiettoFacade = new ArmadiettoFacade();
        ArrayList<Sostanza> listaSostanze = armadiettoFacade.getListaSostanze();

        // crea form da compilare

        //info dal form


        // creazione dell'oggetto ordine
        //Lotto lotto = new Lotto(temp);
        LocalDate today = LocalDate.now();
        //Ordine ordine = new Ordine(today, 12.3, responsabile, lotto);

        // crea schermata di riepilogo
        String nomeSostanza = armadiettoFacade.getNomeSostanza();
        String formulaChimica = armadiettoFacade.getFormulaChimicaSostanza();
        Double purezza = armadiettoFacade.getPurezzaSostanza();
        int priorita = 8;
        // Stampa schermata di riepilogo

        // Inserimento dell'ordine nel sistema
        //DAO

        // Torna schermata Home
        // Stampa popup di Conferma
    }
}
