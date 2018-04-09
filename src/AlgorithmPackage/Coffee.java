/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年04月07日
 */
package AlgorithmPackage;

/**
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/04/07]
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("dripping the coffee through filter");
    }

    @Override
    public void addCondiments() {

        System.out.println("Adding sugar and milk");
    }
}
