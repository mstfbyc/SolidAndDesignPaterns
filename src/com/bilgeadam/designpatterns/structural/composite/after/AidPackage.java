package com.bilgeadam.designpatterns.structural.composite.after;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AidPackage implements Priceable{
    private String name;
    private List<Product> productList;
    private List<Packet> packetList;

    public AidPackage(String name) {
        this.name = name;
        this.packetList = new ArrayList<>();
        this.productList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Packet> getPacketList() {
        return packetList;
    }

    public void setPacketList(List<Packet> packetList) {
        this.packetList = packetList;
    }

    @Override
    public BigDecimal getTotalPrice() {
        BigDecimal totalProductPrice = CalculatePriceUtil.getTotalProductPrice(productList);
        BigDecimal totalPacketPrice = CalculatePriceUtil.getTotalPacketPrice(packetList);
        BigDecimal totalPrice = totalProductPrice.add(totalPacketPrice);
        return totalPrice;
    }
}
