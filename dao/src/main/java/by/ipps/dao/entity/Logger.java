package by.ipps.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Logger extends AbstractEntity {

    @OneToOne
    @JoinColumn(name="user")
    private User user;
    @Column(nullable = false)
    private String tableName;
    @Column(nullable = false)
    private long rowId;
    @Column(length = 6, nullable = false)
    private String event;
    @Column(length = 1000)
    private String oldValue;

}
