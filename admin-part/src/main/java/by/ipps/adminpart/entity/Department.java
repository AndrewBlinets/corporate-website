package by.ipps.adminpart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Department extends BaseEntity implements Serializable {

    private String name;
    private String code;
//    private User leader;

}
