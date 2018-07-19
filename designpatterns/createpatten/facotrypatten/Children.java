package designpatterns.createpatten.facotrypatten;

/**
 * @Title:
 * @Package: designpatterns.createpatten.facotrypatten
 * @Description:儿童
 * @Author: Aix
 * @Date: 2018/7/19 11:15
 * @Version:
 */
public class Children implements Shape {
    @Override
    public void draw() {
        System.out.println("Children have drawable");
    }
}
