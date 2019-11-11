package by.ipps.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Projects extends AbstractEntity {

    @Column
    private String title;

    @Column
    private String shortTitle;

    @Column
    private String content;

    @Column
    private String entrySpeech;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Images> images;
}
