package protokoll.dotori.rate;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import protokoll.dotori.member.Member;
import protokoll.dotori.place.Place;

@Entity
@Table(name = "rate")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Rate {

    @Id
    @GeneratedValue
    @Column(name = "rate_id")
    private Long rateId;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member owner;

    @OneToOne
    private Place place;

}
