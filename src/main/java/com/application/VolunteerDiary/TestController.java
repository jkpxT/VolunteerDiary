package com.application.VolunteerDiary;

import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/test")
public class TestController {

    public final TestService testService;

    @PostMapping
    public String testAction(@RequestBody TestTO testTO) {
        int x = testService.testAction(testTO);
        LoggerFactory.getLogger(getClass()).info("kyl");
        if(x % 2 == 0) {
            return "{";
        }
        else {
            return "}";
        }
    }

}
