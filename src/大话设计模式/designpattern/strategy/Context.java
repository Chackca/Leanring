package 大话设计模式.designpattern.strategy;

/**
 * 上下文
 * 
 * @author liu yuning
 *
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy) {
    	this.strategy = strategy;
    }
    public void contextInterface() {
    	strategy.algorithmInterface();
    }
}