package org.example.oop;

public abstract class Buyer implements BuyerAction {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();


}
