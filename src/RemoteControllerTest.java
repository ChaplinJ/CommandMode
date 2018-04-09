/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月21日
 */

import Entity.GarageDoor;
import command.GarageDoorOpenCommand;
import Entity.Light;
import command.LightOnCommand;

/**
 * 命令模式的客户
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/03/21]
 */
public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(0,lightOn,lightOn);
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.setCommand(0,garageDoorOpenCommand,garageDoorOpenCommand);
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
    }
}
