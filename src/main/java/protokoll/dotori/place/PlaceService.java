package protokoll.dotori.place;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlaceService {

    private final PlaceRepository placeRepository;

    @Transactional
    public Long registerPlace(Place place) {
        Place registeredPlace = this.placeRepository.save(place);
        return registeredPlace.getPlaceId();
    }

}
