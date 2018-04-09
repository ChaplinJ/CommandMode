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
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
