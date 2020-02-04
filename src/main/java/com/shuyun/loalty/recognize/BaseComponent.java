package com.shuyun.loalty.recognize;

import org.apache.commons.lang3.StringUtils;

public abstract class BaseComponent implements Component {

    protected final String componentId;

    protected ProcessContext context;

    protected BaseComponent(String componentId) {
        if (StringUtils.isEmpty(componentId)) {
            throw new IllegalArgumentException("componentId must not be empty!");
        }
        this.componentId = componentId;
    }

    public void prepare(ProcessContext context) {
        this.context = context;
    }

    @Override
    public void cleanup() {
    }

    @Override
    public void setVariable(String key, Object variable) {
        this.context.setVariable(key, variable);
    }

    @Override
    public Object getVariable(String key) {
        return this.context.getVariable(key);
    }

    @Override
    public String toString() {
        return "Component {" +
                "componentId='" + componentId + '\'' +
                ", context=" + context +
                '}';
    }
}
