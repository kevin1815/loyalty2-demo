package com.shuyun.loalty.recognize;

public interface Component {

    void prepare(ProcessContext context);

    void cleanup();

    void setVariable(String key, Object variable);

    Object getVariable(String key);

}
