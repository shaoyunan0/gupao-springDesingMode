package com.syn.gupaoedu.proxy.custom;

import com.syn.gupaoedu.proxy.Person;
import com.syn.gupaoedu.proxy.jdk.Zhangsan;

/**
 * Created by Tom on 2018/3/10.
 */
public class CustomPorxyTest {

    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new Zhangsan());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
