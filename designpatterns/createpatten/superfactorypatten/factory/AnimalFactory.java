package designpatterns.createpatten.superfactorypatten.factory;

import designpatterns.createpatten.superfactorypatten.abstractfactory.AbstractFactory;
import designpatterns.createpatten.superfactorypatten.animal.Animal;
import designpatterns.createpatten.superfactorypatten.animal.Bird;
import designpatterns.createpatten.superfactorypatten.animal.Dog;
import designpatterns.createpatten.superfactorypatten.animal.Fish;
import designpatterns.createpatten.superfactorypatten.food.Food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.factory
 * @Description:动物工厂
 * @Author: Aix
 * @Date: 2018/7/19 20:07
 * @Version:
 */
public class AnimalFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String animal) {
        if (animal != null){
            switch (animal){
                case "Bird":
                    return new Bird();
                case "Dog":
                    return new Dog();
                case "Fish":
                    return new Fish();
                default:
                    break;
            }
        }
        return null;
    }

    @Override
    public Food getFood(String food) {
        return null;
    }
}
