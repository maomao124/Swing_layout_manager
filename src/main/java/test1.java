import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing布局管理器
 * Package(包名): PACKAGE_NAME
 * Class(类名): test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 13:55
 * Version(版本): 1.0
 * Description(描述)： 流式布局管理器
 * FlowLayout（流式布局管理器）是 JPanel 和 JApplet 的默认布局管理器。FlowLayout 会将组件按照从上到下、从左到右的放置规律逐行进行定位。
 * 与其他布局管理器不同的是，FlowLayout 布局管理器不限制它所管理组件的大小，而是允许它们有自己的最佳大小。
 * FlowLayout 布局管理器的构造方法如下。
 * FlowLayout()：创建一个布局管理器，使用默认的居中对齐方式和默认 5 像素的水平和垂直间隔。
 * FlowLayout(int align)：创建一个布局管理器，使用默认 5 像素的水平和垂直间隔。其中，align 表示组件的对齐方式，
 * 对齐的值必须是 FlowLayoutLEFT、FlowLayout.RIGHT 和 FlowLayout.CENTER，指定组件在这一行的位置是居左对齐、居右对齐或居中对齐。
 * FlowLayout(int align, int hgap,int vgap)：创建一个布局管理器，其中 align 表示组件的对齐方式；
 * hgap 表示组件之间的横向间隔；vgap 表示组件之间的纵向间隔，单位是像素。
 */

public class test1
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        jFrame.setName("测试1");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(640, 480);
        jFrame.setLocation(300, 300);
        JPanel jPanel = new JPanel();
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
        JButton jButton6 = new JButton("6");
        JButton jButton7 = new JButton("7");
        JButton jButton8 = new JButton("8");
        JButton jButton9 = new JButton("9");
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        jPanel.add(jButton6);
        jPanel.add(jButton7);
        jPanel.add(jButton8);
        jPanel.add(jButton9);
        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 40, 40));
        jPanel.setBackground(Color.cyan);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
