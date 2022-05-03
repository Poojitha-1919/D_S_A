import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<html>
<applet code="AdapterDemo" width=300 height=300>
</applet>
</html>
*/
public class AdapterDemo extends Applet
{
static String msg="start";
public void init()
{
addMouseListener(new MyMouseAdapter());
}
public void paint(Graphics g)
{
g.drawString(msg,20,20);
}
class MyMouseAdapter extends MouseAdapter
{
public void mouseEntered(MouseEvent me)
{
msg="*";
showStatus("mouse Entered");
repaint();
}
}
}
