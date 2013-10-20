//<html><body><applet code = "TestAdapter.class" width = 300 height = 300></applet></body></html>

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TestAdapter extends Applet implements MouseMotionListener
{  
  public void init()
  {
    this.addMouseListener(new MyAdapter());
    this.addMouseMotionListener(this);
  }  
  
  public void mouseMoved(MouseEvent e)
  {
    showStatus("���ƶ�����꣬��λ����("+e.getX()+","+e.getY()+")��");
  }
  public void mouseDragged(MouseEvent e)
  {
    showStatus("���϶�����ꡣ");
  }
  
  class MyAdapter extends MouseAdapter
{
	public void mouseClicked(MouseEvent e)
  {
    if(e.getClickCount()==1)
         showStatus("����("+e.getX()+","+e.getY()+")��������������");
    else if(e.getClickCount()==2)
         showStatus("����("+e.getX()+","+e.getY()+")˫������ꡣ");
  }
  
	}
}


