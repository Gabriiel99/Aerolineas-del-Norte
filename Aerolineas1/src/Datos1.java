import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Datos1 extends JFrame {

	
	private JPanel contentPane;
	private JTextField apellidoo;
	private JTextField nombree;
	private JTextField doc;
	private JTextField emaill;
    public static String operador0, operador1, operador2;
    
    public  JComboBox hregreso;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos1 frame = new Datos1();
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
	public Datos1() {
		setResizable(false);
		setTitle("Datos");
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
		
		JLabel lblDatosDeLos = new JLabel("INFORMACION DE CONTACTO");
		lblDatosDeLos.setForeground(new Color(255, 255, 255));
		lblDatosDeLos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDatosDeLos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDeLos.setBounds(10, 20, 638, 37);
		contentPane.add(lblDatosDeLos);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(new Color(255, 255, 255));
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellido.setBounds(59, 68, 110, 37);
		contentPane.add(lblApellido);
		
	    JTextField apellidoo = new JTextField();
	    apellidoo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		apellidoo.addKeyListener(new KeyAdapter() {
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
		apellidoo.setBounds(56, 101, 279, 37);
		contentPane.add(apellidoo);
		apellidoo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(366, 69, 165, 34);
		contentPane.add(lblNombre);
		
		nombree = new JTextField();
		nombree.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		nombree.addKeyListener(new KeyAdapter() {
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
		nombree.setBounds(366, 101, 258, 37);
		contentPane.add(nombree);
		nombree.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setForeground(new Color(255, 255, 255));
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaDeNacimiento.setBounds(59, 149, 212, 37);
		contentPane.add(lblFechaDeNacimiento);
		
		JComboBox dia = new JComboBox();
		dia.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		dia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dia.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dia.setBounds(59, 197, 69, 37);
		contentPane.add(dia);
		
		JComboBox mes = new JComboBox();
		mes.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		mes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mes.setModel(new DefaultComboBoxModel(new String[] {"Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiempre", "Octubre", "Noviembre", "Diciembre"}));
		mes.setBounds(138, 197, 110, 37);
		contentPane.add(mes);
		
		JComboBox año = new JComboBox();
		año.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		año.setFont(new Font("Tahoma", Font.PLAIN, 16));
		año.setModel(new DefaultComboBoxModel(new String[] {"A\u00F1o", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940"}));
		año.setBounds(258, 197, 77, 37);
		contentPane.add(año);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGenero.setBounds(366, 163, 98, 23);
		contentPane.add(lblGenero);
		
		JComboBox genero = new JComboBox();
		genero.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		genero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		genero.setModel(new DefaultComboBoxModel(new String[] {"", "Masculino", "Femenino"}));
		genero.setBounds(364, 197, 100, 37);
		contentPane.add(genero);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setForeground(new Color(255, 255, 255));
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNacionalidad.setBounds(474, 163, 150, 23);
		contentPane.add(lblNacionalidad);
		
		JComboBox nacionalidad = new JComboBox();
		nacionalidad.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		nacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nacionalidad.setModel(new DefaultComboBoxModel(new String[] {"", "Argentina", "Bolivia", "Brasil", "Ecuador", "Peru", "Uruguay", "Venezuela"}));
		nacionalidad.setBounds(474, 197, 150, 37);
		contentPane.add(nacionalidad);
		
		JLabel lblTipoDeDocumento = new JLabel("Numero de Documento");
		lblTipoDeDocumento.setForeground(new Color(255, 255, 255));
		lblTipoDeDocumento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeDocumento.setBounds(59, 245, 276, 34);
		contentPane.add(lblTipoDeDocumento);
		
		JLabel lblNumero = new JLabel("E-mail");
		lblNumero.setForeground(new Color(255, 255, 255));
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumero.setBounds(366, 245, 258, 34);
		contentPane.add(lblNumero);
		
		doc = new JTextField();
		doc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		doc.addKeyListener(new KeyAdapter() {
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
	
		
		doc.setBounds(59, 290, 258, 37);
		contentPane.add(doc);
		doc.setColumns(10);
		
		JButton btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(new Color(255, 215, 0));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
                operador1 = nacionalidad.getSelectedItem().toString();
				operador2 = genero.getSelectedItem().toString();
				if(operador1=="" || operador2=="" ){
					
					JOptionPane.showMessageDialog(btnContinuar, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
				}else{
				{
					JOptionPane.showMessageDialog(btnContinuar, "  ¡ Muchas Gracias por su Compra !", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
				}
				{
					
					Itinerario1 abrir = new Itinerario1();	
					abrir.setVisible(true);
					
					Itinerario1.apellido.setText((String)apellidoo.getText());
					Itinerario1.nombre.setText((String)nombree.getText());
					Itinerario1.documento.setText((String)doc.getText());
					Itinerario1.email.setText((String)emaill.getText());

					
				}
					
				Datos1.this.dispose();
			
				}}});
		btnContinuar.setBounds(243, 388, 197, 37);
		contentPane.add(btnContinuar);
		
		emaill = new JTextField();
		emaill.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		emaill.setBounds(366, 290, 258, 37);
		contentPane.add(emaill);
		emaill.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\nombre (1).png"));
		label.setBounds(128, 68, 86, 37);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\nombre (1).png"));
		label_1.setBounds(438, 68, 46, 37);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\fecha.png"));
		label_2.setBounds(225, 149, 69, 37);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\patriota (1).png"));
		label_3.setBounds(579, 149, 69, 37);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\icon.png"));
		label_4.setBounds(424, 149, 60, 35);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\licencia-de-conducir.png"));
		label_5.setBounds(248, 245, 69, 34);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\forma-de-sobre-cerrado-negro.png"));
		label_6.setBounds(424, 245, 86, 37);
		contentPane.add(label_6);
	}
}
