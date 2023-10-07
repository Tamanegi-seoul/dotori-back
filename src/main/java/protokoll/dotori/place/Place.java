package protokoll.dotori.place;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import protokoll.dotori.common.BaseEntity;
import protokoll.dotori.rate.Rate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "place")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Place {

    @Id
    @GeneratedValue
    @Column(name = "place_id")
    private Long placeId;

    @Column(name = "address")
    private String address;

    @Embedded
    private Location location;

    @Column(name = "contact")
    private String contact;

    @Column(name = "operationDays")
    private List<DayOfWeek> operationDays;

    @Column(name = "openTime")
    private LocalDateTime openTime;

    @Column(name = "closeTime")
    private LocalDateTime closeTime;

    @Column(name = "oprationDesc")
    private String operationDesc;

    @OneToMany
    @JoinColumn(name = "place_id")
    private List<Rate> rates;

    private List<Category> categories;

    public Long getPlaceId() {
        return placeId;
    }

}
