package designpatterns.otherpattern.delegate.myhandle;

import designpatterns.otherpattern.delegate.myinterface.Work;

/**
 * 被委派者---执行具体操作
 * @author Aix
 * @Title:
 * @Package: designpatterns.otherpattern.delegate.myhandle
 * @Description:  1号员工
 * @date 2018/8/23 18:04
 * @Version:
 */
public class StaffOne implements Work{
    @Override
    public void doing(String task) {
        System.out.println("我是1号员工，要做"+task);
    }
}
