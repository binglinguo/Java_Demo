
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test2022_9_10 {


    public static void main(String[] args){
            JFrame jf =new JFrame();
            //背景
            jf.setTitle("麟哥牛逼");
            jf.setSize(1024,768);
            jf.setBackground(Color.BLACK);
            jf.setLocationRelativeTo(null);

            MyJPanel mj =new MyJPanel();
            jf.add(mj);

            jf.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
            jf.setVisible(true);
        }
    }
    class MyJPanel extends JPanel{
        public void paint(Graphics g){
            //制作星星，随机生成
            g.setColor(Color.WHITE);
            for(int i=0;i<300;i++){
                g.drawString("*", (int)(Math.random()*1024), (int)(Math.random()*768));
            }
            //制作，去掉黑色圆可为圆月
            g.setColor(Color.YELLOW);
            g.fillOval(500, 100, 100, 100); //x:200
            g.setColor(Color.BLACK);
            g.fillOval(230, 94, 100, 100);
            //文字描述
            g.setColor(Color.WHITE);
            g.setFont(new Font("楷体",Font.BOLD,30));
            g.drawString("中秋快乐！",700,90);
            g.drawString("阖家幸福！",700,130);
            g.drawString("666",700,400);
        }
    }



