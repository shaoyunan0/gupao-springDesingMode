package com.syn.gupaoedu.proxy.jdk;

import com.syn.gupaoedu.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by shaoyn on 2018/4/19 0019.
 */
public class JDKMeiPo implements InvocationHandler {
    private Person person;

    public JDKMeiPo(Person person) {
        this.person = person;
    }

    public Object getInstance(){
        Class clazz = this.person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("媒婆收到请求。");
        Object obj = method.invoke(this.person, args);
        System.out.println("媒婆开始工作。");
        return obj;
    }
}
