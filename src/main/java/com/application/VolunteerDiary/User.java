package com.application.VolunteerDiary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, columnDefinition = "varchar(50)", nullable = false)
    private String email;

    @Column(unique = true, columnDefinition = "varchar(20)", nullable = false)
    private String name;

    @Column(unique = true, columnDefinition = "varchar(255)", nullable = false)
    private String password;

    @Builder
    public User(Long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
