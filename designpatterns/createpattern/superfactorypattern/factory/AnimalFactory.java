package designpatterns.createpattern.superfactorypattern.factory;

import designpatterns.createpattern.superfactorypattern.abstractfactory.AbstractFactory;
import designpatterns.createpattern.superfactorypattern.animal.Animal;
import designpatterns.createpattern.superfactorypattern.animal.Bird;
import designpatterns.createpattern.superfactorypattern.animal.Dog;
import designpatterns.createpattern.superfactorypattern.animal.Fish;
import designpatterns.createpattern.superfactorypattern.food.Food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.factory
 * @Description: 提供服务
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
