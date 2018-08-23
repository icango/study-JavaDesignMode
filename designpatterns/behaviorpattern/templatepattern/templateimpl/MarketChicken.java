package designpatterns.behaviorpattern.templatepattern.templateimpl;

import designpatterns.behaviorpattern.templatepattern.templateinterface.Cook;

/**
 * 模板实现类
 * @author Aix
 * @Title:
 * @Package: designpatterns.behaviorpattern.templatepattern.templateimpl
 * @Description: 大盘鸡
 * @date 2018/8/23 18:55
 * @Version:
 */
public class MarketChicken extends Cook{
    @Override
    public void clean() {
        System.out.println("洗净鸡肉，土豆");
    }

    @Override
    public void cut() {
        System.out.println("切好鸡肉块和土豆块");
    }

    @Override
    public void cookFood() {
        System.out.println("烹饪大盘鸡");
    }
}
