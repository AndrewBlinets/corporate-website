package by.ipps.adminpart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FileManager extends BaseEntity implements Serializable {

    private String fileName;
    private String fileMine;
    private String path;
}
