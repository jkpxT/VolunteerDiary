package com.application.VolunteerDiary;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {

    Test findByTitle(String title);
}
