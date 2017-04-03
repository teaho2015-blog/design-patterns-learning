# 适配器模式

### 是什么？

将一个类的接口转换成客户希望的另外一个接口。Adapter使原本由于接口不兼容的类能够一个工作。

### 结构组成及作用

其实可以从适配器的描述来解释适配器模式的作用。百度百科对适配器的定义是：适配器是一个接口转换器。还有百度百科里给出了一张足以形象的解释适配器（模式）的图。
![baiduBaike_apdater.jpg](baiduBaike_apdater.jpg)

从上图可以看出，其实适配器模式就是让一个对象去弥合两个接口，我们可以将这个现有的类与我们的目标进行适配，最终获得一个符合需要的接口并且包含待复用的类的功能的类。

所以，要明确一点，适配器模式是补救措施，在系统设计过程中一般不会使用该模式。

适配器模式一般有两种：对象适配器和类适配器模式。

下图是对适配器模式定义的uml：

对象适配器
![Adapter(Object) uml diagram](ObjectAdapter.png)
类适配器
![Adapter(Class) uml diagram](ClassAdapter.png)


### 示例实现

java（包括java8）不支持类适配器模式的实现，so，以下是对象适配器模式的实现

《深入浅出设计模式》中提到了一个挺实际的例子，我这里就直接模拟它啦。。

假设我们是客户端，服务端有一段旧代码是这样：
~~~
public <T> Enumeration<T> getEnumeration(T type) {
    Vector<T> vector = new Vector<>();
    //some operation
    return vector.elements();
}
~~~

然后,我们会为了使用它返回的Enumeration，但是，我们得代码都是使用新式的Iterator，那么，就要求我们把返回的Enumeration通过适配器成Iterator。

~~~
/**
 * @author  Lee Boynton
 * @since   JDK1.0
 */
public interface Enumeration<E> {
    boolean hasMoreElements();
    E nextElement();
}
~~~
~~~
//偶遇Josh Bloch一只。。
/**
 * @author  Josh Bloch
 * @see Collection
 * @see ListIterator
 * @see Iterable
 * @since 1.2
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }
}

~~~
适配器如下：
[include:6-](../src/main/java/com/tea/adapter/EnumerationIterator.java)


[完整代码么么哒](https://github.com/teaho2015/design-patterns-learning/tree/master/src/main/java/com/tea/adapter/)。


### 效果及应用场景

在下面的情况下可以考虑使用适配器模式：

 处理旧系统代码时，希望能重用代码或希望能弥合旧系统与新系统的接口。



### references
[1] [百度百科|适配器](http://baike.baidu.com/link?url=aFvL_b7QTew2q_ARkIRK4Osge9kH0j7yzZ9GpBU1kgMX73wrJUL_S23LAXpRRJJz1G7t_UZQz0ZjHE9dQW7Ufi70ApLSyncVU2k-aiFI44vSrIVV7rz6Caj6jGGoV8QZ)
