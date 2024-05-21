package hw12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
 
import javax.swing.JPanel;
 
public class Racquet extends JPanel{
private static final int y= 570; //新增三個球拍屬性的final變數,因為已經確定下來了不會再改
private static final int WIDTH = 120;
private static final int HEIGHT = 30;
int x=0;
int xa=0;
private Game game;
public Racquet(Game game)
{
this.game=game;
}
public void move()
{
if(x+xa<game.getWidth()-120 && x+xa>0)
x+=xa;
}
public void paint(Graphics2D g)
{
g.fillRect(x, y, WIDTH, HEIGHT);
 
}
public void KeyReleased(KeyEvent e)
{
xa=0;
}
public void KeyPressed(KeyEvent e)
{
if(e.getKeyCode()==KeyEvent.VK_LEFT)
xa=-2;
if(e.getKeyCode()==KeyEvent.VK_RIGHT)
xa=2;
}
public Rectangle getBounds()  //返回當前Rectangle的球拍
{
return new Rectangle(x, y, WIDTH, HEIGHT);
}
 
public int getTopY()  //返回球拍所在的水平線
{
return y;
}
}