package util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.HashSet;
import java.util.Set;

public class PinyinUtil
{
    //中文字符格式
    private static final String CHINESE_PATTERN = "[\\u4E00-\\u9FA5]"; //pinyin4j库里的汉语拼音范围

    //汉语拼音格式化类
    private static final HanyuPinyinOutputFormat FORMAT = new HanyuPinyinOutputFormat();

    static
    {
        //设置拼音小写
        FORMAT.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        //设置不带音调
        FORMAT.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        //设置v(绿)
        FORMAT.setVCharType(HanyuPinyinVCharType.WITH_V);
    }

    public  static boolean containsChinese(String name) //检测是否含有汉语拼音
    {

        // .表示任意一个字符, * 表示0个或多个
        return name.matches(".*" + CHINESE_PATTERN + ".*");//表示任意字符中有拼音就算匹配成功,即包含汉语拼音
    }



    /**
     * 通过文件名获取全拼+拼音首字母
     * 好好学习--->haohaoxuexi/hhxx
     * @param name 文件名
     * @return 拼音全拼字符串+拼音首字母字符串 数组
     */
    public static String[] get(String name)
    {
        String[] result = new String[2];
        StringBuilder pinyin = new StringBuilder(); //全拼
        StringBuilder pinyinFirst = new StringBuilder();//拼音首字母

        for(char c : name.toCharArray())
        {
            try
            {
                String [] pinyins = PinyinHelper.toHanyuPinyinStringArray(c, FORMAT);
                if(pinyins == null || pinyins.length == 0)
                {
                    pinyin.append(c);
                    pinyinFirst.append(c);
                }
                else
                {
                    pinyin.append(pinyins[0]); //全拼 和 he
                    pinyinFirst.append(pinyins[0].charAt(0)); //拼音首字母 和 h
                }
            }
            catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination)
            {
                badHanyuPinyinOutputFormatCombination.printStackTrace();
                pinyin.append(c);
                pinyinFirst.append(c);
            }
        }
        result[0] = pinyin.toString();
        result[1] = pinyinFirst.toString();
        return result;
    }



    //字符串数组去重操作
    public static String[] unique(String[] array, boolean fullSpell)
    {
        Set<String> set = new HashSet<>();
        for(String s: array)
        {
            if(fullSpell)
            {
                set.add(s);
            }
            else
            {
                set.add(String.valueOf(s.charAt(0)));//放入拼音首字母
            }
        }
        return set.toArray(new String[set.size()]);
    }



    /**
     * 合并两个拼音数组为一个
     * @param pinyins1 [xue]
     * @param pinyins2 [xi]
     * @return [xuexi]
     */
    public static String[] compose(String[] pinyins1, String[] pinyins2)
    {
        String[] result = new String[pinyins1.length * pinyins2.length];
        for(int i = 0; i < pinyins1.length; i++)
        {
            for(int j = 0; j < pinyins2.length; j++)
            {
                result[i * pinyins2.length + j] = pinyins1[i] + pinyins2[j];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        String [] str1 = {"xue"};
        String [] str2 = {"xi"};
        String []str3 = compose(str1,str2);
        for(int i = 0; i < str3.length; i++)
        {
            System.out.println(str3[i]);
        }
    }




}
