package by.ipps.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department extends BaseEntity implements Serializable {

    @Column
    private String name;

    @Column
    private String code;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "leader")
    private UserPortal leader;

}
