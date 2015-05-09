 class Q_one extends JPanel{
	//create answer JPanel
	JPanel answer = new JPanel();
	JPanel q_one = new JPanel();
	//create text field, buttons, and labels
	JTextField question = new JTextField(8);
	JLabel picture = new JLabel();
	JButton A = new JButton();
	JButton B = new JButton();
	JButton C = new JButton();
	JButton D = new JButton();

	
	Q_one(){
		//Typesetting
		answer.setLayout(new GridLayout(4,2));
		//add JLabel and JButton
		answer.add(new JLabel("A :"));
		answer.add(A);
		answer.add(new JLabel("B :"));
		answer.add(B);
		answer.add(new JLabel("C :"));
		answer.add(C);
		answer.add(new JLabel("D :"));
		answer.add(D);
		//add question, picture, and answer block
		q_one.add(question,BorderLayout.NORTH);
		q_one.add(picture,BorderLayout.CENTER);
		q_one.add(answer,BorderLayout.SOUTH);
		//add q_one
		add(q_one);
	}
 }
