package Demo.demo06Interface.demo01.demo04Usb;



public class UsbMain
{
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.PowerOn();
        //准备一个鼠标

        USB usbMouse = new Mouse();//多态,向上转型
        KeyBoard keyBoard = new KeyBoard();//正确写法,没有使用多态

        System.out.println("=====================");
        //参数需要的是USB,刚好传进去的就是USB类型
        computer.useDevice(usbMouse);
        computer.closeDevice(usbMouse);

        //方法参数是USB(接口)类型,传递进去的是实现类对象
        System.out.println("====================");
        computer.useDevice(keyBoard);
        computer.closeDevice(keyBoard);
        System.out.println("=======================");

        //使用了匿名对象
      //  computer.useDevice(new KeyBoard());

        computer.PowerOff();

    }
}
