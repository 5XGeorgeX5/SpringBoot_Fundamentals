package ai.sprints.springboot_fundamentals.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;

    @Autowired
    public TimeController(@Qualifier("mock") TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return timeService.getCurrentTime();
    }
}
