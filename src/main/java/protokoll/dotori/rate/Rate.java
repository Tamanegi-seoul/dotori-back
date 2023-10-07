package protokoll.dotori.rate;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import protokoll.dotori.common.BaseEntity;
import protokoll.dotori.member.Member;
import protokoll.dotori.place.Place;

@Entity
@Table(name = "rate")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Rate extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "rate_id")
    private Long rateId;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member owner;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    public Long getRateId() {
        return rateId;
    }

}
