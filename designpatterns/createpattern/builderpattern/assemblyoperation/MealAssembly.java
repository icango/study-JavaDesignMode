package designpatterns.createpattern.builderpattern.assemblyoperation;

import designpatterns.createpattern.builderpattern.iteminterface.Menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务组装
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.assemblyoperation
 * @Description: 套餐组装
 * @date 2018/8/7 18:56
 * @Version:
 */
public class MealAssembly {
    private List<Menu> meal = new ArrayList<>();

    /**
     * 添加餐品
     * @param menu
     */
    public void addMenu(Menu menu){
        meal.add(menu);
    }

    /**
     * 套餐价格
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Menu menu : meal){
            cost += menu.price();
        }
        return cost;
    }

    /**
     * 显示套餐信息
     */
    public void showMenu(){
        for (Menu menu : meal){
            System.out.println(menu.name());
            System.out.println(menu.pack().pack());
            System.out.println(menu.price());
        }
    }
}
