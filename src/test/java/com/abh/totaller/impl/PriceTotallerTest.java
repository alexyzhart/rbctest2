package com.abh.totaller.impl;

import com.abh.item.IItem;
import com.abh.item.impl.Item;
import com.abh.totaller.IPriceTotaller;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

public class PriceTotallerTest {
    private static final BigDecimal PRICE_1 = new BigDecimal("1.23");
    private static final BigDecimal PRICE_2 = new BigDecimal("3.57");
    private static final BigDecimal PRICE_3 = new BigDecimal("5.89");
    private static final BigDecimal PRICE_4 = new BigDecimal("7.21");
    private static final BigDecimal TOTAL_PRICE = PRICE_1.add(PRICE_2).add(PRICE_3).add(PRICE_4);

    private IPriceTotaller priceTotaller;
    private Collection<IItem> testItems;

    @Before
    public void setup(){
        priceTotaller = new PriceTotaller();

        testItems = Arrays.asList(
                (IItem) new Item("Item1", PRICE_1),
                new Item("Item2", PRICE_2),
                new Item("Item3", PRICE_3),
                new Item("Item3", PRICE_4)
        );
    }

    @Test
    public void testCalcTotalPrice() throws Exception {
        BigDecimal actual = priceTotaller.calcTotalPrice(testItems);
        Assert.assertEquals("PriceTotaller returned incorrect total", TOTAL_PRICE, actual);
    }
}