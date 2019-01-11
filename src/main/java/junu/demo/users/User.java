package junu.demo.users;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;
}
