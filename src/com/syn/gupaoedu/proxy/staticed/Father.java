package com.syn.gupaoedu.proxy.staticed;

/**
 * Created by shaoyn on 2018/4/19 0019.
 */
public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove(){
        System.out.println("家庭经济");
        son.findLove();
        System.out.println("家长同意");
    }

}
