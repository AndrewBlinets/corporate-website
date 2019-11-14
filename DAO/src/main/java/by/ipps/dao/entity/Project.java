package by.ipps.dao.entity;

import by.ipps.dao.utils.constant.FilterName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Filter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project extends BaseEntity implements Serializable {

    @OneToMany(fetch = FetchType.LAZY)
//    @Filter(name = FilterName.LANGUAGE)
    private List<ProjectLanguageVersion> languageVersions;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Images> images;
}
