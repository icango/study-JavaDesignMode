package designpatterns.createpattern.builderpattern.itemimpl;

import designpatterns.createpattern.builderpattern.iteminterface.Package;

/**
 * 项目接口实现--包装实现
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.itemimpl
 * @Description: 可乐包装
 * @date 2018/8/7 18:22
 * @Version:
 */
public class Cola implements Package {
    @Override
    public String pack() {
        return "Bottle";
    }
}
