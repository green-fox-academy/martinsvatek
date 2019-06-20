package com.webshop.webshop.controllers;

import com.webshop.webshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebShopController {

    WebShop store = new WebShop();

    @RequestMapping(value = "/store")
    public String basicWebShopWithoutAnything(Model model) {
        model.addAttribute("items", store.getShopItemsList());
        return "index";
    }

    @RequestMapping(value = "/store/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", store.getOnlyAvailableItemList());
        return "index";
    }

    @RequestMapping(value = "/store/cheapest-first")
    public String sortFromCheapest(Model model) {
        model.addAttribute("items", store.sortByCheapestItemList());
        return "index";
    }

    @RequestMapping(value = "/store/contains-nike")
    public String displayContainsNike(Model model) {
        model.addAttribute("items", store.sortByContainingNikeItemList());
        return "index";
    }

    @RequestMapping(value = "/store/average-stock")
    public String displayAverageStock(Model model) {
        model.addAttribute("average", store.getAverageStockValue());
        return "index";
    }

    @RequestMapping(value = "/store/most-expensive")
    public String displayNameOfMostExpensiveItem(Model model) {
        model.addAttribute("expensive", store.getMostExpensiveAvailableItem());
        return "index";
    }

    @RequestMapping(value = "/store/search")
    public String displaySearch(Model model,@RequestParam String word) {
        model.addAttribute("items", store.sortByContainingWordItemList(word));
        return "index";
    }
}