package com.abh.totaller;

import java.math.BigDecimal;
import java.util.Collection;
import com.abh.item.IItem;

public interface IPriceTotaller{
    BigDecimal calcTotalPrice(Collection<IItem> items);
}
