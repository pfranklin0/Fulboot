package pf.spring.fulboot

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FulController {

    @GetMapping("/")
    fun version(model: Model): String {
        model["org.springframework.boot"] ="2.7.8"
        return "version";
    }

}