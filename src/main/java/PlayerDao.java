import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class PlayerDao {

    public EntityManager entityManager;

    public PlayerDao(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public boolean addPlayer(Player player){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(player);
        transaction.commit();
        return true;
    }
    public List listPlayers() {
//        Session session = this.sessionFactory.openSession();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        List players = entityManager.createQuery("SELECT name FROM Wallet.Player")
                .list();

        transaction.commit();
        return players;
    }

}
