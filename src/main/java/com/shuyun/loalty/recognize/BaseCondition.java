package com.shuyun.loalty.recognize;

public abstract class BaseCondition extends BaseComponent implements Condition {

    protected BaseCondition(String componentId) {
        super(componentId);
    }

    public abstract boolean on();
}