package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
<<<<<<< Updated upstream
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
>>>>>>> Stashed changes

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
<<<<<<< Updated upstream
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("user", user);
        model.addAttribute("verify", verify);
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        if (user.getPassword().equals(verify)) {
           return "user/index";
        }
        else {
            model.addAttribute("error", "Passwords do not match");
            return "user/add";
        }

    }


=======
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, String verify) {
        if (user.getPassword().equals(verify)) {
            return "user/index";
        }
        return "user/add";
    }
>>>>>>> Stashed changes
}
