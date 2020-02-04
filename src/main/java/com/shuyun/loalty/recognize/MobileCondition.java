package com.shuyun.loalty.recognize;

import org.apache.commons.lang3.StringUtils;

public class MobileCondition extends BaseCondition {

    public MobileCondition(String componentId) {
        super(componentId);
    }

    @Override
    public boolean on() {
        System.out.println("componentId = " + this.componentId + ", " + getClass().getSimpleName());
        String mobile = context.getRegInfo().getMobile();
        return StringUtils.isNotEmpty(mobile);
    }
}
