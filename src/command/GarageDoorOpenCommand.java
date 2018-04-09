package command; /**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月21日
 */

import Entity.GarageDoor;
import inter.Command;

/**
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/03/21]
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
