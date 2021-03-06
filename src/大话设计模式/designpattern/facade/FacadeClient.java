package 大话设计模式.designpattern.facade;

/**
 * 外观类客户端
 * 
 * @author liu yuning
 *
 */
public class FacadeClient {
/* 由于Facade的作用，客户端可以根本不知道四个子系统的存在
启发：维护一个遗留的大型系统时，可能这个系统已经非常难以维护和
扩展了，此时可以为新系统开发一个外观Facade类，来提供设
计粗糙或高度复杂的遗留代码的比较清晰简单的接口，让新系统
与Facade对象交互，Facade与遗留代码交互所有复杂的工作
*/  public static void main(String[] args) {
	Facade facade = new Facade();
	facade.methodA();
	facade.methodB();
    }
}
