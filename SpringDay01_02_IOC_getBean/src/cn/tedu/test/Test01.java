package cn.tedu.test;

import cn.tedu.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    /**
     * getBean(Class clz) 通过class获取bean
     *      找不到,抛异常NoSuchBeanDefinitionException
     *      找到唯一的，返回
     *      找到多个，有可能找到多个，抛出异常NoUniqueBeanDefinitionException
     */
    @Test
    public void test02(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        Person p = context.getBean(Person.class);
        System.out.println(p);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * getBean(String id) 通过id获取bean
     *      找不到,抛异常NoSuchBeanDefinitionException
     *      找到唯一的，返回
     *      找到多个，不可能找到多个
     */
    @Test
    public void test01(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        Person p = (Person) context.getBean("person");
        System.out.println(p);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
