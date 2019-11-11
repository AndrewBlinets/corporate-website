package by.ipps.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbstractEntity implements Serializable {

    @Column(nullable = false, length = 60)
    private String login;

    @Column(nullable = false, length = 33)
    private String hashPassword;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastChangePassword;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 60)
    private String surName;

    @Column(nullable = false, length = 60)
    private String patronicName;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Role> role;

    @Column
    private String position;
    // position

}
