/*
Cheezykitten
Tic Tac Toe
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TicTacToeSwing extends JFrame implements ActionListener{

	// variables
	private JButton jbtnTicTacToe1 = new JButton();
	private JButton jbtnTicTacToe2 = new JButton();
	private JButton jbtnTicTacToe3 = new JButton();
	private JButton jbtnTicTacToe4 = new JButton();
	private JButton jbtnTicTacToe5 = new JButton();
	private JButton jbtnTicTacToe6 = new JButton();
	private JButton jbtnTicTacToe7 = new JButton();
	private JButton jbtnTicTacToe8 = new JButton();
	private JButton jbtnTicTacToe9 = new JButton();
	
	private JButton jbtnExit = new JButton("Exit");
	private JButton jbtnReset = new JButton("Reset");
	private JLabel lblPlayerX = new JLabel("Player X: ");
	private JLabel lblPlayerO = new JLabel("Player O: ");
	private JTextField jftPlayerX = new JTextField();
	private JTextField jftPlayerO = new JTextField();
	private String letter = "";
	private int count = 0;
	private boolean win = false;

    /*****************************************************************************/
    /* Class Constructor                                                         */
    /*****************************************************************************/
	public TicTacToeSwing() {
	
	// prep JFrame/Window
	super ("Tic Tac Toe");
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// set player colors
	lblPlayerX.setForeground(Color.RED);
	jftPlayerX.setForeground(Color.RED);
	lblPlayerO.setForeground(Color.GREEN);
	jftPlayerO.setForeground(Color.GREEN);
	
	// panels
	JPanel jpnlMain = new JPanel(new BorderLayout());
	JPanel jpnlTop = new JPanel(new GridLayout(1, 1));
	JPanel jpnlCenter = new JPanel(new GridLayout(3, 3, 3, 3));
	JPanel jpnlBottom = new JPanel(new GridLayout(1, 1));
	
	// add players to top
	jpnlTop.add(lblPlayerX);
	jpnlTop.add(jftPlayerX);
	jpnlTop.add(lblPlayerO);
	jpnlTop.add(jftPlayerO);
	
	// add buttons to center
	jpnlCenter.add(jbtnTicTacToe1);
	jpnlCenter.add(jbtnTicTacToe2);
	jpnlCenter.add(jbtnTicTacToe3);
	jpnlCenter.add(jbtnTicTacToe4);
	jpnlCenter.add(jbtnTicTacToe5);
	jpnlCenter.add(jbtnTicTacToe6);
	jpnlCenter.add(jbtnTicTacToe7);
	jpnlCenter.add(jbtnTicTacToe8);
	jpnlCenter.add(jbtnTicTacToe9);
	
	// add buttons to bottom
	jpnlBottom.add(jbtnReset);
	jpnlBottom.add(jbtnExit);
	
	// register buttons for event handling
    jbtnTicTacToe1.addActionListener(this);
    jbtnTicTacToe2.addActionListener(this);
    jbtnTicTacToe3.addActionListener(this);
    jbtnTicTacToe4.addActionListener(this);
    jbtnTicTacToe5.addActionListener(this);
    jbtnTicTacToe6.addActionListener(this);
    jbtnTicTacToe7.addActionListener(this);
    jbtnTicTacToe8.addActionListener(this);
    jbtnTicTacToe9.addActionListener(this);
    jbtnExit.addActionListener(this);
    jbtnReset.addActionListener(this);
    
    // set button commands
    jbtnReset.setActionCommand("Reset");
    jbtnExit.setActionCommand("Exit");
    
    // add panels to main
    jpnlMain.add(jpnlBottom, BorderLayout.SOUTH);
    jpnlMain.add(jpnlTop, BorderLayout.NORTH);
    jpnlMain.add(jpnlCenter, BorderLayout.CENTER);
    
    // container
    Container ca = getContentPane();
    ca.setBackground(Color.LIGHT_GRAY);
    ca.add(jpnlMain);
    setContentPane(ca);
    
    setVisible(true);
	
	} // end constructor
	

	
	public void actionPerformed(ActionEvent a) {
		count++;
		String sActionCommand = a.getActionCommand();
		JButton pressedButton = (JButton)a.getSource();
		
		// Calculate who's turn it is
		if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){
			letter = "X"; pressedButton.setForeground(Color.RED); pressedButton.removeActionListener(this);
		}
		else if(count == 2 || count == 4 | count == 6 || count == 8 || count == 10){
			letter = "O"; pressedButton.setForeground(Color.green); pressedButton.removeActionListener(this);
		}

		
		// display Xs or Os on buttons
		if(a.getSource() == jbtnTicTacToe1){
			jbtnTicTacToe1.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe2){
				jbtnTicTacToe2.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe3){
				jbtnTicTacToe3.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe4){
				jbtnTicTacToe4.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe5){
				jbtnTicTacToe5.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe6){
				jbtnTicTacToe6.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe7){
				jbtnTicTacToe7.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe8){
				jbtnTicTacToe8.setText(letter);
			} else if(a.getSource() == jbtnTicTacToe9){
				jbtnTicTacToe9.setText(letter);
				}
			
		// determine winner
		if( jbtnTicTacToe1.getText() == jbtnTicTacToe2.getText() && jbtnTicTacToe2.getText() == jbtnTicTacToe3.getText() && jbtnTicTacToe1.getText() != ""){
			win = true;
			}
			else if(jbtnTicTacToe4.getText() == jbtnTicTacToe5.getText() && jbtnTicTacToe5.getText() == jbtnTicTacToe6.getText() && jbtnTicTacToe4.getText() != ""){
			win = true;
			}
			else if(jbtnTicTacToe7.getText() == jbtnTicTacToe8.getText() && jbtnTicTacToe8.getText() == jbtnTicTacToe9.getText() && jbtnTicTacToe7.getText() != ""){
			win = true;
			}

			// vertical wins
			else if(jbtnTicTacToe1.getText() == jbtnTicTacToe4.getText() && jbtnTicTacToe4.getText() == jbtnTicTacToe7.getText() && jbtnTicTacToe1.getText() != ""){
			win = true;
			}
			else if(jbtnTicTacToe2.getText() == jbtnTicTacToe5.getText() && jbtnTicTacToe5.getText() == jbtnTicTacToe8.getText() && jbtnTicTacToe2.getText() != ""){
			win = true;
			}
			else if(jbtnTicTacToe3.getText() == jbtnTicTacToe6.getText() && jbtnTicTacToe6.getText() == jbtnTicTacToe9.getText() && jbtnTicTacToe3.getText() != ""){
			win = true;
			}

			//diagonal wins
			else if(jbtnTicTacToe1.getText() == jbtnTicTacToe5.getText() && jbtnTicTacToe5.getText() == jbtnTicTacToe9.getText() && jbtnTicTacToe1.getText() != ""){
			win = true;
			}
			else if(jbtnTicTacToe3.getText() == jbtnTicTacToe5.getText() && jbtnTicTacToe5.getText() == jbtnTicTacToe7.getText() && jbtnTicTacToe3.getText() != ""){
			win = true;
			}
			else {
			win = false;
			}
		
		// announce winner
		if(win == true){
			JOptionPane.showMessageDialog(null, letter + " WINS!");
			System.exit(0);
			} else if(count == 9 && win == false){
			JOptionPane.showMessageDialog(null, "Tie Game!");
			System.exit(0);
			}
		
		// exit and reset buttons
		if (sActionCommand == "Exit")
		{
			System.exit(0);
		}
		else if (sActionCommand == "Reset")
		{
			count = 0;
			win = false;
			letter = "";
			jftPlayerO.setText("");
			jftPlayerX.setText("");
			jbtnTicTacToe1.setText("");
			jbtnTicTacToe2.setText("");
			jbtnTicTacToe3.setText("");
			jbtnTicTacToe4.setText("");
			jbtnTicTacToe5.setText("");
			jbtnTicTacToe6.setText("");
			jbtnTicTacToe7.setText("");
			jbtnTicTacToe8.setText("");
			jbtnTicTacToe9.setText("");
			jbtnTicTacToe1.setForeground(Color.BLACK);
			jbtnTicTacToe2.setForeground(Color.BLACK);
			jbtnTicTacToe3.setForeground(Color.BLACK);
			jbtnTicTacToe4.setForeground(Color.BLACK);
			jbtnTicTacToe5.setForeground(Color.BLACK);
			jbtnTicTacToe6.setForeground(Color.BLACK);
			jbtnTicTacToe7.setForeground(Color.BLACK);
			jbtnTicTacToe8.setForeground(Color.BLACK);
			jbtnTicTacToe9.setForeground(Color.BLACK);
			jbtnReset.setForeground(Color.BLACK);
			jbtnExit.setForeground(Color.BLACK);
			jbtnReset.setEnabled(true);
			jbtnExit.setEnabled(true);
			jbtnTicTacToe1.setEnabled(true);
			jbtnTicTacToe2.setEnabled(true);
			jbtnTicTacToe3.setEnabled(true);
			jbtnTicTacToe4.setEnabled(true);
			jbtnTicTacToe5.setEnabled(true);
			jbtnTicTacToe6.setEnabled(true);
			jbtnTicTacToe7.setEnabled(true);
			jbtnTicTacToe8.setEnabled(true);
			jbtnTicTacToe9.setEnabled(true);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {

		TicTacToeSwing TicTacToeSwing = new TicTacToeSwing();

	}

}
