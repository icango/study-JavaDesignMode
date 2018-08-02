package designpatterns.createpattern.singletonpattern.otherversion.staticinner;

/**
 * 此单例模式是双检锁的升级版，实现更加简洁
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。
 * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpatten.singletonpatten.otherversion.staticinner
 * @Description: 登记式/静态内部
 * @date 2018/8/2 18:20
 * @Version:
 */
public class SingleTon {

    private static class SingleHolder{
        /**
         * 创建静态实例化对象
         */
        private static final SingleTon singleTon = new SingleTon();
    }

    /**
     * 构造方法私有化
     */
    private SingleTon(){}

    public static final SingleTon getSingleTon(){
        return SingleHolder.singleTon;
    }
}
