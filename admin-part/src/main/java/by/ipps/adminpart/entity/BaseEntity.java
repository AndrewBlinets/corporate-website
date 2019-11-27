package by.ipps.adminpart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

    private long id;
    @JsonIgnore
    private String statusR = "A";

    @JsonIgnore
    private Date dti = new Date();

    @JsonIgnore
    private Date dateChangeStatusR = new Date();
}
