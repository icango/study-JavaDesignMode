package designpatterns.createpattern.superfactorypattern.food;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.food
 * @Description: 接口实现
 * @Author: Aix
 * @Date: 2018/7/19 19:57
 * @Version:
 */
public class Bug implements Food {
    @Override
    public void type() {
        System.out.println("Bug smell like shit");
    }
}
