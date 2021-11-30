import com.mysql.cj.util.TestUtils;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlayer;
    @Column
    String name;
    @Column
    int balance;
    @Column
    int Apple_share;
    @Column
    int Tesla_share;
    @Column
    int LC_share;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<LcShare> lcShareList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<TeslaShare> teslaShareList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<AppleShare> appleShareList;




    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getApple_share() {
        return Apple_share;
    }

    public void setApple_share(int apple_share) {
        Apple_share = apple_share;
    }

    public int getTesla_share() {
        return Tesla_share;
    }

    public void setTesla_share(int tesla_share) {
        Tesla_share = tesla_share;
    }

    public int getLC_share() {
        return LC_share;
    }

    public void setLC_share(int LC_share) {
        this.LC_share = LC_share;
    }
    public String showPlayer(){
        return "Developer{" +
                "id=" + idPlayer +
                ", Name='" + name + '\'' +
                ", Balance='" + balance + '\'' +
                ", Apple Share='" + Apple_share + '\'' +
                ", Tesla Share=" + Tesla_share + '\'' +
                 ", Tesla Share=" + Tesla_share +
                '}';
    }

    public Player() {

    }
    public Player(int idPlayer, String name, int balance, int Apple_share, int Tesla_share, int LC_share) {
        this.balance = balance;
        this.idPlayer = idPlayer;
        this.name = name;
        this.Apple_share = Apple_share;
        this.LC_share = LC_share;
        this.Tesla_share = Tesla_share;

    }

}