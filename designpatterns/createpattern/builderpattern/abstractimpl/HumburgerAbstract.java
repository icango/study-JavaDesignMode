package designpatterns.createpattern.builderpattern.abstractimpl;

import designpatterns.createpattern.builderpattern.itemimpl.Humburger;
import designpatterns.createpattern.builderpattern.iteminterface.Menu;
import designpatterns.createpattern.builderpattern.iteminterface.Package;

/**
 * 项目接口抽象部分重写--菜单接口
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.abstractimpl
 * @Description: 汉堡抽象
 * @date 2018/8/7 18:25
 * @Version:
 */
public  abstract class HumburgerAbstract implements Menu{

    @Override
    public Package pack() {
        return new Humburger();
    }

}
