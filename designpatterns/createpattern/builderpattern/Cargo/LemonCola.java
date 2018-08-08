package designpatterns.createpattern.builderpattern.Cargo;

import designpatterns.createpattern.builderpattern.abstractimpl.ColaAbstract;

/**
 * 具体业务实现
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.builderpattern.Cargo
 * @Description: 柠檬可乐
 * @date 2018/8/7 18:53
 * @Version:
 */
public class LemonCola extends ColaAbstract {
    @Override
    public String name() {
        return "柠檬阔落";
    }

    @Override
    public float price() {
        return 4;
    }
}
