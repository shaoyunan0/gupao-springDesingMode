package com.syn.gupaoedu.proxy.jdk;

import com.syn.gupaoedu.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by shaoyn on 2018/4/19 0019.
 */
public class JdkProxyTest {
    public static void main(String[] args) throws Exception{
        zhaFangziTest();
    }

    private static void findLoveTest()throws Exception{
        Person person = (Person) new JDKMeiPo(new Zhangsan()).getInstance();
        person.findLove();

    }
    private static void zhaFangziTest()throws Exception{
        Person person = (Person) new JDK58(new Zhangsan()).getInstance();
        person.zufangzi();

        System.out.println(person.getClass());
//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
//
//        FileOutputStream outputStream = new FileOutputStream("J:\\gupao\\study\\gupao-springDesingMode\\src\\com\\class\\$Proxy0.class");
//        outputStream.write(bytes);
//        outputStream.flush();
//        outputStream.close();
    }

}
