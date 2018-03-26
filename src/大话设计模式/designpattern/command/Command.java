package 大话设计模式.designpattern.command;

import java.util.List;

/**
 * 用来声明执行操作的接口
 * 
 * @author liu yuning
 *
 */
//用来声明执行操作的接口
public abstract class Command {
    protected Reciever reciever;
    public Command(Reciever reciever) {
	    this.reciever = reciever;
    }

    public abstract void execute();
}

// 将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现execute
class ConcreteCommand extends Command {
    public ConcreteCommand(Reciever reciever) {
	    super(reciever);
    }
    @Override
    public void execute() {
        reciever.action();
    }
}
