package AlgorithmPackage;
/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年04月07日
 */

/**
 * @Description 算法封装模式(example)
 * @author gongchengping
 * @version [版本号, 2018/04/07]
 */
public  abstract  class CaffeineBeverage{
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();
    public abstract void addCondiments();
    public void boilWater() {
        System.out.println("Boiling Water");

    }
    public void pourInCup() {
        System.out.println("Pouring in to cup");
    }
}
