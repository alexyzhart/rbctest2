package com.abh.main;

import com.abh.totaller.IPriceTotaller;
import com.abh.totaller.impl.PriceTotaller;

import java.math.BigDecimal;

/**
 * Write a program that takes a basket of items and outputs its total cost.
 * The basket can contain one or more of the following items: Bananas, Oranges, Apples, Lemons, Peaches
 */
public class ShoppingMain {
    public static void main(String argv[]){
        IPriceTotaller priceTotaller = new PriceTotaller();

        System.out.println("Items to total= " + Items.BASKET);
        BigDecimal totalPrice = priceTotaller.calcTotalPrice(Items.BASKET);

        System.out.println("total=" + totalPrice);
    }
}
