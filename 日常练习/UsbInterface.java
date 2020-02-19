package com.codelx1;
interface USB
{
    public void setup(); //安装
    public void work();  //开始工作
}

class SeKiRo
{
   public void plugin(USB usb) //USB 限定
   {
       usb.setup();
       usb.work();
   }
}

class DarkSoul implements USB
{
    public void setup()
    {
        System.out.println("开始安装黑魂");
    }
    public void work()
    {
        System.out.println("开始享受M之旅");
    }

}
public class UsbInterface
{
    public static void main(String[] args)
    {
        SeKiRo skr = new SeKiRo();
        skr.plugin(new DarkSoul());//达成成就，在只狼里玩黑魂
    }
}
