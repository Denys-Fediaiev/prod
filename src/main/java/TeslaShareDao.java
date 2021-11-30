import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TeslaShareDao {
    EntityManager entityManager;
    public TeslaShareDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public TeslaShare setTeslaShareDao(TeslaShare teslaShare){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        if (entityManager.find(AppleShare.class, teslaShare.getIdTeslaShare()) == null) {
            entityManager.merge(teslaShare);
            System.out.println("Tesla share was bought");
        }
        else {
            entityManager.remove(entityManager.contains(teslaShare) ? teslaShare : entityManager.merge(teslaShare));
            System.out.println("Tesla share was sold");
        }
        return teslaShare;
    }
}
