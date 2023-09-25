package protokoll.eatscape.place;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import protokoll.eatscape.common.ImageData;

import java.awt.image.BufferedImage;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private Long menuId;

    private String name;

    private Integer price;

    private ImageData image;

}
