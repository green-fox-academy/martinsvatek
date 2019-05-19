package com.webshop.webshop.controllers;

import com.webshop.webshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebShopController {

    WebShop myStore = new WebShop();

    @RequestMapping(value = "")
    public String basicWebShopWithoutAnything(Model model) {
        model.addAttribute("items", myStore.getShopItemsList());
        return "index";
    }

    @RequestMapping(value = "/web-shop")
    public String basicWebShop(Model model) {
        model.addAttribute("items", myStore.getShopItemsList());
        return "index";
    }

    @RequestMapping(value = "/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", myStore.getOnlyAvailableItemList());
        return "index";
    }

    @RequestMapping(value = "/cheapest-first")
    public String sortFromCheapest(Model model) {
        model.addAttribute("items", myStore.sortByCheapestItemList());
        return "index";
    }

    @RequestMapping(value = "/contains-nike")
    public String displayContainsNike(Model model) {
        model.addAttribute("item", myStore.sortByContainingNikeItemList());
        return "index";
    }

    @RequestMapping(value = "/average-stock")
    public String displayAverageStock(Model model) {
        model.addAttribute("average", myStore.getAverageStockValue());
        return "index";
    }

    @RequestMapping(value = "/most-expensive")
    public String displayNameOfMostExpensiveItem(Model model) {
        model.addAttribute("name", myStore.getMostExpensiveAvailableItem());
        return "index";
    }

    @RequestMapping(value = "/search")
    public String displaySearch(Model model,@RequestParam String word) {
        model.addAttribute("items", myStore.sortByContainingWordItemList(word));
        return "index";
    }
}