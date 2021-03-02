package cn.tedu.factory;

import cn.tedu.domain.NetConn;

/**
 * 实例工厂
 *      构造器不要私有化 提供普通方法创建目标对象实例
 */
public class NetConnInstanceFactory {

    public NetConn getInstance(){
        NetConn nc = new NetConn();
        nc.load();
        nc.ping();
        nc.conn();
        return nc;
    }

}
