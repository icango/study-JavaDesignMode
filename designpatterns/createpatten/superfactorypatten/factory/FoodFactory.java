package designpatterns.createpatten.superfactorypatten.factory;

import designpatterns.createpatten.superfactorypatten.abstractfactory.AbstractFactory;
import designpatterns.createpatten.superfactorypatten.animal.Animal;
import designpatterns.createpatten.superfactorypatten.food.Bug;
import designpatterns.createpatten.superfactorypatten.food.Food;
import designpatterns.createpatten.superfactorypatten.food.Meat;
import designpatterns.createpatten.superfactorypatten.food.Seaweed;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.factory
 * @Description:食物工厂
 * @Author: Aix
 * @Date: 2018/7/19 20:10
 * @Version:
 */
public class FoodFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String animal) {
        return null;
    }

    @Override
    public Food getFood(String food) {
        if (food != null){
            switch (food){
                case "Bug":
                    return new Bug();
                case "Meat":
                    return new Meat();
                case "Seaweed":
                    return new Seaweed();
                default:
                    break;
            }
        }
        return null;
    }
}
