/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年04月07日
 */
package AlgorithmPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author gongchengping
 * @version [版本号, 2018/04/07]
 * @Description 描述代码功能
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public Boolean customerWantsConditments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with you tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Io error trying to read you answer");
        }
        if (answer == null){
            answer = "no";
        }
        return answer;
    }
}
