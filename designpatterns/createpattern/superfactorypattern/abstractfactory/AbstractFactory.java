package designpatterns.createpattern.superfactorypattern.abstractfactory;

import designpatterns.createpattern.superfactorypattern.animal.Animal;
import designpatterns.createpattern.superfactorypattern.food.Food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.abstractfactory
 * @Description: 工厂服务的抽象
 * @Date: 2018/7/19 20:03
 * @Version:
 */
public abstract class AbstractFactory {
    public abstract Animal getAnimal(String animal);
    public abstract Food getFood(String food);
}
