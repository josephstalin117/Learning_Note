package swing;

import java.awt.Container;
import java.awt.GridLayout;
/*GridLayout ����һ�����ִ����������Ծ���������ʽ��������������в��á��������ֳɴ�С��ȵľ��Σ�һ�������з���һ�����*/
import java.awt.BorderLayout;
/*BorderLayout��һ�����������ı߽粼�֣������Զ�����������а��ţ����������С��ʹ�����������������ϡ��������������м�����ÿ���������ֻ�ܰ���һ���������ͨ����Ӧ�ĳ������б�ʶ��NORTH��SOUTH��EAST��WEST �� CENTER����ʹ�ñ߽粼�ֽ�һ�������ӵ�������ʱ��Ҫʹ�����������֮һ*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
*
* @author Administrator
*/
public class Cal extends JFrame implements ActionListener {
    JFrame jf;
    JTextField jtf;
    String[] b = new String[] {"+","-","*","/","."};
    JButton jis = new JButton("=");
    private int temp = 0;
    private float result = 0;
    private float fnumber = 0, bnumber = 0;

    public Cal(){
        init();
    }

    public void init(){
        jf = new JFrame();
        jtf = new JTextField();

        Container c = jf.getContentPane();//Returns the contentPane object for this frame. 
        jtf.setHorizontalAlignment(JTextField.RIGHT);//�����ı���ˮƽ���뷽ʽ 
         jtf.setLayout(new GridLayout()); 
        c.add(jtf,BorderLayout.NORTH);// 

        JPanel jp = new JPanel(); 
        jp.setLayout(new GridLayout(4,4));//����GridLayout(int rows,int cols)������μ�API 
        c.add(jp,BorderLayout.CENTER);/*����տ�ʼ����һ�ͼ����󣬽�cд����jp���߼����ö�����������*/

        JButton[] ja = new JButton[10];
        JButton[] jb = new JButton[5];
        for(int i = 0; i < 10; i++){
            ja[i] = new JButton("" + i);
            ja[i].addActionListener(this);
        }
        for(int j = 0; j < 5; j++){
            jb[j] = new JButton("" + b[j]);
            jb[j].addActionListener(this);
        }

        for(int i = 0; i < 10; i++){
            jp.add(ja[i]);
        }
        for(int j = 0; j < 5; j++){
            jp.add(jb[j]);
        }

        jp.add(jis);
        jis.addActionListener(this);
        jf.setSize(200,300);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("+")){
            this.fnumber = Float.parseFloat(this.jtf.getText());
            this.jtf.setText("");
            this.temp = 1;
        }
        else if(s.equals("-")){
            this.fnumber = Float.parseFloat(this.jtf.getText());
            this.jtf.setText("");
            this.temp = 2;
        }
        else if(s.equals("*")){
            this.fnumber = Float.parseFloat(this.jtf.getText());
            this.jtf.setText("");
            this.temp = 3;
        }
        else if(s.equals("/")){
            this.fnumber = Float.parseFloat(this.jtf.getText());
            this.jtf.setText("");
            this.temp = 4;
        }
        else if(s.equals(".")){
            if(jtf.equals("")){
                jtf.setText("0.");
            }
            else{
                jtf.setText(jtf.getText() + ".");
            }
        }
        else if(s.equals("=")){
            this.bnumber = Integer.parseInt(this.jtf.getText());
            switch(this.temp){
                case 1:
                    result = fnumber + bnumber;
                    this.jtf.setText(String.valueOf(result));
                    break;
                case 2:
                    result = fnumber - bnumber;
                    this.jtf.setText(String.valueOf(result));
                    break;
                case 3:
                    result = fnumber * bnumber;
                    this.jtf.setText(String.valueOf(result));
                    break;
                case 4:
                result = fnumber / bnumber;
                this.jtf.setText(String.valueOf(result));
                break;
            }
        }
        else{
            jtf.setText(jtf.getText() + e.getActionCommand());
        }
    }

    public static void main(String[] args){
        new Cal();
    }
}