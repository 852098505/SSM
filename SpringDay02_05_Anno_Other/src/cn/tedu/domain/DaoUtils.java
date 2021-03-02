package cn.tedu.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component //<bean id="daoUtils" class="cn.tedu.domain.DaoUtils" init-method="myInit" destory-method="myDestory"/>
public class DaoUtils {
    @PostConstruct //配置初始化方法
    public void myInit(){
        System.out.println("#创建连接..");
    }
    public void insert(){
        System.out.println("新增..");
    }
    public void delete(){
        System.out.println("删除..");
    }
    @PreDestroy //配置销毁方法
    public void myDestory(){
        System.out.println("#销毁连接..");
    }
}
