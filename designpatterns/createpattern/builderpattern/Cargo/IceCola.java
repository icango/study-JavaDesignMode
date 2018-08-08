package designpatterns.createpattern.builderpattern.Cargo;

import designpatterns.createpattern.builderpattern.abstractimpl.ColaAbstract;

/**
 * 具体业务实现
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.Cargo
 * @Description: 冰可乐
 * @date 2018/8/7 18:51
 * @Version:
 */
public class IceCola extends ColaAbstract{
    @Override
    public String name() {
        return "冰阔落";
    }

    @Override
    public float price() {
        return 3;
    }
}
