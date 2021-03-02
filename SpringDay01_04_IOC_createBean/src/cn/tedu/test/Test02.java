package cn.tedu.test;

import cn.tedu.domain.Person02;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    /**
     * Spring创建对象的方式
     *      如果类没有无参构造器 容器初始化时将会报错
     *      此时可以在<bean>标签内部通过<constructor-arg>标签指定构造器参数
     *      命令Spring通过指定带参构造器创建对象
     */
    @Test
    public void test01(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //2.获取bean
        Person02 p02 = (Person02) context.getBean("person02");
        System.out.println(p02);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
