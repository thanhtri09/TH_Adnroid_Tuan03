package com.example.th_adroid_tuan03;

public class Goods {
    private String name;
    private String shopName;
    private int imgItem;

    public Goods(String name, String shopName, int imgItem) {
        this.name = name;
        this.shopName = shopName;
        this.imgItem = imgItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }
}
