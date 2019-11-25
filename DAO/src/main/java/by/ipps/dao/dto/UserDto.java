package by.ipps.dao.dto;

import by.ipps.dao.entity.Department;
import by.ipps.dao.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto {
    private String login;
    private String hashPassword;
    private String name;
    private String surName;
    private String patronicName;
    private List<String> role;
    private String position;
    private String email;
    private long department;

    public void setRole(List<Role> role) {
        this.role = new ArrayList<>();
        for (Role r : role) {
            this.role.add(r.getName());
        }
    }

    public void setDepartment(Department department) {
        this.department = department.getId();
    }
}
