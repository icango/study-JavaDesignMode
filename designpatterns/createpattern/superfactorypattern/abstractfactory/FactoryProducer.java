package designpatterns.createpattern.superfactorypattern.abstractfactory;

import designpatterns.createpattern.superfactorypattern.factory.AnimalFactory;
import designpatterns.createpattern.superfactorypattern.factory.FoodFactory;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten
 * @Description: 工厂生产器
 * @Author: Aix
 * @Date: 2018/7/19 20:14
 * @Version:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if (factory != null){
            if ("Animal".equals(factory)){
                return new AnimalFactory();
            }else if ("Food".equals(factory)){
                return new FoodFactory();
            }
        }
        return null;
    }
}
