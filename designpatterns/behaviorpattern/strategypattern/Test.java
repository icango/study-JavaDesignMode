package designpatterns.behaviorpattern.strategypattern;

import designpatterns.behaviorpattern.strategypattern.strategyimpl.EatFood;
import designpatterns.behaviorpattern.strategypattern.strategyimpl.GoSleep;
import designpatterns.behaviorpattern.strategypattern.strategyimpl.Study;
import designpatterns.behaviorpattern.strategypattern.strategyinface.People;
import designpatterns.behaviorpattern.strategypattern.strategyproxy.Context;

/**
 * 策略模式测试
 * @author Aix
 * @Title:
 * @Package: designpatterns.behaviorpattern.strategypattern
 * @Description: 人活动的策略
 * @date 2018/8/23 18:38
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        Context context1 = new Context(new EatFood());
        context1.doSomething();
        Context context2 = new Context(new GoSleep());
        context2.doSomething();
        Context context3 = new Context(new Study());
        context3.doSomething();
    }
}
