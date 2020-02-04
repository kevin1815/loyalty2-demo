package com.shuyun.loalty.recognize.flow.builder;

import com.shuyun.loalty.recognize.*;
import com.shuyun.loalty.recognize.flow.ProcessTree;

public class ProcessTreeBuilder {

    public static ProcessTree<Component> build() throws Exception {
        Component action1 = new TestAction1("action1");
        Component action2 = new TestAction2("action2");
        Component condition1 = new MobileCondition("condition1");
        Component action3 = new TestAction3("action3");
        Component action4 = new TestAction1("action4");
        ProcessTree<Component> tree5 = new ProcessTree<>(action4, null, null);
        ProcessTree<Component> tree4 = new ProcessTree<>(action3, null, null);
        ProcessTree<Component> tree3 = new ProcessTree<>(condition1, tree4, tree5);
        ProcessTree<Component> tree2 = new ProcessTree<>(action2, tree3, null);
        return new ProcessTree<>(action1, tree2, null);
    }

}
