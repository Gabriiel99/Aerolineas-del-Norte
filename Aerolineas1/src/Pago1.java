import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pago1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tarjeta;
	private JTextField cvc;
	private JTextField propietario;
	private JTextField numero;
	public  JTextField recibe2;
	public  static JTextField recibe;
	public static JTextField recibe1;
    public  ButtonGroup Efectivo;
  
    
 
    public static JComboBox doc ;
    public static JComboBox arroba,cuota;
    public static String operacion6, operacion1,operacion2, operacion9;
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pago1 frame = new Pago1();
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
	public Pago1() {
		setResizable(false);
		setTitle("Transaccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 465);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Dimension pantalla, cuadro;
		  pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		  cuadro = this.getSize();
		  
		  this.setLocation(((pantalla.width - cuadro.width)/2),
		        (pantalla.height - cuadro.height)/2);
		
		JButton Continuar = new JButton("CONTINUAR");
		Continuar.setEnabled(false);
		Continuar.setBackground(new Color(255, 215, 0));
		Continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//operacionn = recibee1.getSelectedText().toString();
				//operacion1 = tarjeta.getText().toString();
				operacion2 = cuota.getSelectedItem().toString();
				//operacion3 = propietario.getText().toString();
				//operacion4 = mes.getSelectedItem().toString();
				//operacion5 = año.getSelectedItem().toString();
				operacion6 = doc.getSelectedItem().toString();
			    //operacion8 = cuota.getSelectedItem().toString();
			  //  operacion9 = terminos.getSelectedIcon().toString();

			    if(operacion6=="" || operacion2=="" ){
				
			    	JOptionPane.showMessageDialog(Continuar, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);	    	
				}else{
					{
						JOptionPane.showMessageDialog(Continuar, "Ultimando Detalles...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
						Datos1 abrir = new Datos1();	
						abrir.setVisible(true);
						Pago1.this.dispose();
					}
				}}
		});
		Continuar.setBounds(241, 395, 192, 30);
		contentPane.add(Continuar);
		
		JButton boton = new JButton("CONTINUAR");
		boton.setBounds(241, 395, 192, 30);
		contentPane.add(boton);
		boton.setEnabled(false);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//operacion1 = tarjeta.getText().toString();
				//operacion2 = cvc.getText().toString();
				//operacion3 = propietario.getText().toString();
				//operacion4 = mes.getSelectedItem().toString();
				//operacion5 = año.getSelectedItem().toString();
				//operacion6 = doc.getSelectedItem().toString();
			    operacion1 = arroba.getSelectedItem().toString();
			  //  operacion9 = mail.getText().toString();

			    if(operacion1=="" ){
				
			    	JOptionPane.showMessageDialog(Continuar, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);	    	
				}else{
					{
						JOptionPane.showMessageDialog(Continuar, "Ultimando Detalles...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
						Datos1 abrir = new Datos1();	
						abrir.setVisible(true);  
						Pago1.this.dispose();
					}
				}
				
				
				
				
			}
		});
		boton.setBackground(new Color(255, 215, 0));
		
		JPanel panelTarjeta = new JPanel();
		panelTarjeta.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTarjeta.setBackground(new Color(178, 34, 34));
		panelTarjeta.setBounds(10, 98, 638, 286);
		contentPane.add(panelTarjeta);
		panelTarjeta.setLayout(null);
		
		JLabel lblNumeroDeLa = new JLabel("Numero de la tarjeta");
		lblNumeroDeLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroDeLa.setForeground(new Color(255, 255, 255));
		lblNumeroDeLa.setBounds(10, 11, 444, 14);
		panelTarjeta.add(lblNumeroDeLa);
		
		JLabel lblCvc = new JLabel("CVC");
		lblCvc.setForeground(Color.WHITE);
		lblCvc.setBounds(468, 11, 46, 14);
		panelTarjeta.add(lblCvc);
		
		JTextField tarjeta = new JTextField();
		tarjeta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
	char c = e.getKeyChar();
				
				if(Character.isLetter(c)) {
					getToolkit().beep();
					e.consume();
					
					JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
				
				}
			}
		});
		
       
		tarjeta.setBounds(10, 27, 444, 20);
		panelTarjeta.add(tarjeta);
		tarjeta.setColumns(10);
		
		
		cvc = new JTextField();
		cvc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
	char c = e.getKeyChar();
				
				if(Character.isLetter(c)) {
					getToolkit().beep();
					e.consume();
					
					JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
				}
			}
		});
		cvc.setBounds(468, 27, 86, 20);
		panelTarjeta.add(cvc);
		cvc.setColumns(10);
		
		JLabel lblNombreDeLa = new JLabel("Nombre del propietario de la tarjeta");
		lblNombreDeLa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreDeLa.setForeground(new Color(255, 255, 255));
		lblNombreDeLa.setBounds(10, 58, 618, 14);
		panelTarjeta.add(lblNombreDeLa);
		
		propietario = new JTextField();
		propietario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
char c = e.getKeyChar();
				
				if(Character.isDigit(c)) {
					getToolkit().beep();
					e.consume();
					
					JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
				}
			
			}
		});
		propietario.setBounds(10, 80, 618, 20);
		panelTarjeta.add(propietario);
		propietario.setColumns(10);
		
		JLabel lblVencimiento = new JLabel("Vencimiento");
		lblVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVencimiento.setForeground(new Color(255, 255, 255));
		lblVencimiento.setBounds(10, 109, 117, 14);
		panelTarjeta.add(lblVencimiento);
		
		JComboBox mes = new JComboBox();
		mes.setModel(new DefaultComboBoxModel(new String[] {"Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiempre", "Octubre", "Noviembre", "Diciembre"}));
		mes.setBounds(10, 134, 95, 20);
		panelTarjeta.add(mes);
		
		JComboBox año = new JComboBox();
		año.setModel(new DefaultComboBoxModel(new String[] {"A\u00F1o", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035"}));
		año.setBounds(115, 134, 63, 20);
		panelTarjeta.add(año);
		
		JLabel lblTipoDeDocumento = new JLabel("Tipo de Documento");
		lblTipoDeDocumento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeDocumento.setForeground(new Color(255, 255, 255));
		lblTipoDeDocumento.setBounds(188, 111, 135, 14);
		panelTarjeta.add(lblTipoDeDocumento);
		
		 doc = new JComboBox();
		doc.setModel(new DefaultComboBoxModel(new String[] {"", "DNI", "Pasaporte"}));
		doc.setBounds(188, 134, 109, 20);
		panelTarjeta.add(doc);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumero.setForeground(new Color(255, 255, 255));
		lblNumero.setBounds(328, 111, 300, 14);
		panelTarjeta.add(lblNumero);
		
		JTextField numero = new JTextField();
		numero.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
	char c = e.getKeyChar();
				
				if(Character.isLetter(c)) {
					getToolkit().beep();
					e.consume();
					
					JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
				}
			}
		});
		numero.setBounds(328, 134, 300, 20);
		panelTarjeta.add(numero);
		numero.setColumns(10);
		
		JLabel lblFormasDePago = new JLabel("Formas de pago");
		lblFormasDePago.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFormasDePago.setForeground(new Color(255, 255, 255));
		lblFormasDePago.setBounds(10, 165, 117, 14);
		panelTarjeta.add(lblFormasDePago);
		
		 cuota = new JComboBox();
		cuota.setModel(new DefaultComboBoxModel(new String[] {"", "1 Cuota", "Ahora 3", "Ahora 6", "Ahora 12"}));
		cuota.setBounds(10, 190, 618, 20);
		panelTarjeta.add(cuota);
		
		JCheckBox aceptar = new JCheckBox("Aceptar Terminos y Coindiciones.");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(aceptar.isSelected()) {
					Continuar.setEnabled(true);
				}else {
					Continuar.setEnabled(false);
				}
				
			}
		});
		aceptar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		aceptar.setBounds(10, 233, 618, 23);
		panelTarjeta.add(aceptar);
		
		JLabel label = new JLabel("");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\logotipo-de-visa.png"));
		label.setBounds(551, 0, 64, 61);
		panelTarjeta.add(label);
		
		JPanel panelContado = new JPanel();
		panelContado.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelContado.setBackground(new Color(178, 34, 34));
		panelContado.setVisible(false);
		panelContado.setBounds(10, 98, 638, 286);
		contentPane.add(panelContado);
		panelContado.setLayout(null);
		
		JLabel lblElijaMedioDe = new JLabel("Elija medio de pago");
		lblElijaMedioDe.setForeground(new Color(255, 255, 255));
		lblElijaMedioDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblElijaMedioDe.setBounds(10, 22, 618, 14);
		panelContado.add(lblElijaMedioDe);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(178, 34, 34));
		rdbtnNewRadioButton.setBounds(22, 62, 28, 23);
		panelContado.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(178, 34, 34));
		rdbtnNewRadioButton_1.setBounds(147, 62, 28, 23);
		panelContado.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBackground(new Color(178, 34, 34));
		rdbtnNewRadioButton_2.setBounds(258, 62, 28, 23);
		panelContado.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBackground(new Color(178, 34, 34));
		rdbtnNewRadioButton_3.setBounds(385, 62, 28, 23);
		panelContado.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("");
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBackground(new Color(178, 34, 34));
		rdbtnNewRadioButton_4.setBounds(502, 62, 28, 23);
		panelContado.add(rdbtnNewRadioButton_4);
		
		JLabel lblDireccionDeEmail_1 = new JLabel("Direccion de e-mail");
		lblDireccionDeEmail_1.setForeground(new Color(255, 255, 255));
		lblDireccionDeEmail_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccionDeEmail_1.setBounds(10, 110, 618, 14);
		panelContado.add(lblDireccionDeEmail_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(new Color(178, 34, 34));
		label_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\pagofacil.gif"));
		label_1.setBounds(58, 52, 72, 33);
		panelContado.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(new Color(178, 34, 34));
		label_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\rapipago.gif"));
		label_2.setBounds(181, 62, 71, 23);
		panelContado.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBackground(new Color(178, 34, 34));
		label_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\bapropagos.gif"));
		label_3.setBounds(292, 62, 72, 23);
		panelContado.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBackground(new Color(178, 34, 34));
		label_4.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\cargavirtual.gif"));
		label_4.setBounds(419, 62, 77, 23);
		panelContado.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBackground(new Color(178, 34, 34));
		label_5.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\cobroexpress.gif"));
		label_5.setBounds(536, 62, 75, 23);
		panelContado.add(label_5);
		  
		JLabel lblRealizar = new JLabel("REALIZAR PAGO");
		lblRealizar.setForeground(new Color(255, 255, 255));
		lblRealizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRealizar.setHorizontalAlignment(SwingConstants.LEFT);
		lblRealizar.setBounds(10, 11, 322, 24);
		contentPane.add(lblRealizar);
		
		JRadioButton TarjetasCredito = new JRadioButton("Tarjetas Credito/Debito");
		TarjetasCredito.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TarjetasCredito.setForeground(new Color(255, 255, 255));
		buttonGroup.add(TarjetasCredito);
		TarjetasCredito.setBackground(new Color(178, 34, 34));
		TarjetasCredito.setSelected(true);
		TarjetasCredito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(TarjetasCredito.isSelected()) {		
					panelTarjeta.setVisible(true);
					panelContado.setVisible(false);
					Continuar.setVisible(true);
					boton.setVisible(false);
				
					}else {
						
					}
			}
		});
		TarjetasCredito.setBounds(10, 42, 175, 23);
		contentPane.add(TarjetasCredito);
		
		JRadioButton Efectivo = new JRadioButton("Efectivo");
		Efectivo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Efectivo.setForeground(new Color(255, 255, 255));
		buttonGroup.add(Efectivo);
		Efectivo.setBackground(new Color(178, 34, 34));
		Efectivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Efectivo.isSelected()) {		
					panelTarjeta.setVisible(false);
					panelContado.setVisible(true);
					boton.setVisible(true);
					Continuar.setVisible(false);
					
					}else {
						
					}
			}
		});
		Efectivo.setBounds(10, 68, 109, 23);
		contentPane.add(Efectivo);
		
		JTextField mail = new JTextField();
		mail.setBounds(10, 141, 220, 20);
		panelContado.add(mail);
		mail.setColumns(10);
		
		JCheckBox terminos = new JCheckBox("Aceptar Terminos y Coindiciones.");
		terminos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(terminos.isSelected()) {
				    boton.setEnabled(true);
				}else {
					boton.setEnabled(false);
				}
				
			}
		});
		terminos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		terminos.setBounds(10, 237, 618, 23);
		panelContado.add(terminos);
		
		JLabel lblSiPagaEn = new JLabel("Si paga en contado usted dispondra de la accion de elegir el horario de su vuelo en la pantalla ITINERARIO.");
		lblSiPagaEn.setForeground(new Color(255, 255, 255));
		lblSiPagaEn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSiPagaEn.setBounds(10, 179, 618, 33);
		panelContado.add(lblSiPagaEn);
		
		JLabel Arroba = new JLabel("@");
		Arroba.setBounds(240, 144, 46, 14);
		panelContado.add(Arroba);
		
		 arroba = new JComboBox();
		arroba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(arroba.isShowing()) {
					Arroba.setVisible(false);
				}
			}
		});
		
		arroba.setModel(new DefaultComboBoxModel(new String[] {"", "@gmail.com", "@hotmail.com", "@yahoo.com", "@outlock.com", "@live.com"}));
		arroba.setBounds(233, 141, 120, 20);
		panelContado.add(arroba);
		
		JLabel lblTotalAPagar = new JLabel("TOTAL A PAGAR:");
		lblTotalAPagar.setBounds(224, 46, 104, 41);
		contentPane.add(lblTotalAPagar);
		
		JLabel lblArs = new JLabel("ARS");
		lblArs.setHorizontalTextPosition(SwingConstants.CENTER);
		lblArs.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblArs.setBounds(354, 42, 27, 45);
		contentPane.add(lblArs);
		
		recibe = new JTextField();
		recibe.setBackground(new Color(0, 255, 0));
		recibe.setBorder(null);
		recibe.setFont(new Font("Tahoma", Font.BOLD, 17));
		recibe.setHorizontalAlignment(SwingConstants.LEFT);
		recibe.setEditable(false);
		recibe.setBounds(383, 46, 89, 35);
		contentPane.add(recibe);
		recibe.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(214, 44, 268, 43);
		contentPane.add(panel);
	}
}
