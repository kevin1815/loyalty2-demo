package com.shuyun.loalty.recognize;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class ProcessContext implements ListableBeanFactory {

    private final Map<String, Object> variables = new HashMap<>();

    private final RegInfo regInfo;

    private final ApplicationContext applicationContext;

    public ProcessContext(RegInfo regInfo, ApplicationContext applicationContext) {
        this.regInfo = regInfo;
        this.applicationContext = applicationContext;
    }

    public RegInfo getRegInfo() {
        return regInfo;
    }

    public void setVariable(String key, Object variable) {
        if (key == null) {
            throw new IllegalArgumentException("key is null");
        }
        this.variables.put(key, variable);
    }

    public Object getVariable(String key) {
        return variables.get(key);
    }

    @Override
    public String toString() {
        return "{ regInfo = " + regInfo + '}';
    }

    @Override
    public boolean containsBeanDefinition(String beanDefinition) {
        return this.applicationContext.containsBeanDefinition(beanDefinition);
    }

    @Override
    public int getBeanDefinitionCount() {
        return this.applicationContext.getBeanDefinitionCount();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return this.applicationContext.getBeanDefinitionNames();
    }

    @Override
    public String[] getBeanNamesForType(ResolvableType resolvableType) {
        return this.applicationContext.getBeanNamesForType(resolvableType);
    }

    @Override
    public String[] getBeanNamesForType(ResolvableType resolvableType, boolean includeNonSingletons,
                                        boolean allowEagerInit) {
        return this.applicationContext.getBeanNamesForType(resolvableType, includeNonSingletons,
                allowEagerInit);
    }

    @Override
    public String[] getBeanNamesForType(Class<?> type) {
        return this.applicationContext.getBeanNamesForType(type);
    }

    @Override
    public String[] getBeanNamesForType(Class<?> type, boolean includeNonSingletons,
                                        boolean allowEagerInit) {
        return this.applicationContext.getBeanNamesForType(type, includeNonSingletons,
                allowEagerInit);
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return this.applicationContext.getBeansOfType(type);
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingletons,
                                             boolean allowEagerInit) throws BeansException {
        return this.applicationContext.getBeansOfType(type, includeNonSingletons, allowEagerInit);
    }

    @Override
    public String[] getBeanNamesForAnnotation(Class<? extends Annotation> aClass) {
        return this.applicationContext.getBeanNamesForAnnotation(aClass);
    }

    @Override
    public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> aClass)
            throws BeansException {
        return this.applicationContext.getBeansWithAnnotation(aClass);
    }

    @Override
    public <A extends Annotation> A findAnnotationOnBean(String s, Class<A> aClass)
            throws NoSuchBeanDefinitionException {
        return this.applicationContext.findAnnotationOnBean(s, aClass);
    }

    @Override
    public Object getBean(String s) throws BeansException {
        return this.applicationContext.getBean(s);
    }

    @Override
    public <T> T getBean(String s, Class<T> aClass) throws BeansException {
        return this.applicationContext.getBean(s, aClass);
    }

    @Override
    public Object getBean(String s, Object... objects) throws BeansException {
        return this.applicationContext.getBean(s, objects);
    }

    @Override
    public <T> T getBean(Class<T> aClass) throws BeansException {
        return this.applicationContext.getBean(aClass);
    }

    @Override
    public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {
        return this.applicationContext.getBean(aClass, objects);
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(Class<T> aClass) {
        return this.applicationContext.getBeanProvider(aClass);
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(ResolvableType resolvableType) {
        return this.applicationContext.getBeanProvider(resolvableType);
    }

    @Override
    public boolean containsBean(String s) {
        return this.applicationContext.containsBean(s);
    }

    @Override
    public boolean isSingleton(String s) throws NoSuchBeanDefinitionException {
        return this.applicationContext.isSingleton(s);
    }

    @Override
    public boolean isPrototype(String s) throws NoSuchBeanDefinitionException {
        return this.applicationContext.isPrototype(s);
    }

    @Override
    public boolean isTypeMatch(String s, ResolvableType resolvableType)
            throws NoSuchBeanDefinitionException {
        return this.applicationContext.isTypeMatch(s, resolvableType);
    }

    @Override
    public boolean isTypeMatch(String s, Class<?> aClass) throws NoSuchBeanDefinitionException {
        return this.applicationContext.isTypeMatch(s, aClass);
    }

    @Override
    public Class<?> getType(String s) throws NoSuchBeanDefinitionException {
        return this.applicationContext.getType(s);
    }

    @Override
    public Class<?> getType(String s, boolean b) throws NoSuchBeanDefinitionException {
        return this.applicationContext.getType(s, b);
    }

    @Override
    public String[] getAliases(String s) {
        return this.applicationContext.getAliases(s);
    }

}
