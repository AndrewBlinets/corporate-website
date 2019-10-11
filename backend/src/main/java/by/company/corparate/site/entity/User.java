package by.company.corparate.site.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbstractEntity implements Serializable {

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 60)
    private String surName;

    @Column(nullable = false, length = 60)
    private String patronicName;

    @Column(nullable = false, length = 60)
    private String email;

    @Column(nullable = false, length = 33)
    private String hashPassword;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastChangePassword;

    @OneToOne(fetch = FetchType.LAZY)
    private Sector sector;

    @Column(nullable = false)
    private Role role;
}
