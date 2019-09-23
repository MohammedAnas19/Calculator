import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.AbstractAction;
import javax.swing.Action;



public class calc {

	private JFrame frmCalculator;
	private final Action action = new SwingAction();
	public String s1,s2; 
	public int opt,a=0,e1=0;
	public JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s1=t1.getText();
				t1.setText(s1 +"1");
				e1=1;
			}
		});
		
		t1 = new JTextField();
		t1.setFont(new Font("Arial", Font.PLAIN, 40));
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		t1.setBackground(SystemColor.control);
		t1.setBounds(0, 0, 363, 55);
		frmCalculator.getContentPane().add(t1);
		t1.setColumns(10);
		b1.setBounds(0, 66, 89, 34);
		frmCalculator.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				s1=t1.getText();
				t1.setText(s1+"2");
				e1=1;
			}
		});
		b2.setBounds(91, 66, 89, 34);
		frmCalculator.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"3");
				e1=1;
			   }
			});
		b3.setBounds(183, 66, 89, 34);
		frmCalculator.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"4")
				;e1=1;
			}
		});
		b4.setBounds(0, 111, 89, 34);
		frmCalculator.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"5");
				e1=1;
			   }
			});
		b5.setBounds(91, 111, 89, 34);
		frmCalculator.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"6");
				e1=1;
			   }
			});
		b6.setBounds(183, 111, 89, 34);
		frmCalculator.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"7");
				e1=1;
			   }
			});
		b7.setBounds(0, 156, 89, 34);
		frmCalculator.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"8");
				e1=1;
			   }
			});
		b8.setBounds(91, 156, 89, 34);
		frmCalculator.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"9");
				e1=1;
			   }
			});
		b9.setBounds(183, 156, 89, 34);
		frmCalculator.getContentPane().add(b9);
		
		JButton bp = new JButton("+");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( e1==0) {
					t1.setText("0");
					s1="";
				}
				else {
					opt=1;
					int b;
					s1=t1.getText();
					b=Integer.parseInt(s1);
					a=a+b;
					t1.setText("");
				}
			   }
			});
		bp.setBounds(274, 202, 89, 34);
		frmCalculator.getContentPane().add(bp);
		
		JButton be = new JButton("=");
		be.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int b,c;
				s1=t1.getText();
				if( a==0) {
					t1.setText("0");
				}
				else {
					if(opt==1) {
					b=Integer.parseInt(s1);
					c=a+b;
					a=c;
					t1.setText(c+"");					
				}
					else if(opt==2) {
						b=Integer.parseInt(s1);
						c=a-b;
						a=c;
						t1.setText(c+"");					
					}
					else if(opt==3) {
						b=Integer.parseInt(s1);
						c=a*b;
						a=c;
						t1.setText(c+"");					
					}
					else if(opt==4) {
						b=Integer.parseInt(s1);
						c=a/b;
						a=c;
						t1.setText(c+"");					
					}
			   }
				}
			});
		be.setBounds(0, 247, 363, 79);
		frmCalculator.getContentPane().add(be);
		
		JButton bm = new JButton("-");
		
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( e1==0) {
					t1.setText("0");
					s1="";
				}
				else {
					opt=2;
					int b;
					s1=t1.getText();
					b=Integer.parseInt(s1);
					a=a+b;
					t1.setText("");
				}
			   }
			});
		bm.setBounds(274, 156, 89, 34);
		frmCalculator.getContentPane().add(bm);
		
		JButton bi = new JButton("*");
		bi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( e1==0) {
					t1.setText("0");
					s1="";
				}
				else {
					opt=3;
					int b;
					s1=t1.getText();
					b=Integer.parseInt(s1);
					a=a+b;
					t1.setText("");
				}
			   }
			});
		bi.setBounds(274, 111, 89, 34);
		frmCalculator.getContentPane().add(bi);
		
		JButton bd = new JButton("/");
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( e1==0) {
					t1.setText("0");
					s1="";
				}
				else {
					opt=4;
					int b;
					s1=t1.getText();
					b=Integer.parseInt(s1);
					a=a+b;
					t1.setText("");
				}
			   }
			});
		bd.setBounds(274, 66, 89, 34);
		frmCalculator.getContentPane().add(bd);
		
		JButton bz = new JButton("0");
		bz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"0");
				e1=1;
			   }
			});
		bz.setBounds(91, 201, 89, 34);
		frmCalculator.getContentPane().add(bz);
		
		JButton bc = new JButton("C");
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t1.setText("");
				a=0;
				e1=1;
			}
		});
		bc.setBounds(0, 201, 89, 34);
		frmCalculator.getContentPane().add(bc);
		
		JButton bzz = new JButton("00");
		bzz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				s1=t1.getText();
				t1.setText(s1+"00");
				e1=1;
			   }
			});
		bzz.setBounds(183, 201, 89, 34);
		frmCalculator.getContentPane().add(bzz);
		frmCalculator.setBounds(100, 100, 379, 365);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent arg0) {
		}
		
	}
}
