# 装饰模式

### 是什么？

装饰模式动态地给一个对象添加一些额外的职责。若要扩展功能，装饰模式提供了比继承更灵活的方案。

### 结构组成及作用

下图是wiki百科中对装饰模式定义的UML：
[![Decorator UML diagram](1280px-Decorator_UML_class_diagram.svg.png)](https://en.wikipedia.org/wiki/File:Decorator_UML_class_diagram.svg)
首先，从图中可以看出装饰模式的特性:
1. ConcreteComponent会作为Decorator的属性。
2. Decorator泛化（实现或继承）Component。
3. Component与Decorator是聚合关系，所以一般Component不依赖Decorator，是可以独立存在的。
4. 图中并没声明Component的类型，所以Component可以实现为接口，抽象类，甚至普通父类。

以上我觉得就已经清晰的解构了装饰模式。

**那么，为什么要用装饰模式呢？**
而不是用继承呢？

java.io包是一个广泛应用装饰模式的jdk实现，我直接用它来举例吧。
比如，我在使用FileInputStream读入某文本文件的时候，希望增加一个额外的功能：把输入流内的所有大写字符都转成小写，例如将ABc装成abc。[代码实现](#示例实现)

那么我没道理去修改FileInputStream代码吧？

使用继承重写FileInputStream？这个也不科学，因为
1. 我只是想拓展某个功能（read），而继承这些InputStream去实现我的功能可能会得到了一些我不想要的细节或者东西。
2. 再举个例子（例子可能牵强，暂时先用这个例子吧），比如我需要读文件的同时发送这些字符，我需要写个SendCharInputStream吧，那么后面的这个系统的另一开发者希望发送两次（为了说明结论我也是够拼了。。），难道让他再写一个DoubleSendCharInputStream吗？

所以，由上面的两个问题可以看出装饰模式的优点：
1. **对拓展开放，对修改关闭。**
2. 避免待拓展类暴露一些与拓展该功能无关的细节。

当然，装饰模式的缺点也是有的：
1. 会产生很多小对象。（记得刚学Java看到茫茫多Input和OutStream，当时就有点懵逼了）

### 示例实现

[include:7-](../src/main/java/com/tea/decorator/LowerCaseInputStream.java)

### 效果及应用场景
我认为，当希望以一种透明的拓展性的功能添加给某个对象时，或者当存在大量的各种功能排列组合式的子类时，可以使用装饰模式。

### References
[1][ wiki百科|File:Decorator UML class diagram.svg ](https://en.wikipedia.org/wiki/File:Decorator_UML_class_diagram.svg)
