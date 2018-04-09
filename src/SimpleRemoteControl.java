/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月21日
 */

import command.NoCommand;
import inter.Command;

/**
 * 调用者
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/03/21]
 */
public class SimpleRemoteControl {

    private Command[] onCommand;
    private Command[] offCommand;


    public SimpleRemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();
        for(int i = 0;i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommand[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommand[slot].execute();
    }

}
