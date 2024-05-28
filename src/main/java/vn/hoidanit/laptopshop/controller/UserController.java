package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import vn.hoidanit.laptopshop.service.UserService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.hoidanit.laptopshop.model.User;

@Controller
public class UserController {

    final private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String data = this.userService.handleHello();
        model.addAttribute("test", data);
        model.addAttribute("data1", "vu thanh luan");
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getAdminPage(Model model) {
        model.addAttribute("newuser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newuser") User newUser) {
        System.out.println("create user new " + newUser);
        return "hello";
    }

}
