package designpatterns.behaviorpattern.templatepattern;

import designpatterns.behaviorpattern.templatepattern.templateimpl.MarketChicken;
import designpatterns.behaviorpattern.templatepattern.templateinterface.Cook;

/**
 * 模板模式测试
 * @author Aix
 * @Title:
 * @Package: designpatterns.behaviorpattern.templatepattern
 * @Description: 做饭
 * @date 2018/8/23 19:07
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        Cook cook = new MarketChicken();
        cook.cooking();
    }
}
