package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util
{
    public static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss"; //时间格式

    public static String parseSize(long size)
    {
        String[] capacity = {"B","KB","MB","GB"}; //文件大小
        int index = 0;
        while(size > 1024 && index < capacity.length - 1)
        {
            size /= 1024;
            index++;
        }
        return size + capacity[index];
    }

    public static String parseDate(Date lastModified)
    {
        return new SimpleDateFormat(DATE_PATTERN).format(lastModified);
    }

}
