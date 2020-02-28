package Demo.Demo05Extends.Demo01Extends;
/*
重写(Override): 方法名称一样,参数列表也一样(覆盖,覆写)
重载(OverLoad):方法名称一样,参数列表不一样

方法的覆盖重写特点:创建的是子类,则优先使用子类方法

注意事项:
1. 必须保证父子类之间方法名称相同,参数列表也相同
@Override 写在方法前面,用来检测是不是有效的正确覆盖重写
这个注解就算不写,只要满足要求,也是正确的方法覆盖重写

2. 子类方法的返回值必须[小于等于]父类方法的返回值范围
java.lang.Object 是所有类的公共最高父类,java.lang.String 就是Object的子类

3.子类方法的权限必须大于等于父类方法的权限修饰符
修饰符权限: public > protected > (default) > private
备注: default 不是关键字default ,而是什么都不写,默认留空



 */
public class Demo01Override
{
    public static void main(String[] args)
    {
        Demo03UpWarrior one = new Demo03UpWarrior();
        one.warrior();
        System.out.println("==========");
        Child child = new Child();
    }
}
