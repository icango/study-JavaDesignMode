package designpatterns.createpatten.facotrypatten;

/**
 * @Title:
 * @Package: designpatterns.createpatten.facotrypatten
 * @Description:分享工厂
 * @Author: Aix
 * @Date: 2018/7/19 11:16
 * @Version:
 */
public class ShapeFactory {

    /**
     * 获取分享
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        switch (shapeType){
            case "Adult":
                return new Adult();
            case "Young":
                return new Young();
            case "Children":
                return new Children();
            default:
                break;
        }
        return null;
    }
}
