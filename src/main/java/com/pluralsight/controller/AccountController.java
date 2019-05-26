package com.pluralsight.controller;

import com.pluralsight.Services.AccountService;
import com.pluralsight.Services.AccountServiceImpl;
import com.pluralsight.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, ste);
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/new")
    public String newAccount(Model model) {

        model.addAttribute("account", new Account());

        return "account-form";

    }

    @RequestMapping("/showAccount")
    public String showAccount() {
        return "showAccount";
    }



    @RequestMapping(value = "/saveAccount",method = RequestMethod.POST)
    public String saveAccount(@Valid @ModelAttribute("account") Account account,
                              BindingResult result) {

        if( result.hasErrors()) {
            return "account-form";
        }
        else {
            accountService.saveAccount(account);
            return "redirect:/list";
        }


    }

}
