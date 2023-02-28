package skypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerNew {

    @GetMapping("/")
    public String showEmployeeInfo(){
        return "employeeInfo";
    }

    @GetMapping("/It_info")
    public String showItInfo(){
        return "itInfo";
    }

    @GetMapping("/Security_info")
    public String showSecurityInfo(){
        return "securityInfo";
    }

    @GetMapping("/Director_info")
    public String showDirectorInfo(){
        return "directorInfo";
    }
}
