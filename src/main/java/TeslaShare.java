import javax.persistence.*;

@Entity
@Table
public class TeslaShare {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlayer")
    private Player player;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTeslaShare;

    public int getIdTeslaShare() {
        return idTeslaShare;
    }

    public void setIdTeslaShare(int idTeslaShare) {
        this.idTeslaShare = idTeslaShare;
    }
}
