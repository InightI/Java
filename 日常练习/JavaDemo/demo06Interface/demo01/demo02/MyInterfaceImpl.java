package Demo.demo06Interface.demo01.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB
{
    public void methodA()
    {
        System.out.println("实现了A接口的方法");
    }

    @Override
    public void methodB()
    {
        System.out.println("实现了B接口的方法");
    }

    @Override
    public void methodAb()
    {
        System.out.println("实现了AB接口的方法");
    }

    public void methodstatic()
    {
        MyInterfaceA.methodAstatic();
    }
}
