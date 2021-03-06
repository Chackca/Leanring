package 大话设计模式.designpattern.state;

/**
 * 抽象状态类
 * 
 * @author liu yuning
 *
 */
//抽象状态类
public abstract class State {
    public abstract void handle(Context context);
}

class ConcreteStateA extends State {
    public void handle(Context context) {
	    System.out.println("现在是在状态A");
	    context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB extends State {
    public void handle(Context context) {
	    System.out.println("现在是在状态B");
	    context.setState(new ConcreteStateC());
    }
}

class ConcreteStateC extends State {
    public void handle(Context context) {
	    System.out.println("现在是在状态C");
	    context.setState(new ConcreteStateA());
    }
}
