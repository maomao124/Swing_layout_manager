import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing布局管理器
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 13:43
 * Version(版本): 1.0
 * Description(描述)： 边框布局管理器
 * BorderLayout（边框布局管理器）是 Window、JFrame 和 JDialog 的默认布局管理器。边框布局管理器将窗口分为 5 个区域：
 * North、South、East、West 和 Center。其中，North 表示北，将占据面板的上方；Soufe 表示南，将占据面板的下方；
 * East表示东，将占据面板的右侧；West 表示西，将占据面板的左侧；中间区域 Center 是在东、南、西、北都填满后剩下的区域
 * 边框布局管理器并不要求所有区域都必须有组件，如果四周的区域（North、South、East 和 West 区域）没有组件，则由 Center 区域去补充。
 * 如果单个区域中添加的不只一个组件，那么后来添加的组件将覆盖原来的组件，所以，区域中只显示最后添加的一个组件。
 * BorderLayout()：创建一个 Border 布局，组件之间没有间隙。
 * BorderLayout(int hgap,int vgap)：创建一个 Border 布局，其中 hgap 表示组件之间的横向间隔；vgap 表示组件之间的纵向间隔，单位是像素。
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("测试");
        jFrame.setSize(1280, 720);
        jFrame.setLocation(150, 150);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(new BorderLayout());
        JButton jButton1 = new JButton("上");
        JButton jButton2 = new JButton("左");
        JButton button3 = new JButton("中");
        JButton button4 = new JButton("右");
        JButton button5 = new JButton("下");
        jFrame.add(jButton1, BorderLayout.NORTH);
        jFrame.add(jButton2, BorderLayout.WEST);
        jFrame.add(button3, BorderLayout.CENTER);
        jFrame.add(button4, BorderLayout.EAST);
        jFrame.add(button5, BorderLayout.SOUTH);
        jFrame.setVisible(true);
    }
}
