package designpatterns.createpattern.prototypepattern.currency;

/**
 * 实现Cloneable接口
 * @author Aix
 * @Title:
 * @Package: designpatterns.createpattern.prototypepattern.currency
 * @Description: 货币实现Cloneable接口
 * @date 2018/8/8 18:59
 * @Version:
 */
public abstract class Currency implements Cloneable{
    /**
     * 面额
     */
    private String faceValue;
    /**
     * 单位
     */
    protected String unit;

    /**
     * 货币名
     */
    public abstract void moneyName();

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
