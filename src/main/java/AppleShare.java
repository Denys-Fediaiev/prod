import javax.persistence.*;

@Entity
@Table
public class AppleShare {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlayer")
    private Player player;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAppleShare;


    public int getIdAppleShare() {
        return idAppleShare;
    }

    public void setIdAppleShare(int idAppleShare) {
        this.idAppleShare = idAppleShare;
    }
}
