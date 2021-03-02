package cn.tedu.test;

import cn.tedu.domain.Person01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    /**
     * Spring创建对象的方式
     *      默认通过反射创建bean
     *      即clz.newInstance()
     *      本质上是调用了类的无参构造器创建的对象
     */
    @Test
    public void test01(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //2.获取bean
        Person01 p01 = (Person01) context.getBean("person01");
        System.out.println(p01);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
