package cn.tedu.test;

import cn.tedu.domain.NetConn;
import cn.tedu.factory.NetConnInstanceFactory;
import cn.tedu.factory.NetConnStaticFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 工厂方式创建bean
 */
public class Test03 {

    /**
     * Spring工厂方式配置Spring Bean
     *  <bean id="bean的id" class="Spring工厂类的class"/>
     */
    @Test
    public void test06(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //2.获取bean
        NetConn nc = (NetConn) context.getBean("nc");
        nc.sendData();
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 实例工厂方式配置Spring Bean
     *  <bean id="实例工厂id" class="实例工厂类"/>
     *  <bean id="bean的id" factory-bean="用哪个实例工厂" factory-method="的哪个普通方法创建对象"/>
     */
    @Test
    public void test05(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //2.获取bean
        NetConn nc = (NetConn) context.getBean("nc");
        nc.sendData();
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 实例工厂创建nc对象
     */
    @Test
    public void test04(){
        NetConnInstanceFactory ncFactory = new NetConnInstanceFactory();
        NetConn nc = ncFactory.getInstance();
        nc.sendData();
    }

    /**
     * 静态工厂方式配置Spring Bean
     * <bean id="bean的id" class="静态工厂类" factory-method="创建目标对象的静态方法"/>
     */
    @Test
    public void test03(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //2.获取bean
        NetConn nc = (NetConn) context.getBean("nc");
        nc.sendData();
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }


    /**
     * 静态工厂创建nc对象
     */
    @Test
    public void test02(){
        NetConn nc = NetConnStaticFactory.getInstance();
        nc.sendData();
    }

    /**
     * 原生方式创建nc对象
     */
    @Test
    public void test01(){
        NetConn nc = new NetConn();
        nc.load();
        nc.ping();
        nc.conn();

        nc.sendData();
    }
}
