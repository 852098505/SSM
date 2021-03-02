package cn.tedu.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 单例 多例
 *  singletone
 *  prototype
 */
@Component //<bean id="person" class="cn.tedu.domain.Person" scope="prototype"/>
@Scope("prototype")
public class Person {
}
