package Simple;

/**
 * @Classname FactoryModeTest
 * @Description TODO
 * @Date 2025/4/3 20:24
 * @Created by Song zuo gang
 */
public class FactoryModeTest {


    //工厂模式测试类
    public static void main(String[] args) {
        //1.先创建一个工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        //2.根据不同的名称获取不同的形状（父类引用指向子类对象）
        Shape shape = shapeFactory.getShape("circle");
        //3.调用不同的形状的实现方法
        shape.draw();
    }


}
