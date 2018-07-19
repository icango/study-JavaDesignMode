package designpatterns.createpatten.superfactorypatten;

import designpatterns.createpatten.superfactorypatten.abstractfactory.AbstractFactory;
import designpatterns.createpatten.superfactorypatten.animal.Animal;
import designpatterns.createpatten.superfactorypatten.animal.Bird;
import designpatterns.createpatten.superfactorypatten.food.Food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten
 * @Description:
 * @Author: Aix
 * @Date: 2018/7/19 20:18
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory animal = FactoryProducer.getFactory("Animal");
        //小鸟
        Animal bird = animal.getAnimal("Bird");
        bird.sport();
        //鱼
        Animal fish = animal.getAnimal("Fish");
        fish.sport();
        //狗
        Animal dog = animal.getAnimal("Dog");
        dog.sport();

        AbstractFactory food = FactoryProducer.getFactory("Food");
        //虫子
        Food bug = food.getFood("Bug");
        bug.type();
        //肉
        Food meat = food.getFood("Meat");
        meat.type();
        //海藻
        Food seaweed = food.getFood("Seaweed");
        seaweed.type();

    }
}
