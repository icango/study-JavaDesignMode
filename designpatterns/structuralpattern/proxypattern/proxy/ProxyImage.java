package designpatterns.structuralpattern.proxypattern.proxy;

import designpatterns.structuralpattern.proxypattern.proxyimpl.RealImage;
import designpatterns.structuralpattern.proxypattern.proxyinterface.Image;

/**
 * 代理功能---替代了代理接口实现类
 * @author Aix
 * @Title:
 * @Package: designpatterns.structuralpattern.proxypattern.proxy
 * @Description: 代理图片
 * @date 2018/8/23 17:36
 * @Version:
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
