package by.ipps.site.entity;

import java.io.Serializable;

public class NewsLanguageVersion extends BaseEntity implements Serializable {

//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "language")
//    private Language language;

    private String title;
    private String content;
    private String shortTitle;
    private String entrySpeech;
    private String codeLanguage;
}
