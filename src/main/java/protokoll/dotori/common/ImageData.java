package protokoll.dotori.common;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.web.multipart.MultipartFile;
import protokoll.dotori.place.Menu;

import java.io.IOException;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ImageData extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "image_data_id")
    private Long imageDataId;

    @NotNull
    private String fileName;

    @NotNull
    private String fileType;

    @Lob
    private byte[] imageData;

    @OneToOne(mappedBy = "image")
    private Menu menu;

    public ImageData updateImageData(MultipartFile updatedFile) throws IOException {
        this.fileName = updatedFile.getOriginalFilename();
        this.fileType = updatedFile.getContentType();
        this.imageData = ImageUtil.compressImage(updatedFile.getBytes());

        return this;
    }

    public Long getImageDataId() {
        return imageDataId;
    }
}
