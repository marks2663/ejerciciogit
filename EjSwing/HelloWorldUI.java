import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class HelloWorldUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField textsaludo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldUI frame = new HelloWorldUI();
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
	public HelloWorldUI() {
		setBackground(Color.YELLOW);
		setTitle("HelloWorld");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 180);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblNombre.setBounds(10, 31, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(62, 28, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnSaludar = new JButton("Saludo");
		btnSaludar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(txtNombre.getText());
				if(txtNombre.getText().equals("")){
					textsaludo.setText("Hello Anonymous");
				}else{
					textsaludo.setText("Hello "+txtNombre.getText());
				}	
			}
		});
		btnSaludar.setBounds(59, 56, 89, 23);
		contentPane.add(btnSaludar);
		
		textsaludo = new JTextField();
		textsaludo.setHorizontalAlignment(SwingConstants.CENTER);
		textsaludo.setEditable(false);
		textsaludo.setBounds(10, 90, 284, 41);
		contentPane.add(textsaludo);
		textsaludo.setColumns(10);
	}
}
