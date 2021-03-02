package cn.tedu.factory;

import cn.tedu.domain.NetConn;

/**
 * 静态工厂
 *  构造器私有化 提供静态的生产目标对象的方法
 */
public class NetConnStaticFactory {
    private NetConnStaticFactory(){}

    public static NetConn getInstance(){
        NetConn nc = new NetConn();
        nc.load();
        nc.ping();
        nc.conn();
        return nc;
    }
}
