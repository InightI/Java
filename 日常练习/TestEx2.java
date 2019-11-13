package com.lx20191113;
import java.io.FileReader;
import java.io.IOException;

//使用throws声明异常
public class TestEx2
{
    public static void main(String[] args) throws IOException {
     readMyFile();//Main()函数再将异常抛给JRE

    }

    public static void readMyFile() throws IOException { //这里将异常抛给Main()函数
        FileReader reader = null;
        reader = new FileReader("d:/b.txt");
        System.out.println("step1");
        char c1 = (char)reader.read();
        System.out.println(c1);
        if(reader != null)
        {
            reader.close();
        }
    }
}
