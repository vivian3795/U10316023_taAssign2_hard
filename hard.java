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
	ImageIcon[] arr = new ImageIcon[11];
	 //plus 15 buttons and labels it needs
	JLabel title = new JLabel();
	JLabel Q_ = new JLabel("Quest :");
	JLabel quest = new JLabel();	
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
	
    	public hard(){
		//create a frame
	        frame = new JFrame();
		//set size
	        frame.setSize(200, 300);
		//set layout
	        frame.setLayout(new GridBagLayout());
	        //terminate when the frame is closed
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	       	//qusetion and answers
	       	String q[] = {" ",
                      "What face is it ?",
                      "What suit is it ?",
                      "Does it symmetry?",
                      "What color is it ?",
                      "What face is it ?",
                      "Which queen holds arm ?",
                      "Who is she ?",
                      "Who is he ?",
                      "What does it represent ? ",
                      "Which king with no beard ?"};
        	Q = q;
		String Ans_a[] = {" ",
                      "Ace",
                      "Spade",
                      "horizontal",
                      "black",
                      "King",
                      "Diamond",
                      "Judith",
                      "Ogier",
                      "Lucky",
                      "Heart"};
		ans_a = Ans_a;
		String Ans_b[] = {" ",
                      "Deuce",
                      "Club",
                      "vertical",
                      "brown",
                      "Joker",
                      "Spade",
                      "Rachel",
                      "La Hire",
                      "Money",
                      "Club"};
		ans_b = Ans_b;
		String Ans_c[] = {" ",
                      "Nine",
                      "Diamond",
                      "both",
                      "blue",
                      "Queen",
                      "Club",
                      "Athena",
                      "Lancelot",
                      "Love",
                      "Spade"};
		ans_c = Ans_c;
		String Ans_d[] = {" ",
                      "Five",
                      "Heart",
                      "neither",
                      "green",
                      "Jack",
                      "Heart",
                      "Argine",
                      "Hector",
                      "Death",
                      "Diamond"};
		ans_d = Ans_d;
		
		//set cards into array
		for(int c = 1 ; c <= 10 ; c++){
			//put all of cards which named 1-10 .png 
			//arr[1] store 1.png, arr[2] store 2.png, and so on
			arr[c] = new ImageIcon(c+".png");
		}
	       
	       //the codes which below this line before next command are typesetting
	       GridBagConstraints title_g = new GridBagConstraints();
	       title_g.gridx = 0 ; title_g.gridy = 0 ;
	       title_g.gridwidth = 2 ; title_g.gridheight = 1 ;
	       title_g.weightx = 0 ; title_g.weighty = 0 ;
	       title_g.fill = GridBagConstraints.NONE ;
	       title_g.anchor = GridBagConstraints.WEST ;
	       frame.add( title , title_g ) ;
		
	       GridBagConstraints Q_g = new GridBagConstraints();
	       Q_g.gridx = 0 ; Q_g.gridy = 1 ;
	       Q_g.gridwidth = 2 ; Q_g.gridheight = 1 ;
	       Q_g.weightx = 0 ; Q_g.weighty = 0 ;
	       Q_g.fill = GridBagConstraints.NONE ;
	       Q_g.anchor = GridBagConstraints.WEST ;
	       frame.add( Q_ , Q_g ) ;
	       
	       GridBagConstraints quest_g = new GridBagConstraints();
	       quest_g.gridx = 2 ; quest_g.gridy = 1 ;
	       quest_g.gridwidth = 4 ; quest_g.gridheight = 1 ;
	       quest_g.weightx = 0 ; quest_g.weighty = 0 ;
	       quest_g.fill = GridBagConstraints.BOTH ;
	       quest_g.anchor = GridBagConstraints.WEST ;
	       frame.add( quest , quest_g ) ;
	       
	       GridBagConstraints pic_g = new GridBagConstraints();
	       pic_g.gridx = 0 ; pic_g.gridy = 2 ;
	       pic_g.gridwidth = 6 ; pic_g.gridheight = 4 ;
	       pic_g.weightx = 0 ; pic_g.weighty = 0 ;
	       pic_g.fill = GridBagConstraints.NONE ;
	       pic_g.anchor = GridBagConstraints.CENTER ;
	       frame.add( pic , pic_g ) ;
	       
	       GridBagConstraints a_g = new GridBagConstraints();
	       a_g.gridx = 0 ; a_g.gridy = 3 ;
	       a_g.gridwidth = 1 ; a_g.gridheight = 1 ;
	       a_g.weightx = 0 ; a_g.weighty = 0 ;
	       a_g.fill = GridBagConstraints.NONE ;
	       a_g.anchor = GridBagConstraints.WEST ;
	       frame.add( a , a_g ) ;
	       
	       GridBagConstraints b_g = new GridBagConstraints();
	       b_g.gridx = 0 ; b_g.gridy = 4 ;
	       b_g.gridwidth = 1 ; b_g.gridheight = 1 ;
	       b_g.weightx = 0 ; b_g.weighty = 0 ;
	       b_g.fill = GridBagConstraints.NONE ;
	       b_g.anchor = GridBagConstraints.WEST ;
	       frame.add( b , b_g ) ;
	       
	       GridBagConstraints c_g = new GridBagConstraints();
	       c_g.gridx = 0 ; c_g.gridy = 5 ;
	       c_g.gridwidth = 1 ; c_g.gridheight = 1 ;
	       c_g.weightx = 0 ; c_g.weighty = 0 ;
	       c_g.fill = GridBagConstraints.NONE ;
	       c_g.anchor = GridBagConstraints.WEST ;
	       frame.add( c , c_g ) ;
	       
	       GridBagConstraints d_g = new GridBagConstraints();
	       d_g.gridx = 0 ; d_g.gridy = 6 ;
	       d_g.gridwidth = 1 ; d_g.gridheight = 1 ;
	       d_g.weightx = 0 ; d_g.weighty = 0 ;
	       d_g.fill = GridBagConstraints.NONE ;
	       d_g.anchor = GridBagConstraints.WEST ;
	       frame.add( d , d_g ) ;
	       
	       GridBagConstraints score_g = new GridBagConstraints();
	       score_g.gridx = 0 ; score_g.gridy = 7 ;
	       score_g.gridwidth = 2 ; score_g.gridheight = 1 ;
	       score_g.weightx = 0 ; score_g.weighty = 0 ;
	       score_g.fill = GridBagConstraints.NONE ;
	       score_g.anchor = GridBagConstraints.WEST ;
	       frame.add( score , score_g ) ;
	       
	       GridBagConstraints nowscore_g = new GridBagConstraints();
	       nowscore_g.gridx = 1 ; nowscore_g.gridy = 8 ;
	       nowscore_g.gridwidth = 2 ; nowscore_g.gridheight = 1 ;
	       nowscore_g.weightx = 0 ; nowscore_g.weighty = 0 ;
	       nowscore_g.fill = GridBagConstraints.NONE ;
	       nowscore_g.anchor = GridBagConstraints.CENTER ;
	       frame.add( nowscore , nowscore_g ) ;
	       
	       GridBagConstraints next_g = new GridBagConstraints();
	       next_g.gridx = 4 ; next_g.gridy = 8 ;
	       next_g.gridwidth = 2 ; next_g.gridheight = 1 ;
	       next_g.weightx = 0 ; next_g.weighty = 0 ;
	       next_g.fill = GridBagConstraints.NONE ;
	       next_g.anchor = GridBagConstraints.EAST ;
	       frame.add( next , next_g ) ;
	       
	       GridBagConstraints A_g = new GridBagConstraints();
	       A_g.gridx = 1 ; A_g.gridy = 3 ;
	       A_g.gridwidth = 5 ; A_g.gridheight = 1 ;
	       A_g.weightx = 0 ; A_g.weighty = 0 ;
	       A_g.fill = GridBagConstraints.BOTH ;
	       A_g.anchor = GridBagConstraints.WEST ;
	       frame.add( A , A_g ) ;
	       
	       GridBagConstraints B_g = new GridBagConstraints();
	       B_g.gridx = 1 ; B_g.gridy = 4 ;
	       B_g.gridwidth = 5 ; B_g.gridheight = 1 ;
	       B_g.weightx = 0 ; B_g.weighty = 0 ;
	       B_g.fill = GridBagConstraints.BOTH ;
	       B_g.anchor = GridBagConstraints.WEST ;
	       frame.add( B , B_g ) ;
	       
	       GridBagConstraints C_g = new GridBagConstraints();
	       C_g.gridx = 1 ; C_g.gridy = 5 ;
	       C_g.gridwidth = 5 ; C_g.gridheight = 1 ;
	       C_g.weightx = 0 ; C_g.weighty = 0 ;
	       C_g.fill = GridBagConstraints.BOTH ;
	       C_g.anchor = GridBagConstraints.WEST ;
	       frame.add( C , C_g ) ;
	       
	       GridBagConstraints D_g = new GridBagConstraints();
	       D_g.gridx = 1 ; D_g.gridy = 6 ;
	       D_g.gridwidth = 5 ; D_g.gridheight = 1 ;
	       D_g.weightx = 0 ; D_g.weighty = 0 ;
	       D_g.fill = GridBagConstraints.BOTH ;
	       D_g.anchor = GridBagConstraints.WEST ;
	       frame.add( D , D_g ) ;
	       
	       //set the first question
	       QA(flag);
	       //set visible
	       frame.setVisible(true);
	       
	       //set next addActionListener
	       next.setActionCommand("NEXT");
	       next.addActionListener(this);
		
	}
	
	public void QA(int flag){
		//set title n/10
		title.setText(flag+" / 10 ");
		//set question and selections
		quest.setText(Q[flag]);
		pic.setIcon(arr[flag]);
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
				D.addActionListener(this);break;
			}case 2:{
				A.setActionCommand("");
				B.setActionCommand("");
				C.setActionCommand("");
				D.setActionCommand("ANS");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}case 3:{
				A.setActionCommand("");
				B.setActionCommand("");
				C.setActionCommand("");
				D.setActionCommand("ANS");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}case 4:{
				A.setActionCommand("");
				B.setActionCommand("");
				C.setActionCommand("ANS");
				D.setActionCommand("");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}case 5:{
				A.setActionCommand("");
				B.setActionCommand("ANS");
				C.setActionCommand("");
				D.setActionCommand("");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}
			case 6:{
				A.setActionCommand("");
				B.setActionCommand("ANS");
				C.setActionCommand("");
				D.setActionCommand("");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}case 7:{
				A.setActionCommand("ANS");
				B.setActionCommand("");
				C.setActionCommand("");
				D.setActionCommand("");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}case 8:{
				A.setActionCommand("");
				B.setActionCommand("");
				C.setActionCommand("ANS");
				D.setActionCommand("");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}case 9:{
				A.setActionCommand("");
				B.setActionCommand("");
				C.setActionCommand("");
				D.setActionCommand("ANS");
				A.addActionListener(this);
				B.addActionListener(this);
				C.addActionListener(this);
				D.addActionListener(this);break;
			}case 10:{
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
