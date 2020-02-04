package com.shuyun.loalty.recognize;

import com.shuyun.loalty.recognize.flow.ProcessTree;
import com.shuyun.loalty.recognize.flow.builder.ProcessTreeBuilder;

public class TestApp {

    public static void main(String[] args) throws Exception {
//        ProcessFlow<Component> flow = XmlParser.parse("");
        ProcessTree<Component> tree = ProcessTreeBuilder.build();
        RegInfo regInfo = new RegInfo();
        //regInfo.setMobile("13641904963");
        ProcessContext context = new ProcessContext(regInfo, null);
        TestApp app = new TestApp();
        app.process(tree, context);
    }

    public void process(ProcessTree<Component> tree, ProcessContext context) {
        Component root = tree.getRoot();
        if (root == null) {
            return;
        }
        ProcessTree<Component> left = tree.getLeft();
        ProcessTree<Component> right = tree.getRight();
        root.prepare(context);
        if (root instanceof Action) {
            Action action = (Action) root;
            action.execute();
            root.cleanup();
            if (left != null) {
                process(left, context);
            }
        } else if (root instanceof Condition) {
            Condition condition = (Condition) root;
            boolean res = condition.on();
            root.cleanup();
            if (res && left != null) {
                process(left, context);
            } else if (right != null) {
                process(right, context);
            }
        }
    }

}
