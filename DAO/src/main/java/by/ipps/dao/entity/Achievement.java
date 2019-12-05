package by.ipps.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Achievement extends BaseEntity implements Serializable {
    @Column
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private FileManager image;

    @Column
    private String type;
}
