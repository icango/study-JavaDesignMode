package designpatterns.createpatten.superfactorypatten.food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.food
 * @Description:
 * @Author: Aix
 * @Date: 2018/7/19 20:01
 * @Version:
 */
public class Meat implements Food {
    @Override
    public void type() {
        System.out.println("Meat smell like so good");
    }
}
