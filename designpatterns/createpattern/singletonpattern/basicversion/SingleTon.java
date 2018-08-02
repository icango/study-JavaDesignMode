package designpatterns.createpattern.singletonpattern.basicversion;


/**
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpatten.singletonpatten.basicversion
 * @Description: 单例模式-基础版
 * @date 2018/7/30 15:32
 * @Version:
 */
public class SingleTon {
    /**
     * 实例化一个对象
     */
    private static SingleTon singleTon = new SingleTon();

    /**
     * 构造方法私有化
     */
    private SingleTon(){}

    /**
     * 获取实例化对象
     * @return
     */
    public static SingleTon getInstance(){
        return singleTon;
    }

    public void showInfo(){
        System.out.println("我已被调用");
    }
}
