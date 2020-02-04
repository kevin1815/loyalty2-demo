package com.shuyun.loalty.recognize;

import org.apache.commons.lang3.StringUtils;

public class ExistsAccountCondition extends BaseCondition {

    protected ExistsAccountCondition(String componentId) {
        super(componentId);
    }

    @Override
    public boolean on() {
        System.out.println("check if mobile is empty");
        String mobile = context.getRegInfo().getAccountId();

        return StringUtils.isNotEmpty(mobile);
    }
}
