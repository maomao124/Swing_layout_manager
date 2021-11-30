import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing布局管理器
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 14:09
 * Version(版本): 1.0
 * Description(描述)：
 * CardLayout（卡片布局管理器）能够帮助用户实现多个成员共享同一个显不空间，并且一次只显示一个容器组件的内容。
 * CardLayout 布局管理器将容器分成许多层，每层的显示空间占据整个容器的大小，但是每层只允许放置一个组件。
 * CardLayout()：构造一个新布局，默认间隔为 0。
 * CardLayout(int hgap, int vgap)：创建布局管理器，并指定组件间的水平间隔（hgap）和垂直间隔（vgap）。
 */

public class test2
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试2");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(640, 480);
        jFrame.setLocation(300, 300);
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel cards = new JPanel(new CardLayout());       //卡片布局
        jPanel1.setBackground(new Color(100,245,100));
        jPanel2.setBackground(new Color(245,245,1));
        jPanel1.add(new JButton("登录"));
        jPanel1.add(new JButton("注册"));
        jPanel1.add(new JButton("找回密码"));
        jPanel2.add(new JTextField("用户名文本框", 40));
        jPanel2.add(new JTextField("密码文本框", 40));
        jPanel2.add(new JTextField("验证码文本框", 40));
        cards.add(jPanel1, "面板1");
        cards.add(jPanel2, "面板2");
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, "面板2");
        jFrame.add(cards);
        jFrame.setVisible(true);

    }
}
