package designpatterns.structuralpattern.proxypattern.proxyimpl;

import designpatterns.structuralpattern.proxypattern.proxyinterface.Image;

/**
 * 代理接口实现
 * @author Aix
 * @Title:
 * @Package: designpatterns.structuralpattern.proxypattern.proxyimpl
 * @Description: 实体图片
 * @date 2018/8/23 17:09
 * @Version:
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadImage(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示:" +fileName+"图片");
    }

    public void loadImage(String fileName){
        System.out.println("正在加载.."+fileName+"图片");
    }


}
