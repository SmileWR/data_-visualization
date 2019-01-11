package com.example.data.entity;

public class Goods {
    private Integer id;

    private String name;

    private Integer buyPrice;

    private Integer selPrice;

    private Integer supplier;

    private Integer store;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Integer getSelPrice() {
        return selPrice;
    }

    public void setSelPrice(Integer selPrice) {
        this.selPrice = selPrice;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", buyPrice=" + buyPrice +
                ", selPrice=" + selPrice +
                ", supplier=" + supplier +
                ", store=" + store +
                ", type=" + type +
                '}';
    }
}