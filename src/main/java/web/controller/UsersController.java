package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

import java.util.Map;

@Controller
@Validated
public class UsersController {
    private final UserService userService;

    @Autowired
    public UsersController(UserService userServiceInt) {
        this.userService = userServiceInt;
    }

    @GetMapping(value = "/users")
    public String getUsers(Model model) {
        model.addAttribute("title", "Список пользователей:");
        model.addAttribute("userList", userService.getUsers());
        return "user_list";
    }

    @GetMapping(value = "/addUser")
    public String newUserForm(Map<String, Object> model) {
        User user = new User();
        model.put("newUser", user);
        return "new_user";
    }

    @PostMapping(value = "/save")
    public String saveUser(@ModelAttribute("newUser") User user) {
        userService.addUser(user);
        return "redirect:/users";
    }


    @GetMapping(value = "/edit")
    public String editUser(@RequestParam(value = "id") Integer id, Model model) {
        return "userEditpage";
    }

}
