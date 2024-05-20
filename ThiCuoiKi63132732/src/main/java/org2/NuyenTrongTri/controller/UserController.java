package org2.NuyenTrongTri.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org2.NuyenTrongTri.model.UserModel;
import org2.NuyenTrongTri.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers(Model model) {
        List<UserModel> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "indexUser";
    }
    
    @GetMapping("/add")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new UserModel());
        return "addUser";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("user") UserModel user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addUser";
        }
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String showEditUserForm(@PathVariable("id") long id, Model model) {
        Optional<UserModel> user = userService.findUserById(id);
        if (user == null) {
            // handle user not found, e.g., redirect to an error page or the users list
            return "redirect:/users";
        }
        model.addAttribute("user", user);
        return "editUser";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") UserModel user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "editUser";
        }
        userService.saveUser(user);
        return "redirect:/users";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "redirect:/users";
    }
}
