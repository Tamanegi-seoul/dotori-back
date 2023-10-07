package protokoll.dotori.place;

import jakarta.persistence.*;
import protokoll.dotori.common.BaseEntity;
import protokoll.dotori.common.ImageData;

@Entity
public class Menu extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "menu_id")
    private Long menuId;

    private String name;

    private Integer price;

    @OneToOne
    @JoinColumn(name = "image_data_id")
    private ImageData image;

    public Long getMenuId() {
        return menuId;
    }

}
