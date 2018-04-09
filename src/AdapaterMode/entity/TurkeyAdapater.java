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
public class TurkeyAdapater implements Duck {

    private Turkey turkey;

    public TurkeyAdapater(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
       turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0;i < 5;i++) {
            turkey.fly();
        }
    }
}
