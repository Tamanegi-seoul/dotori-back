package protokoll.dotori.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/index")
    public String index() {

        return "index";
    }

    @GetMapping("/admin")
    public String admin() {

        return "admin";
    }

}
