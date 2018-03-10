package 大话设计模式.designpattern.factory.method;

import 大话设计模式.designpattern.factory.simple.Operation;
import 大话设计模式.designpattern.factory.simple.OperationAdd;
import 大话设计模式.designpattern.factory.simple.OperationDiv;
import 大话设计模式.designpattern.factory.simple.OperationMul;
import 大话设计模式.designpattern.factory.simple.OperationSub;

/**
 * 工厂接口
 * 
 * @author liu yuning
 *
 */
public interface IFactory {
    public Operation createOperation();
}
class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
	return new OperationAdd();
    }
}
class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
	return new OperationSub();
    }
}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationDiv();
    }

}