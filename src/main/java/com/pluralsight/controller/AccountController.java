package com.pluralsight.controller;

import com.pluralsight.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class AccountController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/new")
    public String newAccount(Model model) {

        model.addAttribute("account", new Account());

        return "newAccount";

    }

    @RequestMapping("/showAccount")
    public String showAccount() {
        return "showAccount";
    }



    @RequestMapping(value = "/saveAccount",method = RequestMethod.POST)
    public String saveAccount(@Valid @ModelAttribute("account") Account account,
                              BindingResult result) {

        if( result.hasErrors()) {
            return "newAccount";
        }
        else {
            return "showAccount";
        }


    }

}
