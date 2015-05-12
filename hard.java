/**
 * ID: U10316023
 * Ex: _taAssign2_hard
 * Information:
 *      U10316023 class is written according to the requirements on web.
 */
 
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.*;
 
 class hard implements ActionListener {
	private JFrame frame;
	//plus questions and all selections
	private String[] Q;
	private String[] ans_a;
	private String[] ans_b;
	private String[] ans_c;
	private String[] ans_d;
	//plus total and flag to store score and count 
	private int total = 0 ;
	private int flag = 1 ;
	//plus 15 buttons and labels it needs
	JLabel title = new JLabel("1");
  	JLabel Q_ = new JLabel("Question :");
  	JLabel quest = new JLabel("2");	
  	JLabel pic = new JLabel();	
  	JLabel a = new JLabel(" A ");
  	JLabel b = new JLabel(" B ");
  	JLabel c = new JLabel(" C ");
  	JLabel d = new JLabel(" D ");
  	JLabel score = new JLabel(" Score : ");
  	JLabel nowscore = new JLabel("0");
  	JButton next = new JButton(" next ");
  	JButton A = new JButton();
  	JButton B = new JButton();
	JButton C = new JButton();
  	JButton D = new JButton();
  	
	 public void QA(int flag){
		//set title n/10
		title.setText(flag+" / 10 ");
		//set question and selections
		quest.setText(Q[flag]);
		A.setText(ans_a[flag]);
		B.setText(ans_b[flag]);
		C.setText(ans_c[flag]);
		D.setText(ans_d[flag]);
		//set correct answer
		switch(flag){
			case 1:{
				A.setActionCommand("ANS");
				B.setActionCommand("");
				C.setActionCommand("");
				D.setActionCommand("");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);
			}
		}
	}
	
	//listener
	@Override
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		//removeActionListener--avoid repeat answering question
		A.removeActionListener(this);
		B.removeActionListener(this);
		C.removeActionListener(this);
		D.removeActionListener(this);
		//if it is correct answer, plus ten points and let user know
		if(cmd == "ANS"){
			total += 10;
			nowscore.setText(total+"");
		}//go to the next question 
		else if(cmd == "NEXT"){
			flag++;
			QA(flag);
		}
	}
}
