package protokoll.eatscape.place.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import protokoll.eatscape.place.domain.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
