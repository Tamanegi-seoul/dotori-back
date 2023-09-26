package protokoll.dotori.place;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import protokoll.dotori.common.ImageData;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private Long menuId;

    private String name;

    private Integer price;

    private ImageData image;

}
