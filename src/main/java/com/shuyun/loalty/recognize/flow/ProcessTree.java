package com.shuyun.loalty.recognize.flow;

public class ProcessTree<E> {

    // 当前执行的组件（Action或者是Condition）
    E root;

    // 如果当前执行组件是Action，则left代表下一个执行组件（Action或者是Condition），可以为null
    // 如果当前执行组件是Condition，则left代表直接结果为TRUE后下一个执行组件（Action或者是Condition），可以为null
    ProcessTree<E> left;

    // 如果当前执行组件是Action，则right永远为null
    // 如果当前执行组件是Condition，则right代表直接结果为FALSE的下一个执行组件（Action或者是Condition），可以为null
    ProcessTree<E> right;

    public ProcessTree(E root, ProcessTree<E> left, ProcessTree<E> right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public E getRoot() {
        return root;
    }

    public ProcessTree<E> getLeft() {
        return left;
    }

    public ProcessTree<E> getRight() {
        return right;
    }

}
