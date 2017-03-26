package jyanken;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Game extends JFrame implements ActionListener{
	
	static JLabel label,label2;
	static String aitenote;

	public static void main(String[] args) {
	Game frame=new Game("じゃんけん");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//相手の手：ランダム
	List<String>array=new ArrayList<String>();
	array.add("グー");
	array.add("チョキ");
	array.add("パー");
	Collections.shuffle(array);
	aitenote=array.get(0);
	} 

	//SWINGの設定
Game(String title){
	setTitle(title);
	setBounds(100,100,300,400);
	
	JPanel p=new JPanel();
	JButton button1=new JButton("グー");
    button1.addActionListener(this);
	JButton button2=new JButton("チョキ");
	button2.addActionListener(this);
	JButton button3=new JButton("パー");
	button3.addActionListener(this);
	
	label=new JLabel();
	label2=new JLabel();
	p.add(button1);
	p.add(button2);
	p.add(button3);
	
	Container contentPane=getContentPane();
	
	contentPane.add(p,BorderLayout.CENTER);
	contentPane.add(label,BorderLayout.NORTH);
   contentPane.add(label2,BorderLayout.SOUTH);
}

	//じゃんけんの処理

public void actionPerformed(ActionEvent e) {
	String cmd=e.getActionCommand();
	if(aitenote=="チョキ"){
		label2.setText("相手はチョキです");
	if(cmd.equals("グー")){
		label.setText("you win");
	}else if(cmd.equals("チョキ")){
		label.setText("draw");
	}else{
		label.setText("you lose");
	}
	
	}else if(aitenote=="グー"){
		label2.setText("相手はグーです");
	if(cmd.equals("グー")){
		label.setText("draw");
	}else if(cmd.equals("チョキ")){
		label.setText("you lose");
	}else{
		label.setText("you win");
	}
	
	}else{
		label2.setText("相手はパーです");
	if(cmd.equals("グー")){
		label.setText("youlose");
	}else if(cmd.equals("チョキ")){
		label.setText("you win");
	}else{
		label.setText("draw");
		}
	}
} 
}

   
	
	
	


