package cn.tedu.test;

import cn.tedu.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    /**
     * SPringIOC原理
     * 推论3：可以配置多个id不同但class相同的bean
     */
    @Test
    public void test05(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //2.获取bean
        Person p1 = (Person) context.getBean("person1");
        System.out.println(p1);
        Person p2 = (Person) context.getBean("person2");
        System.out.println(p2);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();

    }

    /**
     * SpringIOC原理
     * 推论2：不可以配置多个id相同的bean
     */
    @Test
    public void test04(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
    }

    /**
     * SpringIOC原理
     * 推论1：在默认情况下 多次获取同一个id的bean 得到的将是同一个对象
     */
    @Test
    public void test03(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //2.获取bean
        Person p1 = (Person) context.getBean("person");
        System.out.println(p1);
        Person p2 = (Person) context.getBean("person");
        System.out.println(p2);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }


    /**
     * Spring方式创建对象
     */
    @Test
    public void test02(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        Person p = (Person) context.getBean("person");
        p.eat();
        p.say();
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 非Spring方式创建对象
     */
    @Test
    public void test01(){
        Person p = new Person();
        p.eat();
        p.say();
    }
}
