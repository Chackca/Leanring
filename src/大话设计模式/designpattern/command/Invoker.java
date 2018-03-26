package 大话设计模式.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 要求该命令执行这个请求
 * 
 * @author liu yuning
 *
 */
//要求该命令执行这个请求
public class Invoker {
    private List<Command> list = new ArrayList();

    //private Command command;
    public void addCommand(Command command) {
        list.add(command);
        //this.command = command;
    }
    public void executeCommand() {
        for (Command command:list) {
            command.execute();
        }
    }
}
