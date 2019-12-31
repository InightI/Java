package com.lx20191215HttpServer;

import java.util.Scanner;

public class IsShengxiaoYear
{

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份");
        try{ //监听异常
            while(true){
                int birth = input.nextInt()%12; //用户输入%12在再转换
                switch(birth){
                    case 0:System.out.println("猴年");break;
                    case 1:System.out.println("鸡年");break;
                    case 2:System.out.println("狗年");break;
                    case 3:System.out.println("猪年");break;
                    case 4:System.out.println("鼠年");break;
                    case 5:System.out.println("牛年");break;
                    case 6:System.out.println("虎年");break;
                    case 7:System.out.println("兔年");break;
                    case 8:System.out.println("龙年");break;
                    case 9:System.out.println("蛇年");break;
                    case 10:System.out.println("马年");break;
                    case 11:System.out.println("羊年");break;
                    default :System.out.println("错误!请输入大于0的数"); //不满足以上条件的默认输出这个语句
                }
            }
        }
        catch(Exception e){ //捕捉异常
            System.out.println("请正确输入");
            e.printStackTrace(); //打印异常信息在程序中出错的位置及原因
        }
    }
}
