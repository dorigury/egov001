package hello.egov001.domain.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/list")
    public String list() {
        // This method will return the view name for the sample list page
        return "sample/list"; // Assuming you have a Thymeleaf template at src/main/resources/templates/sample/list.html
    }


}
