package designpatterns.createpattern.prototypepattern.currencytype;

import designpatterns.createpattern.prototypepattern.currency.Currency;

/**
 * 扩展抽象类的实体类
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.prototypepattern.currencytype
 * @Description: 美元继承货币接口
 * @date 2018/8/8 19:18
 * @Version:
 */
public class Dollar extends Currency {

    public Dollar(){
        unit = "$";
    }

    @Override
    public void moneyName() {
        System.out.println("this is dollar");
    }
}
