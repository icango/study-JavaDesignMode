package designpatterns.createpattern.facotrypattern;

/**
 * @Title:
 * @Package: designpatterns.createpatten.facotrypatten
 * @Description: 工厂接口实现
 * @Author: Aix
 * @Date: 2018/7/19 11:14
 * @Version:
 */
public class Young implements Shape {
    @Override
    public void draw() {
        System.out.println("Young have drawable");
    }
}
