package designpatterns.createpattern.facotrypattern;

/**
 * @Title:
 * @Package: designpatterns.createpatten.facotrypatten
 * @Description:
 * @Author: Aix
 * @Date: 2018/7/19 19:30
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //成年人
        Shape shapeAdult = shapeFactory.getShape("Adult");
        shapeAdult.draw();
        //年輕人
        Shape shapeYoung = shapeFactory.getShape("Young");
        shapeYoung.draw();
        //兒童
        Shape shapeChild = shapeFactory.getShape("Children");
        shapeChild.draw();
    }
}
