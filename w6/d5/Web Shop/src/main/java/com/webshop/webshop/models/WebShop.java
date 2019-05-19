package com.webshop.webshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {

    private List<ShopItem> shopItemsList;

    public WebShop() {
        initializeList();
    }

    public void initializeList() {
        this.shopItemsList = new ArrayList<>();

        ShopItem runningShoes = new ShopItem("Running shoes", "Nike running shoes for everyday sport", 1000, 5);
        ShopItem printer = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
        ShopItem cocaCola = new ShopItem("Coca cola", "0.5 standard coke", 25, 0);
        ShopItem wokin = new ShopItem("Wokin", "Chicken with fried rice and WOKIN suace", 119, 100);
        ShopItem tShirt = new ShopItem("Tshirt", "Blue with corgi on a bike", 300, 1);

        shopItemsList.add(runningShoes);
        shopItemsList.add(printer);
        shopItemsList.add(cocaCola);
        shopItemsList.add(wokin);
        shopItemsList.add(tShirt);
    }

    public List<ShopItem> getShopItemsList() {
        return shopItemsList;
    }

    public List<ShopItem> getOnlyAvailableItemList() {
        return shopItemsList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortByCheapestItemList() {
        return shopItemsList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortByContainingNikeItemList() {
        return shopItemsList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains("nike")
                        || shopItem.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    public List<ShopItem> sortByContainingWordItemList(String word) {
        return shopItemsList.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(word)
                        || shopItem.getDescription().toLowerCase().contains(word))
                .collect(Collectors.toList());
    }

    public double getAverageStockValue() {
        return shopItemsList.stream()
                .map(shopItem -> shopItem.getQuantityOfStock())
                .collect(Collectors.averagingDouble(Integer::intValue));
    }

    public String getMostExpensiveAvailableItem() {
        return shopItemsList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .max(Comparator.comparing(ShopItem::getPrice))
                .map(shopItem -> shopItem.getName())
                .get();
    }
}
