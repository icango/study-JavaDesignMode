package designpatterns.createpattern.prototypepattern;

import designpatterns.createpattern.prototypepattern.cache.CurrencyCache;
import designpatterns.createpattern.prototypepattern.currency.Currency;

/**
 * 原型模式测试
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.prototypepattern
 * @Description:
 * @date 2018/8/8 19:34
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        CurrencyCache.localCache();

        Currency cloneCurrency1 = CurrencyCache.getFaceValue("1");
        System.out.println("RMB:"+cloneCurrency1.getUnit());

        Currency cloneCurrency2 = CurrencyCache.getFaceValue("2");
        System.out.println("DOLLAR:"+cloneCurrency2.getUnit());
    }
}
