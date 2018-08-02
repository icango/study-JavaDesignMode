package designpatterns.createpattern.singletonpattern.otherversion.doublelock;

/**
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpatten.singletonpatten.otherversion.doublelock
 * @Description: 双检锁(DCL : double-checked locking)
 * @date 2018/8/1 17:32
 * @Version:
 */
public class SingleTon {
    /**
     * 创建加锁的实例化对象
     */
    private volatile static SingleTon singleTon ;

    /**
     * 构造方法私有化
     */
    private SingleTon(){}

    /**
     * 返回一个实例化对象
     * @return
     */
    public static SingleTon getSingleTon(){
        if (singleTon == null){
            synchronized (SingleTon.class){
                if (singleTon == null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
