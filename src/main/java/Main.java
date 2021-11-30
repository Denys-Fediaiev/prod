import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        AppleShareDao appleShareDao = new AppleShareDao(entityManager);
        TeslaShareDao teslaShareDao = new TeslaShareDao(entityManager);
        LcShareDao lcShareDao = new LcShareDao(entityManager);
        PlayerDao playerDao = new PlayerDao(entityManager);

        Player player1 = new Player();
        player1.setIdPlayer(1);
        player1.setBalance(3000);
        player1.setName("Ray");
        

        System.out.println("List of players");
        /*
         */
//        List developers = developerRunner.listDevelopers();
//        for (Developer developer : developers) {
//            System.out.println(developer);
//
//    }
    }
}
