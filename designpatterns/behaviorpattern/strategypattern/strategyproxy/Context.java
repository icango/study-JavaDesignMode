package designpatterns.behaviorpattern.strategypattern.strategyproxy;

import designpatterns.behaviorpattern.strategypattern.strategyinface.People;

/**
 * 策略代理
 * @author Aix
 * @Title:
 * @Package: designpatterns.behaviorpattern.strategypattern.strategyproxy
 * @Description: 任务代理
 * @date 2018/8/23 18:35
 * @Version:
 */
public class Context {
    private People people;

    public Context(People people){
        this.people = people;
    }

    public void doSomething(){
        people.doSomething();
    }
}
