package 大话设计模式.designpattern.adapter;

/**
 * 适配器客户端
 * 
 * @author liu yuning
 *
 */
//适配器客户端
public class AdapterClient {
	public static void main(String[] args) {
		Target target;
		target = new Adapter();
		target.request();
	}
}
