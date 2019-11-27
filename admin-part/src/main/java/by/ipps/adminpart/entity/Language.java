package by.ipps.adminpart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Language extends BaseEntity implements Serializable {

    private String nameLanguage;
    private String codeLanguage;
}
