package cn.tedu.test;

import cn.tedu.domain.DaoUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {


    /**
     * SpringIOC创建DaoUtils
     */
    @Test
    public void test02(){
        //1.初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        DaoUtils daoUtils = (DaoUtils) context.getBean("daoUtils");
        daoUtils.insert();
        daoUtils.delete();
        //3.关闭Spring容器
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 手工创建DaoUtils
     */
    @Test
    public void test01(){
        DaoUtils daoUtils = new DaoUtils();
        daoUtils.myInit();

        daoUtils.insert();
        daoUtils.delete();

        daoUtils.myDestory();
    }
}
