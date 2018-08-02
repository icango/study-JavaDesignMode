package designpatterns.createpattern.singletonpattern.basicversion;

/**
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpatten.singletonpatten.basicversion
 * @Description: 单例模式-基础版测试
 * @date 2018/7/30 15:50
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        singleTon.showInfo();
    }

}
