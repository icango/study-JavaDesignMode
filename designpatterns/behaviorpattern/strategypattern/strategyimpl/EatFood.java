package designpatterns.behaviorpattern.strategypattern.strategyimpl;

import designpatterns.behaviorpattern.strategypattern.strategyinface.People;

/**
 * 策略
 * @author Aix
 * @Title:
 * @Package: designpatterns.behaviorpattern.strategypattern.strategyimpl
 * @Description: 进食
 * @date 2018/8/23 18:28
 * @Version:
 */
public class EatFood implements People {
    @Override
    public void doSomething() {
        System.out.println("Oops! I am eating");
    }
}
