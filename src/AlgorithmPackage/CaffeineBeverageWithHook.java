/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年04月07日
 */
package AlgorithmPackage;

/**
 * @author gongchengping
 * @version [版本号, 2018/04/07]
 * @Description 描述代码功能
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsConditments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water");

    }

    public void pourInCup() {
        System.out.println("Pouring in to cup");
    }

    public Boolean customerWantsConditments() {
        return true;
    }
}
