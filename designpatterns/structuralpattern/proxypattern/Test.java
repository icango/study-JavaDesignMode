package designpatterns.structuralpattern.proxypattern;

import designpatterns.structuralpattern.proxypattern.proxy.ProxyImage;
import designpatterns.structuralpattern.proxypattern.proxyinterface.Image;

/**
 * 代理模式测试
 * @author Aix
 * @Title:
 * @Package: designpatterns.structuralpattern.proxypattern
 * @Description:
 * @date 2018/8/23 17:43
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
    }
}
