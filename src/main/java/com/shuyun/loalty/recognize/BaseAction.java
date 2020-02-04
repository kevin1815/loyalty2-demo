package com.shuyun.loalty.recognize;

public abstract class BaseAction extends BaseComponent implements Action {

    public BaseAction(String componentId) {
        super(componentId);
    }

    public abstract void execute();

}
