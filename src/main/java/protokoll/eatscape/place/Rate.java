package protokoll.eatscape.place;

import jakarta.persistence.*;
import protokoll.eatscape.account.Account;

@Entity
public class Rate {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Place place;

    @ManyToOne
    private Account account;

    private Integer evaluation;

}
