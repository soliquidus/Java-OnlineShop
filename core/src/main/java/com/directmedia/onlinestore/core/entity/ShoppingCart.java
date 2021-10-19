package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Class representing the customers ShoppingCart
 *
 * @author Tibo Pfeifer
 * @version 1.0
 * @date 19/10/2021
 */
public class ShoppingCart {

    private Set<Work> items = new HashSet<>();

    public Set<Work> getItems() {
        return items;
    }

    public void setItems(Set<Work> items) {
        this.items = items;
    }
}