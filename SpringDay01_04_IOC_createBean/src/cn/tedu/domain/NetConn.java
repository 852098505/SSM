package cn.tedu.domain;

public class NetConn {
    public void load(){
        System.out.println("#加载配置文件..");
    }
    public void ping(){
        System.out.println("#测试网络联通性..");
    }
    public void conn(){
        System.out.println("#连接网络..");
    }
    public void sendData(){
        System.out.println("发送数据..");
    }
}
