package cn.tedu.test;

import cn.tedu.web.TestServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestServlet testServlet = (TestServlet) context.getBean("testServlet");
        testServlet.test();
        ((ClassPathXmlApplicationContext)context).close();
    }

}
