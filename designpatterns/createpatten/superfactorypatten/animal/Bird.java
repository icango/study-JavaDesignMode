package designpatterns.createpatten.superfactorypatten.animal;

/**
 * @Title:
 * @Package: designpatterns.createpatten.superfactorypatten.animal
 * @Description:
 * @Author: Aix
 * @Date: 2018/7/19 19:52
 * @Version:
 */
public class Bird implements Animal{

    @Override
    public void sport() {
        System.out.println("Bird can fly");
    }
}
