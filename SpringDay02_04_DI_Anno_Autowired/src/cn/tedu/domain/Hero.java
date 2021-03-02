package cn.tedu.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hero {

    /*
       @Autowired
        先按类型寻找，如果找到唯一的就注入
        如果找不到或者找到多个则开始按照id注入 默认以属性名作为id来使用
        找到唯一的就注入，找不到则抛出异常，不可能找到多个
       @Qualifier
        配合@Autowired使用，一旦配置，则不再按照类型匹配，直接按照id匹配
        找到唯一就注入，找不到抛异常，不可能找到多个
     */
    @Autowired
    @Qualifier("dog")
    private Dog dog;

    @Override
    public String toString() {
        return "Hero{" +
                "dog=" + dog +
                '}';
    }
}
