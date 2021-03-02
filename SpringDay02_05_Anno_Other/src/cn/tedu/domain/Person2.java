package cn.tedu.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 懒加载
 */
@Component //<bean id="person" class="cn.tedu.domain.Person" lazy-init="true"/>
@Lazy
public class Person2 {
    public Person2(){
        System.out.println("#Person2..init.."+this);
    }
}
