package Demo.demo06Interface.demo01.demo04Usb;
//鼠标
public class Mouse implements USB
{
    @Override
    public void open()
    {
        System.out.println("打开鼠标");
    }

    @Override
    public void close()
    {
        System.out.println("关闭鼠标");
    }

    public void click()
    {
        System.out.println("点击鼠标");
    }
}
