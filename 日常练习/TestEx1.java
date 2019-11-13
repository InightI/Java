package com.lx20191113;
//使用try-catch 捕获异常
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestEx1
{
    public static void main(String[] args)
    {
        FileReader reader = null;
        try
        {
            reader = new FileReader("d:/a.txt");
            char c1 = (char)reader.read();
            System.out.println(c1);
        }
        catch(FileNotFoundException e)//子类异常在父类异常前面
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println();
        }
        finally
        {
            try
            {
                if(reader != null)
                reader.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }



    }
}

