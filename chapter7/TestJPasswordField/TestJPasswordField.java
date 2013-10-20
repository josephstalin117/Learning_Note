import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TestJPasswordField extends JApplet implements ActionListener, DocumentListener{
 JLabel jl1,jl2;
 JPasswordField jp1,jp2;
 JTextField jtf;
 JTextArea jta;
 JButton commit,cancel;

 public void init(){
	Container c = getContentPane();
	
	jl1 = new JLabel("�������������룺");
	jl2 = new JLabel("���ٴ��������룺");
	jp1 = new JPasswordField(10);
	jp2 = new JPasswordField(10);
	jtf = new JTextField("jtextfield",10);
	jta = new JTextArea(5,6);
	commit = new JButton("ȷ��");
	cancel = new JButton("���");
	c.setLayout(new GridLayout(4,2));
	c.add(jl1);
	c.add(jp1);
	c.add(jl2);
	c.add(jp2);
	c.add(commit);
	c.add(cancel);
	c.add(jtf);
	c.add(jta);
	
	//jtf.setEditable(false);
	jta.insert("this is a jtextarea component!",0);
	
	commit.addActionListener(this);
	cancel.addActionListener(this);
	jtf.addActionListener(this);
	jta.getDocument().addDocumentListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
	if(e.getSource()==commit)
		if(String.valueOf(jp1.getPassword()).equals(String.valueOf(jp2.getPassword())))
				showStatus("��������ɹ���");
		else
				showStatus("������������벻ͬ�����������룡");
	else if(e.getSource()==cancel)
		{
			jp1.setText("");
			jp2.setText("");
		}
	else
		jtf.setText("");
 }
 
 public void changedUpdate(DocumentEvent event) 
 {  }

 public void insertUpdate(DocumentEvent event) 
 { 
 	 jtf.setText(jta.getText());
 }
 public void removeUpdate(DocumentEvent event)
 {
   jtf.setText ("removeUpdate");
  } 		
}

