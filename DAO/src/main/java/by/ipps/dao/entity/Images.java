package by.ipps.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Images extends BaseEntity implements Serializable {

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String fileMine;

    @Column(nullable = false)
    private byte[] file;
}
