package designpatterns.createpatten.superfactorypatten.food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.food
 * @Description:海藻
 * @Author: Aix
 * @Date: 2018/7/19 19:59
 * @Version:
 */
public class Seaweed implements Food{

    @Override
    public void type() {
        System.out.println("Seaweed smell no nasty taste");
    }
}
