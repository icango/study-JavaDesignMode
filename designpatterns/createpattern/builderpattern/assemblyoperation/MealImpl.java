package designpatterns.createpattern.builderpattern.assemblyoperation;

import designpatterns.createpattern.builderpattern.Cargo.ChickenBurger;
import designpatterns.createpattern.builderpattern.Cargo.IceCola;
import designpatterns.createpattern.builderpattern.Cargo.LemonCola;

/**
 * 业务组合实现
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.assemblyoperation
 * @Description:  套餐组合实现
 * @date 2018/8/7 19:04
 * @Version:
 */
public class MealImpl {

    /**
     * 鸡肉堡套餐
     * @return
     */
    public MealAssembly chickenMeal(){
        MealAssembly mealAssembly = new MealAssembly();
        mealAssembly.addMenu(new ChickenBurger());
        mealAssembly.addMenu(new IceCola());
        return mealAssembly;
    }

    /**
     * 可乐套餐
     * @return
     */
    public MealAssembly doubleDrink(){
        MealAssembly mealAssembly = new MealAssembly();
        mealAssembly.addMenu(new IceCola());
        mealAssembly.addMenu(new LemonCola());
        return mealAssembly;
    }
}
