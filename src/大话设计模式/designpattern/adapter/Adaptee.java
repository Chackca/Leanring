package 大话设计模式.designpattern.adapter;

/**
 * 需要适配的类
 * 
 * @author liu yuning
 *
 */
//需要适配的类
public class Adaptee {
    public void specificRequest() {
	System.out.println("特殊的请求！");
    }
}
