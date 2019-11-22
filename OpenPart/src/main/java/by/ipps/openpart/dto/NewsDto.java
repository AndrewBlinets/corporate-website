package by.ipps.openpart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsDto extends BaseDto implements Serializable {

    private Date datePublic;
    private long mainImage;
    private int countView;
    private String shortTitle;
    private String entrySpeech;

}
