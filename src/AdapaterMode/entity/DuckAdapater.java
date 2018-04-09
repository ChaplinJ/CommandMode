/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月23日
 */
package AdapaterMode.entity;

/**
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/03/23]
 */
public class DuckAdapater implements Turkey {

    private Duck duck;

    public DuckAdapater(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
