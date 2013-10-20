//<html><body><applet code = "TestJRadioButton.class" width =300 height = 300></applet></body></html>

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJRadioButton extends JApplet implements ItemListener
{
	JRadioButton  r1, r2, r3;
	ButtonGroup bg;
	JLabel jl;
	
	public void init()
	{
		Container c = getContentPane();
		r1=new JRadioButton("����"); 
		r2=new JRadioButton("������"); 
		r3=new JRadioButton("��ʦ"); 
		bg=new ButtonGroup(); 
	
		bg.add(r1); 
		bg.add(r2); 
		bg.add(r3);
		
		c.add(r1,BorderLayout.NORTH);
		c.add(r2,BorderLayout.CENTER);
		c.add(r3,BorderLayout.SOUTH);
			
		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		JRadioButton temp;
		
		if(e.getItemSelectable() instanceof JRadioButton)
		{
			temp = (JRadioButton)(e.getItemSelectable());
			if(temp.getText()=="����") 
				showStatus("����");				
			if(temp.getText()=="������") 
				showStatus("������");
			if(temp.getText()=="��ʦ") 
				showStatus("��ʦ");
		}
	}
}
