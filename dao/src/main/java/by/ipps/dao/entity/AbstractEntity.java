package by.ipps.dao.entity;

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

    @Column(nullable = false, length = 3)
    private String statusR;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dti;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateChangeStatusR;
}
