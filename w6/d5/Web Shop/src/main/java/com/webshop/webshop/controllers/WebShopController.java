package com.webshop.webshop.controllers;

import com.webshop.webshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebShopController {

    WebShop myStore = new WebShop();

    @RequestMapping("/web-shop")
    public String basicWebShop(Model model) {
        model.addAttribute("items", myStore.getShopItemsList());
        return "shop";
    }

    @RequestMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", myStore.getOnlyAvailableItemList());
        return "shop";
    }

    @RequestMapping("/cheapest-first")
    public String sortFromCheapest(Model model) {
        model.addAttribute("items", myStore.sortByCheapestItemList());
        return "shop";
    }

    @RequestMapping("/contains-nike")
    public String displayContainsNike(Model model) {
        model.addAttribute("items", myStore.sortByContainingNikeItemList());
        return "shop";
    }

    @RequestMapping("/average-stock")
    public String displayAverageStock(Model model) {
        model.addAttribute("average", myStore.getAverageStockValue());
        return "shop";
    }

    @RequestMapping("/most-expensive")
    public String displayNameOfMostExpensiveItem(Model model) {
        model.addAttribute("name", myStore.getMostExpensiveAvailableItem());
        return "shop";
    }

    @RequestMapping("/search")
    public String displaySearch(Model model,@RequestParam String word) {
        model.addAttribute("items", myStore.sortByContainingWordItemList(word));
        return "shop";
    }
}