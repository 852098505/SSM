package cn.tedu.test;

import cn.tedu.domain.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解方式IOC
 */
public class Test01 {

    /**
     * 注解方式IOC - 工厂方式配置bean
     */
    @Test
    public void test03(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
         NetConn nc = (NetConn) context.getBean("nc");
        System.out.println(nc);
        //3.关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }


    /**
     * 注解方式IOC - id推断规则
     *  如果手动指定过id，则使用指定的id
     *  如果没有手动指定过id，则自动推断id，推断规则为：
     *      看类名的第二个字母
     *      如果是小写，首字母转小写为id
     *      如果是大写，则首字母保持不变作为id
     */
    @Test
    public void test02(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        PErson2 p2 = (PErson2) context.getBean("PErson2");
        System.out.println(p2);
        pErson3 p3 = (pErson3) context.getBean("pErson3");
        //3.关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 注解方式IOC - 入门案例
     */
    @Test
    public void test01(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        Person p = (Person) context.getBean("per");
        System.out.println(p);
        Car c = (Car) context.getBean("car");
        System.out.println(c);
        //3.关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
