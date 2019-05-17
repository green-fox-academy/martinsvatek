package com.webshop.webshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {

    private List<ShopItem> shopItemList;

    public WebShop() {
        shopItemList = new ArrayList<>();
    }

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public List<ShopItem> onlyAvailableItemList() {
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortedByCheapestItemList() {
        return shopItemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortedByContainingWordItemList(String word) {
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getName().contains(word) || shopItem.getDescription().contains(word))
                .collect(Collectors.toList());
    }

    public double averageStockValue(double average) {
        return average = shopItemList.stream()
                .map(shopItem -> shopItem.getQuantityOfStock())

    }

    public void mostExpensiveAvailableItem() {
        return shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .max( Comparator.comparing(ShopItem::getPrice)).get()
                .collect(Collectors.toList());

    }
}
