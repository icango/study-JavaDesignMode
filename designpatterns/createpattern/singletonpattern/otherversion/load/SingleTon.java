package designpatterns.createpattern.singletonpattern.otherversion.load;

/**
 * 这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpatten.singletonpatten.otherversion.load
 * @Description: 饿汉式
 * @date 2018/8/1 17:28
 * @Version:
 */
public class SingleTon {

    /**
     * 创建实例化对象
     */
    private static SingleTon singleTon = new SingleTon();

    /**
     * 构造方法私有化
     */
    private SingleTon(){}

    /**
     * 返回一个实例化对象
     * @return
     */
    public static SingleTon getSingleTon(){
        return singleTon;
    }
}
