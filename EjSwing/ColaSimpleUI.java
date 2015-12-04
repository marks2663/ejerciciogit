import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultEditorKit;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.TransferHandler;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class ColaSimpleUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JTextField txtRes;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel JComBx;
	private JPanel JpanButt;
	private JTextField nomAna;
	private DefaultListModel<String> mAmigos=new DefaultListModel<String>();
	private DefaultListModel<String> mAnadidos=new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColaSimpleUI frame = new ColaSimpleUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 private void setMappings(JList list) { 
	        ActionMap map = list.getActionMap();
	        map.put(TransferHandler.getCutAction().getValue(Action.NAME),
	                TransferHandler.getCutAction());
	        map.put(TransferHandler.getCopyAction().getValue(Action.NAME),
	                TransferHandler.getCopyAction());
	        map.put(TransferHandler.getPasteAction().getValue(Action.NAME),
	                TransferHandler.getPasteAction());
	 }
	/**
	 * Create the frame.
	 */
	public ColaSimpleUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero 1:");
		lblNumero.setBounds(41, 42, 65, 14);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 2:");
		lblNumero_1.setBounds(41, 67, 65, 14);
		contentPane.add(lblNumero_1);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(41, 95, 65, 14);
		contentPane.add(lblResultado);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(111, 39, 86, 20);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(111, 64, 86, 20);
		contentPane.add(txtnum2);
		txtnum2.setColumns(10);
		
		txtRes = new JTextField();
		txtRes.setEditable(false);
		txtRes.setBounds(111, 92, 113, 20);
		contentPane.add(txtRes);
		txtRes.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmado = JOptionPane.showConfirmDialog(btnSalir,"¿Estás seguro que quieres salir?","Salir", JOptionPane.YES_NO_OPTION);
	
						if (JOptionPane.YES_OPTION== confirmado){
							System.exit(0);
						}
						else{
							System.out.println("Me quedo...");
						}
			}
		});
		btnSalir.setBounds(271, 82, 89, 23);
		contentPane.add(btnSalir);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 28);
		contentPane.add(menuBar);
		
		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
		
		JMenuItem mntmSuma = new JMenuItem("Suma");
		mntmSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("+");
			}
		});
		mnOperaciones.add(mntmSuma);
		
		JMenuItem mntmResta = new JMenuItem("Resta");
		mntmResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("-");
			}
		});
		mnOperaciones.add(mntmResta);
		
		JMenuItem mntmMultiplicacin = new JMenuItem("Multiplicaci\u00F3n");
		mntmMultiplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("*");
			}
		});
		mnOperaciones.add(mntmMultiplicacin);
		
		JMenuItem mntmDivisin = new JMenuItem("Divisi\u00F3n");
		mntmDivisin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("/");
			}
		});
		mnOperaciones.add(mntmDivisin);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("CE");
			}
		});
		menuBar.add(mntmBorrar);
		
		JMenu mnEdicion = new JMenu("Edicion");//gff
		menuBar.add(mnEdicion);//gff
		Action copyAction = new DefaultEditorKit.CopyAction();
	    copyAction.putValue(Action.NAME, "Copiar (Ctrl + C)");
	      
	    Action pasteAction = new DefaultEditorKit.PasteAction();
	    pasteAction.putValue(Action.NAME, "Pegar (Ctrl + V)");
			
		
		
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 426, 424, 14);
		contentPane.add(progressBar);
		
		JButton btnClickFast = new JButton("Click FAST!");
		btnClickFast.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				progressBar.setValue(progressBar.getValue()+2);
			}
		});
		btnClickFast.setBounds(146, 392, 89, 23);
		contentPane.add(btnClickFast);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 123, 422, 258);
		contentPane.add(tabbedPane);
		
		JpanButt = new JPanel();
		tabbedPane.addTab("JButton", null, JpanButt, null);
		JpanButt.setLayout(null);
		
		JButton button = new JButton("CE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("CE");
			}
		});
		button.setBounds(283, 30, 89, 22);
		JpanButt.add(button);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("/");
			}
		});
		division.setBounds(206, 30, 41, 22);
		JpanButt.add(division);
		
		JButton multiplica = new JButton("*");
		multiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("*");
			}
		});
		multiplica.setBounds(155, 30, 41, 22);
		JpanButt.add(multiplica);
		
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("-");
			}
		});
		resta.setBounds(104, 30, 41, 22);
		JpanButt.add(resta);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("+");
			}
		});
		suma.setBounds(53, 30, 41, 22);
		JpanButt.add(suma);
		
		JComBx = new JPanel();
		tabbedPane.addTab("JComboBox", null, JComBx, null);
		JComBx.setLayout(null);
		
		JComboBox operaciones = new JComboBox();
		operaciones.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				int ope=operaciones.getSelectedIndex();
				switch(ope){
				case 1:calcularRes("+");break;
				case 2:calcularRes("-");break;
				case 3:calcularRes("*");break;
				case 4:calcularRes("/");break;
				}
			}
		});
		operaciones.setModel(new DefaultComboBoxModel(new String[] {"Selecciona...", "Suma", "Resta", "Multiplicar", "Division"}));
		operaciones.setBounds(140, 24, 113, 20);
		JComBx.add(operaciones);
		
		JLabel label = new JLabel("Operaci\u00F3n");
		label.setBounds(70, 27, 65, 14);
		JComBx.add(label);
		
		JPanel JRadBx = new JPanel();
		tabbedPane.addTab("JRadioBox", null, JRadBx, null);
		JRadBx.setLayout(null);
		
		JRadioButton rdbtnSuma = new JRadioButton("Suma");
		buttonGroup.add(rdbtnSuma);
		rdbtnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("+");
			}
		});
		rdbtnSuma.setBounds(154, 84, 109, 15);
		JRadBx.add(rdbtnSuma);
		
		JRadioButton rdbtnResta = new JRadioButton("Resta");
		buttonGroup.add(rdbtnResta);
		rdbtnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("-");
			}
		});
		rdbtnResta.setBounds(154, 102, 109, 15);
		JRadBx.add(rdbtnResta);
		
		JRadioButton rdbtnMultiplicar = new JRadioButton("Multiplicar");
		buttonGroup.add(rdbtnMultiplicar);
		rdbtnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("*");
			}
		});
		rdbtnMultiplicar.setBounds(154, 120, 109, 15);
		JRadBx.add(rdbtnMultiplicar);
		
		JRadioButton rdbtnDividir = new JRadioButton("Dividir");
		buttonGroup.add(rdbtnDividir);
		rdbtnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularRes("/");
			}
		});
		rdbtnDividir.setBounds(154, 138, 109, 15);
		JRadBx.add(rdbtnDividir);
		
		JPanel JLst = new JPanel();
		JLst.setBackground(Color.PINK);
		tabbedPane.addTab("JListModel", null, JLst, null);
		JLst.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(13, 12, 46, 14);
		JLst.add(lblNombre);
		
		nomAna = new JTextField();
		nomAna.setBounds(69, 9, 86, 20);
		JLst.add(nomAna);
		nomAna.setColumns(10);
		
		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String listTxt=nomAna.getText();
				mAmigos.addElement(listTxt);
				nomAna.setText(null);
				nomAna.requestFocus();
			}
		});
		btnAnadir.setBounds(41, 37, 63, 23);
		JLst.add(btnAnadir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 94, 160, 106);
		JLst.add(scrollPane);
		
		JList jlistAna = new JList();
		scrollPane.setViewportView(jlistAna);
		jlistAna.setModel(mAmigos);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(247, 94, 109, 106);
		JLst.add(scrollPane_1);
		
		JList jsubList = new JList();
		scrollPane_1.setViewportView(jsubList);
		jsubList.setModel(mAnadidos);
		
		JButton btnpass1 = new JButton(">");
		btnpass1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jlistAna.getSelectedIndices().length > 0) {
		            int[] selectedIndices = jlistAna.getSelectedIndices();
		            //append selected to list2
		            for (int i = 0; i < selectedIndices.length; i++) {
		            	mAnadidos.addElement((String) mAmigos.getElementAt(selectedIndices[i]));
		            }
		            for (int i = selectedIndices.length - 1; i >= 0; i--) {
		            	mAmigos.removeElementAt(selectedIndices[i]);
		            }
				}
			}
		});
		btnpass1.setBounds(180, 108, 57, 14);
		JLst.add(btnpass1);
		
		JButton btnpassAll = new JButton(">>");
		btnpassAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 0; i < mAmigos.getSize(); i++) {
		            mAnadidos.addElement(mAmigos.elementAt(i));
		        }
		        //remove all list1 elements
		        for (int i = mAmigos.getSize() - 1; i >= 0; i--) {
		            mAmigos.removeElement(mAmigos.elementAt(i));
		        }
			}
		});
		btnpassAll.setBounds(180, 122, 57, 14);
		JLst.add(btnpassAll);
		
		JButton btndelAll = new JButton("<<");
		btndelAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < mAnadidos.getSize(); i++) {
		            mAmigos.addElement(mAnadidos.elementAt(i));
		        }
		        //remove all list1 elements
		        for (int i = mAnadidos.getSize() - 1; i >= 0; i--) {
		        	mAnadidos.removeElement(mAnadidos.elementAt(i));
		        }
			}
		});
		btndelAll.setBounds(180, 147, 57, 14);
		JLst.add(btndelAll);
		
		JButton btnDel1 = new JButton("<");
		btnDel1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (jsubList.getSelectedIndices().length > 0) {
					      int[] selectedIndices = jsubList.getSelectedIndices();
					            //append selected to list2
					            for (int i = 0; i < selectedIndices.length; i++) {
					            	mAmigos.addElement((String) jsubList.getModel().getElementAt(selectedIndices[i]));
					            }
					            for (int i = selectedIndices.length - 1; i >= 0; i--) {
					            	mAnadidos.removeElementAt(selectedIndices[i]);
					            }
					}
				}
		});
		btnDel1.setBounds(180, 161, 57, 14);
		JLst.add(btnDel1);
		
		JButton btnUp = new JButton("UP");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index=jsubList.getSelectedIndex();
					if(index == -1){
						JOptionPane.showMessageDialog(null, "Selecciona algún elemento para moverlo");
					}else if(index > 0){
						String strTemp=(String)mAnadidos.remove(index);
						mAnadidos.add(index -1, strTemp);
						jsubList.setSelectedIndex(index-1);
					}
			}
		});
		JButton btnDown = new JButton("DOWN");
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					int index=jsubList.getSelectedIndex();
						if(index == -1){
							JOptionPane.showMessageDialog(null, "Selecciona algún elemento para moverlo");
						}else if(index < mAnadidos.size()-1){
							String strTemp=(String)mAnadidos.remove(index);
							mAnadidos.add(index +1, strTemp);
							jsubList.setSelectedIndex(index +1);
						}
			}
			
		});
		btnDown.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnDown.setBounds(361, 147, 56, 28);
		JLst.add(btnDown);
		
		
		btnUp.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUp.setBounds(361, 102, 56, 28);
		JLst.add(btnUp);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 39, 422, 73);
		contentPane.add(panel);
		
		
	}
	
	private void calcularRes(String ope){
		try{
			
		
			double num1=Double.parseDouble(txtnum1.getText());
			double num2=Double.parseDouble(txtnum2.getText());	
			
			
			double suma=num1+num2;
			suma=(double)Math.round(suma*100) /100;
			double resta=num1-num2;
			resta=(double)Math.round(resta *100) /100;
			double multi=num1*num2;
			multi=(double)Math.round(multi*100) /100;
			double divi=num1/num2;
			divi=(double)Math.round(divi *100) /100;
			
			switch(ope){
			
			case "+":txtRes.setText(Double.toString(suma));break;
			case "-":txtRes.setText(Double.toString(resta));break;
			case "*":txtRes.setText(Double.toString(multi));break;
			case "/":txtRes.setText(Double.toString(divi));break;
			case "CE":txtnum1.setText("");txtnum2.setText("");txtRes.setText("");
					  txtnum1.requestFocus();break;
							
			}
		
		
			
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this,"Debes introducir valores númericos");
				txtnum1.setText("");
				txtnum2.setText("");
				txtRes.setText("");
				txtnum1.requestFocus();
				
		}
		
		
		
	}
}
