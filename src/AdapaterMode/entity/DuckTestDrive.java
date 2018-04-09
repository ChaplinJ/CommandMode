/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月23日
 */
package AdapaterMode.entity;

import java.math.BigDecimal;

/**
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/03/23]
 */
public class DuckTestDrive {
    public static void main(String[] args) {

        Double amout = 0.01;
        BigDecimal surplusMoney =  new BigDecimal(0.01).subtract(new BigDecimal(amout));
        System.out.println(surplusMoney.doubleValue());
        int recharge = new BigDecimal(new BigDecimal(99.99).doubleValue() + "").multiply(new BigDecimal("100")).intValue();
        System.out.println(recharge);
        BigDecimal a = new BigDecimal(99.98);
        System.out.println(a.doubleValue() + "");
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
