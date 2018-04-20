package com.syn.gupaoedu.proxy.cglib;

/**
 * Created by shaoyn on 2018/4/20 0020.
 */
public class CglibProxyTest {
    public static void main(String[] args) {

        try {
            ZhangSan obj = (ZhangSan)new CglibMeiPo().getInstance(ZhangSan.class);
            obj.findLove();
            System.out.println("--------------------------------");
             System.out.println(obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
