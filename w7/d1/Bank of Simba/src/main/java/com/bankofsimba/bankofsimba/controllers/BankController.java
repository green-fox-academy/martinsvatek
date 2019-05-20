package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankController {

    private BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    private String myText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    // A GET method should be used to retrieve data from the server.
    // A POST method should be used when you need to create, update or delete data on the server side.
    // (Briefly - POST - for creating data, PUT - for updating data and DELETE for deleting data)

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showBankAccount(Model model) {
        model.addAttribute("account", bankAccount);
        return "index";
    }

    @RequestMapping(path = "/html-eception", method = RequestMethod.GET)
    public String htmlException (Model model) {
        model.addAttribute("myText", myText);
        return "htmlexception";
    }
}
