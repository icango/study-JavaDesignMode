package designpatterns.createpattern.superfactorypattern.food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.food
 * @Description: 接口实现
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
