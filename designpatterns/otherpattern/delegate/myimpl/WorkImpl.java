package designpatterns.otherpattern.delegate.myimpl;

import designpatterns.otherpattern.delegate.myhandle.StaffOne;
import designpatterns.otherpattern.delegate.myhandle.StaffTwo;
import designpatterns.otherpattern.delegate.myinterface.Work;

import java.util.HashMap;
import java.util.Map;

/**
 * 委派者---实现接口
 * @author Aix
 * @Title:
 * @Package: designpatterns.otherpattern.delegate.myimpl
 * @Description: 工作接口实现
 * @date 2018/8/23 17:58
 * @Version:
 */
public class WorkImpl implements Work{
    private Map<String,Work> target = new HashMap<>(16);

    /**
     * 委派者委派任务
     */
    public WorkImpl(){
        target.put("任务1",new StaffOne());
        target.put("任务2",new StaffTwo());
    }


    @Override
    public void doing(String task) {
        target.get(task).doing(task);
    }
}
