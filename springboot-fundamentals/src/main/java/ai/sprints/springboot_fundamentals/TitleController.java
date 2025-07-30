package ai.sprints.springboot_fundamentals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {
    private final AppProperties appProperties;

    @Autowired
    public TitleController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/title")
    public String getTitle() {
        return appProperties.getTitle();
    }
}