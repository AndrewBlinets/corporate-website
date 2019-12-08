package by.ipps.dao.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity implements Serializable {
    @Column
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<UserPortal> users;
}
