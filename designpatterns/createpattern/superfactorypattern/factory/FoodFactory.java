package designpatterns.createpattern.superfactorypattern.factory;

import designpatterns.createpattern.superfactorypattern.abstractfactory.AbstractFactory;
import designpatterns.createpattern.superfactorypattern.animal.Animal;
import designpatterns.createpattern.superfactorypattern.food.Bug;
import designpatterns.createpattern.superfactorypattern.food.Food;
import designpatterns.createpattern.superfactorypattern.food.Meat;
import designpatterns.createpattern.superfactorypattern.food.Seaweed;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.factory
 * @Description: 提供服务
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
