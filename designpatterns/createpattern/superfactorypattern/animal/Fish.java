package designpatterns.createpattern.superfactorypattern.animal;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.animal
 * @Description: 接口实现
 * @Author: Aix
 * @Date: 2018/7/19 19:53
 * @Version:
 */
public class Fish implements Animal {
    @Override
    public void sport() {
        System.out.println("Fish can swwing");
    }
}
