package by.ipps.dao.entity;

import by.ipps.dao.utils.constant.FilterName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FilterDef(
        name = FilterName.LANGUAGE,
        defaultCondition = "id in (select id " +
                "from projectlanguageversion pv " +
                "inner join language l on pv.language = l.id " +
                "where l.codeLanguage =  :language)",
        parameters = {
                @ParamDef(name = "language", type = "string"),
        }
)
public class ProjectLanguageVersion extends BaseEntity implements Serializable {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language")
    private Language language;

    @Column
    private String title;

    @Column
    private String shortTitle;

    @Column
    private String content;

    @Column
    private String entrySpeech;

}
