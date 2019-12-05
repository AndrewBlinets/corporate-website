package by.ipps.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserPortal extends BaseEntity implements Serializable {

    @JsonIgnore
    @Column(nullable = false, length = 60)
    private String login;

    @JsonIgnore
    @Column(nullable = false)
    private String hashPassword;

    @JsonIgnore
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastChangePassword;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 60)
    private String surName;

    @Column(nullable = false, length = 60)
    private String patronicName;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> role;

    @JsonIgnore
    @Column
    private String position;

    @JsonIgnore
    @Column
    private String email;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departament", nullable = false)
    private Department department;
//
//    @Column
//    private Boolean block;

}
