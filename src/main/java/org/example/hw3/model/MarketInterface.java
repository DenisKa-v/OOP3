package org.example.hw3.model;

public interface MarketInterface {
    public void addToMarket(Integer index, Notebook notebook);
    public void removeFromMarket(Integer index);
    public String toStringMarket();
}
