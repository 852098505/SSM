package cn.tedu.test;

import cn.tedu.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    /**
     * 单例
     *  容器初始化，Spring解析配置文件，发现单例bean，
     *  则创建单例对象
     *  创建之后保存在Spring容器内部的Map种
     *  后续无论获取多少次，返回的都是这一个对象
     *  直到容器关闭，随着容器的销毁对象被移除
     *
     *  多例
     *   容器初始化，Spring解析配置文件，发现多例bean,
     *   则将bean的信息保存，但不创建bean
     *   之后每次获取该bean，都创建一个新的对象返回，且创建的对象不会保存在Spring内部Map种
     *   这个对象什么时候销毁完全取决于使用者。
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
