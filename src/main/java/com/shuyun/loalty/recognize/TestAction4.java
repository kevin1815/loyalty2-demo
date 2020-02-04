package com.shuyun.loalty.recognize;

public class TestAction4 extends BaseAction {

    public TestAction4(String componentId) {
        super(componentId);
    }

    @Override
    public void prepare(ProcessContext context) {
        super.prepare(context);
    }

    public void execute() {
        System.out.println("componentId = " + this.componentId + ", " + getClass().getSimpleName());
    }

}
