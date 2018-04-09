/**
 * 文件名：
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月23日
 */
package AdapaterMode.entity;

/**
 * @author gongchengping
 * @version [版本号, 2018/03/23]
 * @Description 描述代码功能
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("i'am flying a short distance");
    }
}
