package cn.tedu.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hero {
    @Value("${hname}")//@Value("亚瑟")
    private String name;
    @Value("${hage}")//@Value("44")
    private int age;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
