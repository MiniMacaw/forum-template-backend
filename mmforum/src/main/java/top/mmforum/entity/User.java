package top.mmforum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Date createAt;
    private Date updateAt;
}
