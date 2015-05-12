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
	
}
