package cn.tedu.test;

import cn.tedu.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    /*
    * 非Spring创建对象
    * */
    @Test
    public void test1(){
        Person person = new Person();
        person.eat();
        person.say();
    }

    /*
     * Spring创建对象
     * */
    @Test
    public void test2(){
        //1。初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2。获取bean
        Person person = (Person) context.getBean("person");
        person.say();
        person.eat();
        //3。关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
