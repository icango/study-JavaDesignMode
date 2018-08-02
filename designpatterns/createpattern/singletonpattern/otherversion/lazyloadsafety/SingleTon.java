package designpatterns.createpattern.singletonpattern.otherversion.lazyloadsafety;

/**
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpatten.singletonpatten.otherversion.lazyloadsafety
 * @Description:  懒汉式--线程安全型，但是效率会下降
 * @date 2018/7/30 17:51
 * @Version:
 */
public class SingleTon {

    /**
     * 创建一个未实例化的对象
     */
    private static SingleTon singleTon;

    /**
     * 构造私有化
     */
    private SingleTon(){}

    /**
     * 获取实例化对象
     * @return
     */
    private static synchronized SingleTon getInstance(){
        if (singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }

}
