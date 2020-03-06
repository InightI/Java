package Demo.demo06Interface.demo01.demo04Usb;

public class Computer
{
    public void PowerOn()
    {
        System.out.println("笔记本电脑开机啦!");
    }

    public void PowerOff()
    {
        System.out.println("笔记本电脑关机啦!");
    }

    //使用USB设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb)
    {
        usb.open();//打开设备
        if(usb instanceof Mouse) //先判断的确是鼠标
        {
            Mouse mouse = (Mouse)usb;//向下转型
            mouse.click();
        }
        else if(usb instanceof  KeyBoard) //先判断
        {
            KeyBoard keyBoard = (KeyBoard) usb; //向下转型
            keyBoard.type();
        }

    }
    public void closeDevice(USB usb)
    {
        usb.close();//关闭设备
    }
}
