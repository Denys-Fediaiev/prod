import javax.persistence.*;

@Entity
@Table
public class LcShare {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlayer")
    private Player player;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLcShare;

    public int getIdLcShare() {
        return idLcShare;
    }

    public void setIdLcShare(int idLcShare) {
        this.idLcShare = idLcShare;
    }
}
