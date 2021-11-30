import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AppleShareDao {
    EntityManager entityManager;
    public AppleShareDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public AppleShare setAppleShareDao(AppleShare appleShare){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        if (entityManager.find(AppleShare.class, appleShare.getIdAppleShare()) == null) {
            entityManager.merge(appleShare);
            System.out.println("Apple share was bought");
        }
        else {
                entityManager.remove(entityManager.contains(appleShare) ? appleShare : entityManager.merge(appleShare));
                System.out.println("Apple share was sold");
            }
        return appleShare;
    }
}
