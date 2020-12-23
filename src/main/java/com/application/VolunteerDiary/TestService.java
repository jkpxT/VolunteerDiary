package com.application.VolunteerDiary;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public int testAction(TestTO testTO) {
        return 10;
    }

}
