package designpatterns.otherpattern.delegate.myhandle;

import designpatterns.otherpattern.delegate.myinterface.Work;

/**
 * 被委派者---执行具体操作
 * @author Aix
 * @Title:
 * @Package: designpatterns.otherpattern.delegate.myhandle
 * @Description: 2号员工
 * @date 2018/8/23 18:05
 * @Version:
 */
public class StaffTwo implements Work{
    @Override
    public void doing(String task) {
        System.out.println("我是2号员工，要做"+task);
    }
}
