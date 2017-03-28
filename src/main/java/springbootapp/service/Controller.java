package springbootapp.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ash on 3/27/17.
 */
@RestController
public class Controller {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi Sonia";
    }
}
