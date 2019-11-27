package by.ipps.adminpart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class News extends BaseEntity implements Serializable {

    private Date datePublic;
    private List<NewsLanguageVersion> languageVersions;
    private FileManager mainImage;
    private int countView;
    private String status;

}
