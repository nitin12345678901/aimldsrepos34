import java.awt.EventQueue;
//kjhvb
//bjkvhbj
//jkbvlj
//jkxcguvc
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PAGE1 {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGE1 window = new PAGE1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PAGE1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 595, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(103, 11, 247, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(36, 80, 110, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ROLLNO");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(36, 133, 110, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("BRANCH");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(36, 189, 110, 27);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("GENDER");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(36, 245, 110, 27);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("PROGRAMS");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_4.setBounds(36, 306, 110, 27);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		tb1 = new JTextField();
		tb1.setBounds(234, 84, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(234, 137, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"DS", "CSE", "AIML", "IOT", "MECH", "CIVIL", "ECE", "CS"}));
		cb1.setBounds(234, 192, 86, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setHorizontalAlignment(SwingConstants.LEFT);
		r1.setBounds(234, 248, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setHorizontalAlignment(SwingConstants.LEFT);
		r2.setBounds(377, 248, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBounds(234, 309, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA\r\n");
		c2.setBounds(350, 309, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON\r\n");
		c3.setBounds(468, 309, 97, 23);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String rollno = tb2.getText();
				Object branch = cb1.getSelectedItem();
				JOptionPane.showMessageDialog(btnNewButton,"Name"+ name+ "\nRollNo"+ rollno+ "\nBranch"+ branch);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(157, 395, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
