package designpatterns.createpatten.superfactorypatten.abstractfactory;

import designpatterns.createpatten.superfactorypatten.animal.Animal;
import designpatterns.createpatten.superfactorypatten.food.Food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.abstractfactory
 * @Description:
 * @Author: Aix
 * @Date: 2018/7/19 20:03
 * @Version:
 */
public abstract class AbstractFactory {
    public abstract Animal getAnimal(String animal);
    public abstract Food getFood(String food);
}
