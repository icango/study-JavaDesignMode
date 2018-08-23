package designpatterns.behaviorpattern.templatepattern.templateinterface;

/**
 * 模板抽象类
 * @author Aix
 * @Title:
 * @Package: designpatterns.behaviorpattern.templatepattern.templateinterface
 * @Description: 做饭接口
 * @date 2018/8/23 18:48
 * @Version:
 */
public abstract class Cook {
    /**
     * 洗菜
     */
    public abstract void clean();

    /**
     * 切菜
     */
    public abstract void cut();

    /**
     * 烧菜
     */
    public abstract void cookFood();

    /**
     * 做饭步骤
     */
    public final void cooking(){
        clean();
        cut();
        cookFood();
    }

}
