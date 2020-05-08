package interviewWork;
//最长回文子串,中心扩展法
public class LengthABAstr
{
    public static  String longestPalindrome(String s ) {
        // 判断s是不是空字符串或长度等于0
        if (s == null || s.length() == 0) {
            // 如果是，则返回空字符串。
            return "";
        }
        // 定义数组长度
        int strLen = s.length();
        // 初始左边元素序号为0
        int left = 0;
        // 初始右边元素序号为0
        int right = 0;
        // 每个位置向两边扩散都会出现窗口大小，这里定义初始大小为1
        int len = 1;
        // 令最大回文字符串的起始位置为0
        int maxStart = 0;
        // 初始最大回文字符串长度为0
        int maxLen = 0;

        //下面几个代码块，一旦出现两个字母相同的情况，就进行关键延申！！！

        // 从0开始遍历，如果i小于数组的长度，则一直循环下去。
        for (int i = 0; i < strLen; i++) {
            // 左边向左
            left = i - 1 ;
            // 右边向右
            right = i + 1;

            // charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
            // 当左侧元素对应序号大于等于0，同时当左侧元素对应的字符串等于i对应的元素字符串时：
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                // 更新len，窗口大小加1。
                len++;
                // 再使left往左移。
                left--;
            }

            // 当右侧元素序号小于字符串长度，同时当右侧元素对应的字符串等于i对应的元素字符串时：
            while (right < strLen && s.charAt(right) == s.charAt(i)) {
                // 更新len，窗口大小加1.
                len++;
                // 再使right往右移。
                right++;
            }

            // 当左侧元素对应序号大于等于0，同时右侧元素序号小于字符串长度，同时左侧元素对应字符串等于右侧元素对应字符串时：
            // 注意，当上两块代码块运行后，导致left或right改变时，这一块代码块的left和right的值，也要注意改变！！！
            while (left >= 0 && right < strLen && s.charAt(right) == s.charAt(left)) {
                // 更新窗口大小，窗口大小加2。
                len = len + 2;
                // 再使left向左移
                left--;
                // 再使right向右移。
                right++;
            }

            // 判断窗口大小是否大于最大回文字符串长度
            if (len > maxLen) {
                // 如果是则：令最大回文字符串长度等于窗口大小。
                maxLen = len;
                // 令最大回文字符串起始位置为left对应序号。
                maxStart = left;
            }

            // 令len窗口大小为1
            len = 1;
        }
        // substring() 方法:返回字符串的子字符串。
        // 子字符串，起始序号为 maxStart + 1 (最大回文字符串的起始位置 + 1 ）, 终止序号为 maxStart + maxLen + 1 （最大回文字符串的起始位置 + 最大回文字符串的长度 + 1）.
        return s.substring(maxStart + 1, maxStart + maxLen + 1);

    }

}





