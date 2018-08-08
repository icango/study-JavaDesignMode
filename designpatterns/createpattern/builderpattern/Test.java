package designpatterns.createpattern.builderpattern;

import designpatterns.createpattern.builderpattern.assemblyoperation.MealAssembly;
import designpatterns.createpattern.builderpattern.assemblyoperation.MealImpl;

/**
 * 建造者模式测试
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern
 * @Description:
 * @date 2018/8/8 18:34
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        MealImpl mealImpl = new MealImpl();
        MealAssembly mealAssembly = mealImpl.chickenMeal();
        mealAssembly.showMenu();
        System.out.println("总价："+mealAssembly.getCost());
    }
}
