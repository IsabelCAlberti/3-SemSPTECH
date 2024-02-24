package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/times")
public class TimeController {

    private List<TimeFutebol> times = new ArrayList<>(List.of(
        new TimeFutebol("Jururuba", 12, 3, 0),
        new TimeFutebol("Sazopeba", 0, 5, 9)
    ));

    @GetMapping("/primeiro")
    public TimeFutebol primeiro() {
        return times.get(0);
    }

    @GetMapping // URI: /times
    public List<TimeFutebol> getTimes() {
        return times;
    }
}
