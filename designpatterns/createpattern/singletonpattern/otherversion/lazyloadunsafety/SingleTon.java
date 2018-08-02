package designpatterns.createpattern.singletonpattern.otherversion.lazyloadunsafety;

/**
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpatten.singletonpatten.otherversion.lazyloadunsafety
 * @Description: 懒汉式--非线程安全，不支持多线程
 * @date 2018/8/1 17:23
 * @Version:
 */
public class SingleTon {

    /**
     * 创建一个未实例化的对象
     */
    private static SingleTon singleTon;

    /**
     * 构造方法私有化
     */
    private SingleTon(){}

    /**
     * 获取实例化对象
     * @return
     */
    private static SingleTon getInstance(){
        if (singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
