package designpatterns.createpattern.builderpattern.itemimpl;

import designpatterns.createpattern.builderpattern.iteminterface.Package;

/**
 * 项目接口--包装实现
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.itemimpl
 * @Description: 汉堡包装
 * @date 2018/8/7 18:20
 * @Version:
 */
public class Humburger implements Package {

    @Override
    public String pack() {
        return "Warpper";
    }
}
