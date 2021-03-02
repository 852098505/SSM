package cn.tedu.test;

import cn.tedu.domain.Hero;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    /**
     * 注解方式实现DI - 自定义bean注入
     */
    @Test
    public void test01(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        Hero hero = (Hero) context.getBean("hero");
        System.out.println(hero);
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
