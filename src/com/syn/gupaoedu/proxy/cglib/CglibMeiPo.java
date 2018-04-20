package com.syn.gupaoedu.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by shaoyn on 2018/4/19 0019.
 */
public class CglibMeiPo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception{

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("媒婆收到请求。");
        Object obj = methodProxy.invokeSuper(o, objects);
//        Object obj2 = method.invoke(o, objects);
        System.out.println("媒婆开始工作。");
        return obj;
    }
}
