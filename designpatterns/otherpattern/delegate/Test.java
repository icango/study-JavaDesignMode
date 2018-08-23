package designpatterns.otherpattern.delegate;

import designpatterns.otherpattern.delegate.myimpl.WorkImpl;

/**
 * 委派模式测试
 * @author Aix
 * @Title:
 * @Package: designpatterns.otherpattern.delegate
 * @Description:
 * @date 2018/8/23 18:10
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        new WorkImpl().doing("任务1");
    }
}
