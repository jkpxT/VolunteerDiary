package com.application.VolunteerDiary;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, columnDefinition = "varchar(40)", nullable = false)
    private String title;

    @Column(columnDefinition = "varchar(40)", nullable = false)
    private String madeBy;

    @Column(nullable = false)
    private Long date;

    @Builder
    public Test(Long id, String title, String madeBy, Long date) {
        this.id = id;
        this.title = title;
        this.madeBy = madeBy;
        this.date = date;
    }

}
