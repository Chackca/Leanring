package 设计模式.适配器模式.测试一;
// 已存在的、具有特殊功能、但不符合我们既有的标准接口的类  
class Adaptee {  
    public void specificRequest() {  
        System.out.println("被适配类具有 特殊功能，但是不符合既有标准接口的类...");  
    }  
}  