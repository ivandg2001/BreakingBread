package PackageResponsabile;

import PackageArmadietto.Lotto;
import PackageArmadietto.LottoJPA;
import PackageArmadietto.Sostanza;
import PackageArmadietto.SostanzaJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;

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

    public ResponsabileJPA convertToResponsabileJPA(Responsabile responsabile){
        ResponsabileJPA responsabileEntity = new ResponsabileJPA();
        if (responsabile.getID() != null) {
            throw new IllegalArgumentException();
        }
        responsabileEntity.setNome(responsabile.getNome());
        responsabileEntity.setID(responsabile.getID());
        responsabileEntity.setPassword(responsabile.getPassword());
        responsabileEntity.setUsername(responsabile.getUsername());
        return responsabileEntity;

    }

    public OrdineJPA convertToOrdineJPA(Ordine ordine){
        OrdineJPA ordineEntity = new OrdineJPA();
        if (ordineEntity.getID() != null) {
            ordineEntity.setID(ordine.getID());
        }
        ordineEntity.setPriorita(ordine.getPriorita());
        ordineEntity.setLotto(convertToLottoJPA(ordine.getLotto()));
        ordineEntity.setResponsabile(convertToResponsabileJPA(ordine.getResponsabile()));
        ordineEntity.setDataOrdine(ordine.getDataOrdine());
        ordineEntity.setCosto(ordine.getCosto());
        return ordineEntity;

    }

    @Override
    public void newOrder(Ordine ordine , Lotto lotto) {

        // Recupero una transazione
        EntityTransaction transaction = em.getTransaction();

        try {

            // Converto il POJO Lotto in entità LottoJPA
            LottoJPA lottoEntity = convertToLottoJPA(lotto);


            // Converto il POJO Ordine in entità OrdineJPA
            OrdineJPA ordineEntity = convertToOrdineJPA(ordine);

            // Avvia la transazione
            transaction.begin();

            // Persistere l'Ordine nel database (il Lotto verrà persistito automaticamente grazie alla cascata)
            em.persist(ordineEntity);  // JPA si occuperà automaticamente di persistere anche il Lotto

            // Commit della transazione
            transaction.commit();
        } catch (RuntimeException e) {
            // In caso di errore, rollback della transazione
            if (transaction.isActive()) {
                transaction.rollback();
            }
            // Rilancia l'eccezione o logga l'errore
            throw e;
        }

    }
}
