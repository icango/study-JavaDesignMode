package designpatterns.createpattern.prototypepattern.currencytype;

import designpatterns.createpattern.prototypepattern.currency.Currency;

/**
 * 扩展抽象类的实体类
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.prototypepattern.currencytype
 * @Description: 人民币继承货币接口
 * @date 2018/8/8 19:10
 * @Version:
 */
public class Rmb extends Currency{

    public Rmb(){
        unit = "￥";
    }

    @Override
    public void moneyName() {
        System.out.println("this is RMB");
    }
}
