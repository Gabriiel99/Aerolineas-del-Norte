import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.beans.PropertyChangeListener;
import java.util.Formatter;
import java.beans.PropertyChangeEvent;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JToggleButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Compra1 extends JFrame {
	
	

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
   
	DefaultTableModel model= new DefaultTableModel();
	public static JTextField origenn;
	public static JTextField destinoo;
	private JTextField Cantidad;
	public JCheckBox Reembolso;
	public JCheckBox Bebidas;
	private  JCheckBox Valijas;
	private JTextField Total;
	public  JTextField Tootal;
	private JComboBox clase;
	private JToggleButton Basico;
	private JToggleButton Intermedio;
	private JToggleButton Premiun;
	public  JTextPane Intermedioo;
	public  JTextPane Premiunn;
	public  JTextPane Basicoo;
	private JEditorPane basico;
	private JEditorPane intermedio;
	private JEditorPane premiun;
	private JTextField Impuestos;
	private JTextField Emision;
	private JLabel lblTotal;
	private JLabel Emisien;
	private JLabel Impueste;
	private JLabel Tarife;
	private JLabel lblArs;
	protected String cadena;
	
	private JToggleButton iday;
	private JTextField n5;
	public static String dest;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JPanel panel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compra1 frame = new Compra1();
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
	public Compra1() {
		setTitle("Compra");
		
		
		setResizable(false);
		setBackground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 465);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\avion-negro (2).png"));
		label.setBounds(294, 67, 76, 59);
		contentPane.add(label);
		
		JLabel lblDetallesDelVuelo = new JLabel("DETALLES DEL VUELO");
		lblDetallesDelVuelo.setForeground(new Color(255, 255, 255));
		lblDetallesDelVuelo.setBackground(new Color(255, 255, 255));
		lblDetallesDelVuelo.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblDetallesDelVuelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDetallesDelVuelo.setBounds(10, 11, 640, 30);
		contentPane.add(lblDetallesDelVuelo);
		
		Dimension pantalla, cuadro;
		  pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		  cuadro = this.getSize();
		  
		  this.setLocation(((pantalla.width - cuadro.width)/2),
		        (pantalla.height - cuadro.height)/2);
				
		
		JLabel lblCantidadDePasajeros = new JLabel("Cantidad de Pasajeros :  ");
		lblCantidadDePasajeros.setForeground(new Color(255, 255, 255));
		lblCantidadDePasajeros.setFont(new Font("Segoe UI Emoji", Font.BOLD, 11));
		lblCantidadDePasajeros.setHorizontalTextPosition(SwingConstants.LEFT);
		lblCantidadDePasajeros.setBounds(32, 137, 199, 51);
		contentPane.add(lblCantidadDePasajeros);
		
		JTextField Tootal = new JTextField("8383.94");
		Tootal.setEditable(false);
		Tootal.setForeground(new Color(255, 255, 255));
		Tootal.setBorder(null);
		Tootal.setOpaque(false);
		Tootal.setBackground(SystemColor.menu);
		Tootal.setFont(new Font("Segoe UI Emoji", Font.BOLD, 31));
		Tootal.setHorizontalAlignment(SwingConstants.TRAILING);
		Tootal.setBounds(433, 328, 198, 53);
		contentPane.add(Tootal);
		Tootal.setColumns(10);
		
		
		
		JButton btnComprar = new JButton("Continuar");
		btnComprar.setBackground(new Color(255, 255, 0));
		btnComprar.setBounds(433, 392, 198, 23);
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pago1 abrir1 = new Pago1();
				abrir1.setVisible(true);
				Compra1.this.dispose();
				Pago1.recibe.setText((String)Tootal.getText());
					
			}	
			
		});
		
		Impueste = new JLabel("ARS");
		Impueste.setForeground(new Color(255, 255, 255));
		Impueste.setBounds(551, 215, 46, 14);
		contentPane.add(Impueste);
		
		lblArs = new JLabel("ARS");
		lblArs.setForeground(new Color(255, 255, 255));
		lblArs.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 23));
		lblArs.setBounds(443, 328, 56, 53);
		contentPane.add(lblArs);
		
		Tarife = new JLabel("ARS");
		Tarife.setForeground(new Color(255, 255, 255));
		Tarife.setBounds(551, 171, 46, 14);
		contentPane.add(Tarife);
		contentPane.add(btnComprar);
		
		origenn = new JTextField();
		origenn.setForeground(new Color(255, 255, 255));
		origenn.setBorder(null);
		origenn.setBackground(new Color(178, 34, 34));
		origenn.setBounds(10, 52, 283, 74);
		origenn.setHorizontalAlignment(SwingConstants.CENTER);
		origenn.setEditable(false);
		origenn.setFont(new Font("Tahoma", Font.PLAIN, 50));
		contentPane.add(origenn);
		origenn.setColumns(10);
		
		destinoo = new JTextField();
		destinoo.setForeground(new Color(255, 255, 255));
		destinoo.setBorder(null);
		destinoo.setBackground(new Color(178, 34, 34));
		destinoo.setBounds(367, 52, 283, 74);
		destinoo.setHorizontalAlignment(SwingConstants.CENTER);
		destinoo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		destinoo.setEditable(false);
		contentPane.add(destinoo);
		destinoo.setColumns(10);
		
		Cantidad = new JTextField();
		Cantidad.setText("1");
		Cantidad.setToolTipText("");
		Cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		Cantidad.setBounds(178, 152, 21, 20);
		contentPane.add(Cantidad);
		Cantidad.setColumns(10);
		
		Total = new JTextField();
		Total.setForeground(new Color(255, 255, 255));
		Total.setBorder(null);
		Total.setOpaque(false);
		Total.setBackground(SystemColor.menu);
		Total.setHorizontalAlignment(SwingConstants.RIGHT);
		Total.setBounds(571, 168, 60, 20);
		Total.setEditable(false);
		contentPane.add(Total);
		Total.setColumns(10);
		
		Emisien = new JLabel("ARS");
		Emisien.setForeground(new Color(255, 255, 255));
		Emisien.setBounds(551, 269, 46, 14);
		contentPane.add(Emisien);
		
		Impuestos = new JTextField();
		Impuestos.setForeground(new Color(255, 255, 255));
		Impuestos.setBorder(null);
		Impuestos.setOpaque(false);
		Impuestos.setBackground(SystemColor.menu);
		Impuestos.setHorizontalAlignment(SwingConstants.RIGHT);
		Impuestos.setEditable(false);
		Impuestos.setBounds(571, 212, 60, 20);
		contentPane.add(Impuestos);
		Impuestos.setColumns(10);
		
		Emision = new JTextField();
		Emision.setForeground(new Color(255, 255, 255));
		Emision.setBorder(null);
		Emision.setBackground(new Color(178, 34, 34));
		Emision.setHorizontalAlignment(SwingConstants.RIGHT);
		Emision.setEditable(false);
		Emision.setBounds(571, 266, 60, 20);
		Emision.setText("125");
		contentPane.add(Emision);
		Emision.setColumns(10);
		
		
		
		Basico = new JToggleButton("BASICO");
		Basico.setSelected(true);
		Basico.setForeground(new Color(0, 0, 0));
		Basico.setBackground(new Color(0, 128, 128));
		Basico.setBounds(10, 199, 121, 23);
		Basico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (Basico.isSelected()) {
					
					basico.setVisible(true);
					intermedio.setVisible(false);
					premiun.setVisible(false);
					Total.setVisible(true);
					Total.setText("4545.00");
					Impuestos.setText("3713.94");
					
			        } else {
			        }
				
				{
					double n1 = Double.parseDouble(Total.getText());
					double n2 = Double.parseDouble(Cantidad.getText());
					double n3 = Double.parseDouble(Impuestos.getText());
					double n4 = Double.parseDouble(Emision.getText());
				    Tootal.setText(String.valueOf(n1*n2+n3+n4));
				}
			}
		});
	
		
		
		buttonGroup.add(Basico);
		contentPane.add(Basico);
		
		Intermedio = new JToggleButton("INTERMEDIO");
		Intermedio.setForeground(new Color(0, 0, 0));
		Intermedio.setBackground(new Color(124, 252, 0));
		Intermedio.setBounds(141, 199, 121, 23);
		Intermedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                    if (Intermedio.isSelected()) {
					
					basico.setVisible(false);
					intermedio.setVisible(true);
					premiun.setVisible(false);
					Total.setVisible(true);
					Total.setText("5213.00");
					Impuestos.setText("4023.15");
			        } else {	            
			        }
                    {
                    	double n1 = Double.parseDouble(Total.getText());
        				double n2 = Double.parseDouble(Cantidad.getText());
        				double n3 = Double.parseDouble(Impuestos.getText());
        				double n4 = Double.parseDouble(Emision.getText());
        			    Tootal.setText(String.valueOf(n1*n2+n3+n4));
                    }
			}
		});
		buttonGroup.add(Intermedio);
		contentPane.add(Intermedio);
		
		Premiun = new JToggleButton("PREMIUN");
		Premiun.setForeground(new Color(0, 0, 0));
		Premiun.setBackground(new Color(255, 215, 0));
		Premiun.setBounds(278, 199, 121, 23);
		Premiun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                    if (Premiun.isSelected()) {
					
					basico.setVisible(false);
					intermedio.setVisible(false);
					premiun.setVisible(true);
					Total.setVisible(true);
					Total.setText("6680.00");
					Impuestos.setText("4704.93");
			        } else {    	
			}
                    {
                    	double n1 = Double.parseDouble(Total.getText());
        				double n2 = Double.parseDouble(Cantidad.getText());
        				double n3 = Double.parseDouble(Impuestos.getText());
        				double n4 = Double.parseDouble(Emision.getText());
        			    Tootal.setText(String.valueOf(n1*n2+n3+n4));
                    }
			}
		});
		buttonGroup.add(Premiun);
		contentPane.add(Premiun);
		
		basico = new JEditorPane();
		basico.setForeground(new Color(255, 255, 255));
		basico.setBackground(new Color(178, 34, 34));
		basico.setBounds(10, 233, 152, 165);
		basico.setText("\u263CCheck-in Online\r\n\u263C Bebida\r\n\r\n\u25C4Buscas despachar \r\nequipaje y mas opciones\r\nen tu vuelo?\r\nPrueba la tarifa intermedia");
		contentPane.add(basico);
		
		intermedio = new JEditorPane();
		intermedio.setForeground(new Color(255, 255, 255));
		intermedio.setBackground(new Color(178, 34, 34));
		intermedio.setBounds(138, 233, 121, 165);
		intermedio.setVisible(false);
		intermedio.setText("\u263C Check-in Online\r\n\u263CBebida\r\n\u263C1 valija de 15kg\r\n\r\n\u25C4Quer\u00E9s despachar dos valijas y\r\npoder cambiar tu \r\npasaje? \r\nEleg\u00ED tarifa premium.");
		contentPane.add(intermedio);
		
		premiun = new JEditorPane();
		premiun.setForeground(new Color(255, 255, 255));
		premiun.setBackground(new Color(178, 34, 34));
		premiun.setBounds(285, 236, 138, 162);
		premiun.setVisible(false);
		premiun.setText("\u263CCheck-in Online\r\n\u263CBebida\r\n\u263C2 valijas de 23kg \r\ncada una\r\n\u263CCambio o reembolso\r\nde tu viaje.\r\n\u263CIncluye: Checkin en\r\naeropuerto.");
		contentPane.add(premiun);
		
		JEditorPane campo = new JEditorPane();
		campo.setForeground(new Color(255, 255, 255));
		campo.setEditable(false);
		campo.setBackground(new Color(178, 34, 34));
		campo.setBounds(433, 152, 198, 155);
		campo.setText("\r\nTarifa :\r\n------------------------------------------------\r\n\r\nImpuestos:\r\n------------------------------------------------\r\n\r\nCosto de Emision:\r\n------------------------------------------------");
		contentPane.add(campo);
		
		lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(new Color(255, 255, 255));
		lblTotal.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 20));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTotal.setBounds(433, 312, 198, 23);
		contentPane.add(lblTotal);
		
		JToggleButton ida = new JToggleButton("IDA");
		ida.setEnabled(false);
		ida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (ida.isSelected()) {
					
					double n1 = Double.parseDouble(Tootal.getText());
				    Tootal.setText(String.valueOf(n1/2));
				    
				    ida.setEnabled(false);
				    iday.setEnabled(true);
				    
				}
				
				
				
				
		
				
			}
		});
		buttonGroup_1.add(ida);
		ida.setBounds(209, 150, 56, 23);
		contentPane.add(ida);
		
	 iday = new JToggleButton("IDA Y VUELTA");
		iday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
	if (iday.isSelected()) {
					
					ida.setEnabled(true);
	
			
					double n1 = Double.parseDouble(Tootal.getText());
				    Tootal.setText(String.valueOf(n1*2));
				    
				iday.setEnabled(false);
				}
				
			}
		});
		buttonGroup_1.add(iday);
		iday.setBounds(275, 150, 121, 23);
		contentPane.add(iday);
		
		
	}
	}

