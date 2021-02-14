package com.bilgeadam.designpatterns.structural.composite.after;

import java.math.BigDecimal;
import java.util.List;

public class CalculatePriceUtil {

    public static BigDecimal getTotalProductPrice(List<Product> productList){
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Product product:productList) {
            totalPrice = totalPrice.add(product.getTotalPrice());
        }
        return totalPrice;
    }

    public static BigDecimal getTotalPacketPrice(List<Packet> packetList){
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Packet packet:packetList) {
            totalPrice = totalPrice.add(packet.getTotalPrice());

        }
        return totalPrice;
    }
}
