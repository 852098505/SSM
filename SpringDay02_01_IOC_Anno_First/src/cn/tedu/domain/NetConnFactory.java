package cn.tedu.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component //<bean id="netConnFactory" class="cn.tedu.domain.NetConnFactory"/>
public class NetConnFactory {
    @Bean("nc") //<bean id="nc" factory-bean="netConnFactory" factory-method="getInstance"/>
    public NetConn getInstance(){
        NetConn nc = new NetConn();
        nc.read();
        nc.ping();
        nc.conn();
        return nc;
    }
}
