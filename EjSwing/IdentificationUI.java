import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IdentificationUI extends JFrame {
	
	private JPanel asdf;
	private JTextField usuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdentificationUI frame = new IdentificationUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IdentificationUI() {
		setTitle("IdentificationUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 281);
		asdf = new JPanel();
		asdf.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(asdf);
		asdf.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(47, 59, 50, 14);
		asdf.add(lblUsuario);
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(47, 90, 64, 14);
		asdf.add(lblPassword);
		
		usuario = new JTextField();
		usuario.setBounds(107, 56, 126, 20);
		asdf.add(usuario);
		usuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(107, 87, 126, 20);
		asdf.add(passwordField);
		
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String usu=usuario.getText();
				String pass=passwordField.getText();
				if(usu.equals("admin")&&pass.equals("1234")){
					JOptionPane.showMessageDialog(btnAceptar, "Acceso correcto");
					dispose();
					ColaSimpleUI calc=new ColaSimpleUI();
					calc.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(btnAceptar, "Acceso incorrecto", "", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
	
		btnAceptar.setBounds(47, 209, 89, 23);
		asdf.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(207, 209, 89, 23);
		asdf.add(btnCancelar);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"2");
				
			}
		});
		btn2.setBounds(95, 115, 50, 32);
		asdf.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"3");
			}
		});
		btn3.setBounds(155, 115, 50, 32);
		asdf.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"4");
			}
		});
		btn4.setBounds(215, 115, 50, 32);
		asdf.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"5");
			}
		});
		btn5.setBounds(275, 115, 50, 32);
		asdf.add(btn5);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"1");
			}
		});
		btn1.setBounds(35, 115, 50, 32);
		asdf.add(btn1);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"6");
			}
		});
		btn6.setBounds(35, 151, 50, 32);
		asdf.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"7");
			}
		});
		btn7.setBounds(95, 151, 50, 32);
		asdf.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"8");
			}
		});
		btn8.setBounds(155, 151, 50, 32);
		asdf.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"9");
			}
		});
		btn9.setBounds(214, 151, 51, 32);
		asdf.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(passwordField.getText()+"0");
			}
		});
		btn0.setBounds(275, 151, 50, 32);
		asdf.add(btn0);
		
		
	}
}
