package ui;
import javax.swing.JFrame;

/*
 *游戏窗体
 */
public class GameFrame extends JFrame
{
    public GameFrame()
    {
        //设置标题
        setTitle("只狼");
        //设置大小(宽度,高度)
        setSize(800,800);
        //设置位置居中 (null 相对于屏幕左上角居中)
        setLocationRelativeTo(null);
        //设置玩家不允许改变界面大小
        setResizable(false);
        //设置默认的关闭选项,关闭窗体的时候退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        GameFrame frame = new GameFrame();
        //显示窗体 true 显示    false 隐藏
        frame.setVisible(true);

    }
}
