package cn.tedu.factory;

import cn.tedu.domain.NetConn;
import org.springframework.beans.factory.FactoryBean;

/**
 * Spring工厂
 */
public class NetConnSpringFactory implements FactoryBean<NetConn> {
    /**
     * 生产目标对象
     */
    @Override
    public NetConn getObject() throws Exception {
        NetConn nc = new NetConn();
        nc.load();
        nc.ping();
        nc.conn();
        return nc;
    }

    /**
     * 获取目标对象类型
     */
    @Override
    public Class<?> getObjectType() {
        return NetConn.class;
    }

    /**
     * 控制创建的对象是否是单例的
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
