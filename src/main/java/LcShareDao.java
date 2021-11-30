import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LcShareDao {
    EntityManager entityManager;
    public LcShareDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public LcShare setLcShareDao(LcShare lcShare){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        if (entityManager.find(AppleShare.class, lcShare.getIdLcShare()) == null) {
            entityManager.merge(lcShare);
            System.out.println("Apple share was bought");
        }
        else {
            entityManager.remove(entityManager.contains(lcShare) ? lcShare : entityManager.merge(lcShare));
            System.out.println("Apple share was sold");
        }
        return lcShare;
    }
}
