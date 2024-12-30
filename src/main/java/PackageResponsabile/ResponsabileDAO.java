package PackageResponsabile;

import PackageArmadietto.Lotto;
import PackageArmadietto.LottoJPA;
import PackageArmadietto.Sostanza;
import PackageArmadietto.SostanzaJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.Order;

public class ResponsabileDAO implements ResponsabileDataInterface{

    @PersistenceContext
    private EntityManager em;

    public Sostanza convertToSostanza(SostanzaJPA sostanzaEntity){
        Sostanza sostanza = new Sostanza();
        sostanza.setNome(sostanzaEntity.getNome());
        sostanza.setFormula(sostanzaEntity.getFormula());
        sostanza.setCostoUnitario(sostanzaEntity.getCostoUnitario());
        sostanza.setID(sostanzaEntity.getID());
        return sostanza;
    }

    public SostanzaJPA convertToSostanzaJPA(Sostanza sostanza){
        SostanzaJPA sostanzaEntity = new SostanzaJPA();
        if (sostanza.getID() != null){
            sostanzaEntity.setID(sostanza.getID());
        }
        sostanzaEntity.setCostoUnitario(sostanza.getCostoUnitario());
        sostanzaEntity.setFormula(sostanza.getFormula());
        sostanzaEntity.setNome(sostanza.getNome());
        return sostanzaEntity;
    }

    public Lotto convertToLotto(LottoJPA lottoEntity){
       Lotto lotto = new Lotto();
       lotto.setID(lottoEntity.getID());
       lotto.setQuantita(lottoEntity.getQuantita());
       lotto.setSostanza(convertToSostanza(lottoEntity.getSostanza()));
       lotto.setDataScadenza(lottoEntity.getDataScadenza());
       return lotto;
    }

    public LottoJPA convertToLottoJPA(Lotto lotto){
        LottoJPA lottoEntity = new LottoJPA();
        if (lotto.getID() != null) {
            lottoEntity.setID(lotto.getID());
        }
        lottoEntity.setQuantita(lotto.getQuantita());
        lottoEntity.setSostanza(convertToSostanzaJPA(lotto.getSostanza()));
        lottoEntity.setDataScadenza(lotto.getDataScadenza());
        return lottoEntity;
    }

    @Override
    public void newOrder(Ordine ordine , Lotto lotto , int IDResponsabile) {


    }
}
