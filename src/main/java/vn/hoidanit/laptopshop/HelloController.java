package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello controller 111`";
    }

    @GetMapping("/user")
    public String GetUserPage() {
        return "user";
    }

    @GetMapping("/admin")
    public String GetAdminPage() {
        return "admin`";
    }

}
