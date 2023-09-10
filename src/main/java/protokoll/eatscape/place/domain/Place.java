package protokoll.eatscape.place.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Place {

    @Id
    @GeneratedValue
    @Column(name = "place_id")
    private Long id;

    @Column(name = "address")
    private String address;

    @Embedded
    private Location location;

}
