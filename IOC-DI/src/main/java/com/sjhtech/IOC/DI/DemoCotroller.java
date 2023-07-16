package com.sjhtech.IOC.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCotroller {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoCotroller(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
