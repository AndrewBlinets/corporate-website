package by.company.corparate.site.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @Column
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(nullable = false, length = 3, columnDefinition = "COMMENT 'status row( A -active, D - remove, V - archive'")
    private String statusR;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dti;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateChangeStatusR;
}
