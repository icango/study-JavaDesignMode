package designpatterns.createpattern.builderpattern.Cargo;

import designpatterns.createpattern.builderpattern.abstractimpl.HumburgerAbstract;

/**
 * 具体业务实现
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.Cargo
 * @Description: 鸡肉汉堡
 * @date 2018/8/7 18:49
 * @Version:
 */
public class ChickenBurger extends HumburgerAbstract {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 7;
    }
}
