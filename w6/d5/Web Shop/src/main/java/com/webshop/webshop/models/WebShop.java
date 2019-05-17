package com.webshop.webshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {

    private List<ShopItem> shopItemList;
    private List<ShopItem> shopItemListFiltered;


    public WebShop(List<ShopItem> shopItemList, List<ShopItem> shopItemListFiltered) {
        this.shopItemList = shopItemList;
        this.shopItemListFiltered = new ArrayList<>();
    }

    public List<ShopItem> getShopItemListFiltered() {
        return shopItemListFiltered;
    }

    public void onlyAvailableItemList {
        shopItemListFiltered = shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public void sortedByCheapestItemList {
        shopItemListFiltered = shopItemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    public void sortedByContainingWordItemList(String word) {
        shopItemListFiltered = shopItemList.stream()
                .filter(shopItem -> shopItem.getName().contains(word) || shopItem.getDescription().contains(word))
                .collect(Collectors.toList());
    }
}
