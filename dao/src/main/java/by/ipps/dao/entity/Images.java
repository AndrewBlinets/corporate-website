package by.ipps.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Images extends AbstractEntity {

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String fileMine;

    @Column(nullable = false)
    private byte[] file;
}
