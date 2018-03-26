package 大话设计模式.designpattern.iterator;

/**
 * 聚集接口
 * 
 * @author liu yuning
 *
 * @param <T>
 */

//聚集接口
public interface Aggregate<T> {
    public Iterator<T> createIterator();
}
