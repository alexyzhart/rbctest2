package com.abh.totaller.impl;

import com.abh.item.IItem;
import com.abh.totaller.IPriceTotaller;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

public class PriceTotaller implements IPriceTotaller {
    @Override
    public BigDecimal calcTotalPrice(Collection<IItem> basketOfItems){
        final AtomicReference<BigDecimal> total = new AtomicReference(BigDecimal.ZERO);
        basketOfItems.forEach(item -> total.set(total.get().add(item.getPrice())));
        return total.get();
    }
}
