package designpatterns.createpattern.prototypepattern.cache;

import designpatterns.createpattern.prototypepattern.currency.Currency;
import designpatterns.createpattern.prototypepattern.currencytype.Dollar;
import designpatterns.createpattern.prototypepattern.currencytype.Rmb;

import java.util.Hashtable;

/**
 * 缓存实体类
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.prototypepattern.cache
 * @Description: 将扩展后的实体类存入HashTable中
 * @date 2018/8/8 19:22
 * @Version:
 */
public class CurrencyCache {
    private static Hashtable<String, Currency>  currencyTable = new Hashtable<>();

    public static Currency getFaceValue(String faceValue){
        Currency cacheCurrency = currencyTable.get(faceValue);
        return (Currency) cacheCurrency.clone();
    }

    public static void localCache(){
        Rmb rmb = new Rmb();
        rmb.setFaceValue("1");
        currencyTable.put(rmb.getFaceValue(),rmb);

        Dollar dollar = new Dollar();
        dollar.setFaceValue("2");
        currencyTable.put(dollar.getFaceValue(),dollar);
    }
}
