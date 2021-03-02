package cn.tedu.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
public class Hero {
    @Value("#{@l1}")
    private List list;
    @Value("#{@s1}")
    private Set set;
    @Value("#{@m1}")
    private Map map;
    @Value("#{@p1}")
    private Properties props;

    @Override
    public String toString() {
        return "Hero{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", props=" + props +
                '}';
    }
}
