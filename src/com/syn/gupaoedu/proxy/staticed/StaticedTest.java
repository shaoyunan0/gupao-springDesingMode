package com.syn.gupaoedu.proxy.staticed;

/**
 * Created by shaoyn on 2018/4/19 0019.
 */
public class StaticedTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();

    }
}
