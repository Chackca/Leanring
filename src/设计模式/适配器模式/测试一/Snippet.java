package 设计模式.适配器模式.测试一;

public class Snippet {
	// 测试类public class Client {  
	public static void main(String[] args) {  
	    // 使用普通功能类  
	    Target concreteTarget = new ConcreteTarget();  
	    concreteTarget.request();  
	       
	    // 使用特殊功能类，即适配类  
	    Target adapter = new Adapter();  
	    adapter.request();  
	 }  
}  


