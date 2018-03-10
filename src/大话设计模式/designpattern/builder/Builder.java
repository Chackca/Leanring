package 大话设计模式.designpattern.builder;
//抽象建造者
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getBuildResult();
}
