package com.syn.gupaoedu.proxy.jdk;

import com.syn.gupaoedu.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by shaoyn on 2018/4/19 0019.
 */
public class JDK58 implements InvocationHandler{
    private Person person;

    public JDK58(Person person) {
        this.person = person;
    }

    public Object getInstance(){
        Class clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK58 搜索....");
        Object ret = method.invoke(this.person, args);
        System.out.println("JDK58 找到，请看房");
        return ret;
    }
}
