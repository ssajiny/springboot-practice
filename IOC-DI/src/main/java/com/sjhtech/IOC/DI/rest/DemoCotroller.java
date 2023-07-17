package com.sjhtech.IOC.DI.rest;

import com.sjhtech.IOC.DI.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCotroller {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
//    @Autowired
//    public DemoCotroller(Coach theCoach) {
//        myCoach = theCoach;
//    }

    // setter dependency Injection
    @Autowired
//    public void setCoach(@Qualifier("baseballCoach") Coach theCoach) {
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
