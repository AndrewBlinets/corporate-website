package by.ipps.dao.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Department extends BaseEntity implements Serializable {

    @Column
    private String name;
    @Column
    private String code;
    @OneToMany(mappedBy = "department")
    private List<UserPortal> users;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leader")
    private UserPortal leader;

}
