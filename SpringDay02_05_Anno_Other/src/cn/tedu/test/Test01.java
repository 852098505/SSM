package cn.tedu.test;

import cn.tedu.domain.DaoUtils;
import cn.tedu.domain.Person;
import cn.tedu.domain.Person2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    /**
     * 初始化 销毁 方法
     */
    @Test
    public void test03(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        DaoUtils daoUtils = (DaoUtils) context.getBean("daoUtils");
        daoUtils.insert();
        daoUtils.delete();
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }


    /**
     * 懒加载
     */
    @Test
    public void test02(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        Person2 p21 = (Person2) context.getBean("person2");
        System.out.println(p21);
        Person2 p22 = (Person2) context.getBean("person2");
        System.out.println(p22);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 单例 多例
     */
    @Test
    public void test01(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        Person p1 = (Person) context.getBean("person");
        System.out.println(p1);
        Person p2 = (Person) context.getBean("person");
        System.out.println(p2);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
