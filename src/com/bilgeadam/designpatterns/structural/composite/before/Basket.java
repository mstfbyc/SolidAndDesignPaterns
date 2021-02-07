package com.bilgeadam.designpatterns.structural.composite.before;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private String name;
    private List<Product> productList;
    private List<Packet> packetList;
    private List<AidPackage> aidPackageList;

    public Basket(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packetList = new ArrayList<>();
        this.aidPackageList = new ArrayList<>();
    }
//Open - Close Aykırı
    public BigDecimal getTotalrice() {

        BigDecimal totalPrice = BigDecimal.ZERO;

        for (Product product : productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }

        for (Packet packet : packetList) {

            List<Product> productList = packet.getProductList();

            for (Product product : productList) {
                totalPrice = totalPrice.add(product.getPrice());
            }
        }

        for (AidPackage aidPacked : aidPackageList) {
            List<Product> productList = aidPacked.getProductList();
            List<Packet> packetList = aidPacked.getPacketList();
            for (Product product : productList) {
                totalPrice = totalPrice.add(product.getPrice());
            }
            for (Packet packet : packetList) {
                List<Product> productList2 = packet.getProductList();
                for (Product product : productList2) {
                    totalPrice = totalPrice.add(product.getPrice());
                }
            }
        }
        return totalPrice;
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

    public List<AidPackage> getAidPackageList() {
        return aidPackageList;
    }

    public void setAidPackageList(List<AidPackage> aidPackageList) {
        this.aidPackageList = aidPackageList;
    }
}
