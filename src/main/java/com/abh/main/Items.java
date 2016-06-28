package com.abh.main;

import com.abh.item.IItem;
import com.abh.item.impl.Item;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

public class Items {
    public static final IItem BANANAS = new Item("Bananas", new BigDecimal("1.45"));
    public static final IItem ORANGES = new Item("Oranges", new BigDecimal("2.05"));
    public static final IItem APPLES_1 = new Item("Apples", new BigDecimal("3.13"));
    public static final IItem APPLES_2 = new Item("Apples", new BigDecimal("5.21"));
    public static final IItem LEMONS = new Item("Lemons", new BigDecimal("7.80"));
    public static final IItem PEACHES = new Item("Peaches", new BigDecimal("3.20"));

    public static final Collection<IItem> BASKET = Arrays.asList(BANANAS, ORANGES, APPLES_1, APPLES_2, LEMONS, PEACHES);
}
