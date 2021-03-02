package cn.tedu.test;

import cn.tedu.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    /**
     * lazy-init:
     *  将bean配置为懒加载模式，
     *  则单例bean不再在容器初始化时创建，而是将创建的时机延后到第一次使用该bean时
     *  避免了在容器初始化时创建大量的单例bean，节省启动时间 和 空间
     *  懒加载只是延后了创建时机，该是单例的bean还是单例的bean
     *  多例bean配置懒加载没有意义
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
