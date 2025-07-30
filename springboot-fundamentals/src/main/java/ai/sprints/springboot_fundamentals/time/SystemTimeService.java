package ai.sprints.springboot_fundamentals.time;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
@Primary
public class SystemTimeService implements TimeService {
    @Override
    public String getCurrentTime() {
        return LocalTime.now().toString();
    }
}