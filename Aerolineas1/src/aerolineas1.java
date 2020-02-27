import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

//import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.Calendar;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.DebugGraphics;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.Locale;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class aerolineas1 extends JFrame {

	private JPanel contentPane;
	
	public  JDateChooser partida;
	
	public  JDateChooser regreso;
	
	public static JComboBox origen;
	
	public static JComboBox destino;
	public static String operacion, operacion1, operacion2, operacion3;
    private JButton boton2, botonbuscar,elegir;
	
	DefaultTableModel model= new DefaultTableModel();
	
   private JDateChooser dFormat;
   
 	private JComboBox hregreso;
	
   int filas;
	
	private void Cerrar () {
		
		 Object [] opciones ={"Aceptar","Cancelar"};

		int eleccion = JOptionPane.showOptionDialog(rootPane, "Esta seguro que desea salir?", "Mensaje de confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if(eleccion == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}else if(eleccion==JOptionPane.NO_OPTION) {
			System.out.println("Se cancelo el cierre");
			
		}
		
		
	}
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable tabla;

	
      

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aerolineas1 frame = new aerolineas1();
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
	public aerolineas1() {
		setBackground(new Color(135, 206, 235));
		
		
		model.addColumn("Origen");
		model.addColumn("Destino");
		model.addColumn("Partida");
		model.addColumn("Regreso");
		
		
		setResizable(false);
		
     	
		setTitle("Aerolineas del Norte CyP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 465);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Arial", Font.BOLD, 11));
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setName("");
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		  Dimension pantalla, cuadro;
		  pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		  cuadro = this.getSize();
		  
		  this.setLocation(((pantalla.width - cuadro.width)/2),
		        (pantalla.height - cuadro.height)/2);
		contentPane.setLayout(null);
		
		JRadioButton Ida = new JRadioButton("Solo ida");
		Ida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				if(Ida.isSelected()) {
					
				    tabla.getColumnModel().getColumn(3).setMaxWidth(0);
					tabla.getColumnModel().getColumn(3).setMinWidth(0);
					tabla.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
					tabla.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
						
					}else {
						
					}
			}
			
		});
	
		Ida.setBounds(39, 88, 108, 23);
		Ida.setBackground(new Color(178, 34, 34));
		Ida.setForeground(new Color(255, 255, 255));
		buttonGroup.add(Ida);
		Ida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		contentPane.add(Ida);
		
		
		JRadioButton rdbtnIdavuelta = new JRadioButton("Ida y Vuelta");
		rdbtnIdavuelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnIdavuelta.isSelected()) {
					tabla.getColumnModel().getColumn(3).setMaxWidth(130);
					tabla.getColumnModel().getColumn(3).setMinWidth(130);
					tabla.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(130);
					tabla.getTableHeader().getColumnModel().getColumn(3).setMinWidth(130);
					
					
					
					}else {
						
					}
			}
		});
		rdbtnIdavuelta.setBounds(149, 88, 140, 23);
		rdbtnIdavuelta.setBackground(new Color(178, 34, 34));
		rdbtnIdavuelta.setForeground(new Color(255, 255, 255));
		rdbtnIdavuelta.setSelected(true);
		buttonGroup.add(rdbtnIdavuelta);
		rdbtnIdavuelta.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		contentPane.add(rdbtnIdavuelta);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setForeground(new Color(245, 255, 250));
		lblOrigen.setBounds(81, 135, 108, 41);
		lblOrigen.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		contentPane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setForeground(new Color(255, 255, 255));
		lblDestino.setBounds(338, 135, 100, 41);
		lblDestino.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		contentPane.add(lblDestino);
		
		JLabel lblPartida = new JLabel("Partida");
		lblPartida.setForeground(new Color(255, 255, 255));
		lblPartida.setBounds(214, 135, 100, 41);
		lblPartida.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		contentPane.add(lblPartida);
		
		JLabel lblNewLabel = new JLabel("Regreso");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(460, 138, 100, 35);
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JComboBox origen = new JComboBox();
		origen.setBounds(81, 170, 108, 21);
		origen.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		origen.setModel(new DefaultComboBoxModel(new String[] {"JUJUY", "SALTA", "TUCUM\u00C1N"}));
		origen.setSelectedItem("");
		contentPane.add(origen);
		//AutoCompleteDecorator.decorate(origen);
		
		JComboBox destino = new JComboBox();
		destino.setBounds(338, 170, 100, 20);
		destino.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		destino.setModel(new DefaultComboBoxModel(new String[] {"JUJUY", "SALTA", "TUCUM\u00C1N"}));
		destino.setSelectedItem("");
		contentPane.add(destino);
		//AutoCompleteDecorator.decorate(destino);
		
		
		JLabel lblVuelos = new JLabel("VUELOS");
		lblVuelos.setForeground(new Color(0, 0, 0));
		lblVuelos.setHorizontalAlignment(SwingConstants.CENTER);
		lblVuelos.setBounds(10, 11, 611, 81);
		lblVuelos.setFont(new Font("Freestyle Script", Font.PLAIN, 99));
		contentPane.add(lblVuelos);
		
		JButton BuscarVuelo1 = new JButton("");
		BuscarVuelo1.setVisible(false);
		BuscarVuelo1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\busqueda.png"));
		BuscarVuelo1.setForeground(new Color(0, 0, 0));
		BuscarVuelo1.setBackground(new Color(255, 255, 255));
		BuscarVuelo1.setBounds(624, 11, 34, 23);
		BuscarVuelo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				{
					JOptionPane.showMessageDialog(BuscarVuelo1, "Buscando su Destino...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
					}
				
				{
					
					String []BuscarVuelo = new String [4];
					BuscarVuelo[0]=(String)origen.getSelectedItem();
					BuscarVuelo[1]=(String)destino.getSelectedItem();
					
					SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
					BuscarVuelo[2]=(String)dFormat.format(partida.getDate());
				
					if (Ida.isSelected()) {
				          regreso.setEnabled(false);
				        } else {
				            regreso.setEnabled(true);
				        
					SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
					BuscarVuelo[3]=(String)dformat.format(regreso.getDate());
				            
				        }
				            model.addRow(BuscarVuelo);
					}}
				
			
		});
		BuscarVuelo1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		contentPane.add(BuscarVuelo1);
		
		JButton elegir = new JButton("");
		elegir.setForeground(new Color(178, 34, 34));
		elegir.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Pictures\\Screenshots\\busqueda.PNG"));
		elegir.setBorder(null);
		elegir.setVisible(false);
		elegir.setBackground(new Color(178, 34, 34));
		elegir.setBounds(197, 357, 273, 68);
		
		elegir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				operacion1 = destino.getSelectedItem().toString();
				operacion2 = origen.getSelectedItem().toString();
				
				if(operacion1 == operacion2){
					
					JOptionPane.showMessageDialog(BuscarVuelo1, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
				}else {
					
				{					
					JOptionPane.showMessageDialog(BuscarVuelo1, "Ultimando Detalles...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);
					}
				{
					
					Compra1 abrir = new Compra1();
					abrir.setVisible(true);
					Compra1.origenn.setText((String) origen.getSelectedItem());
					Compra1.destinoo.setText((String) destino.getSelectedItem());
					
				}
				
				aerolineas1.this.dispose();
				
			}}
		});
		elegir.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		contentPane.add(elegir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(135, 206, 235));
	
		scrollPane.setBounds(39, 214, 571, 132);
		contentPane.add(scrollPane);
		
		tabla = new JTable();
		tabla.setEnabled(false);
		tabla.setBackground(new Color(135, 206, 235));
		scrollPane.setViewportView(tabla);
		
		tabla.setModel(model);
		
	    partida = new JDateChooser();
	    partida.setBounds(214, 171, 100, 20);
		contentPane.add(partida);
		
	    
		
		regreso = new JDateChooser();
	    regreso.setBounds(460, 171, 100, 20);
	    regreso.getCalendarButton().addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mousePressed(MouseEvent arg0) {
	    		
	    		if (Ida.isSelected()) {
			          regreso.setEnabled(false);
			        } else {
			            regreso.setEnabled(true);
			        }
	    	}
	    });
		contentPane.add(regreso);

	 
		
		
		
		JButton boton2 = new JButton("");
		boton2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\plasmasearch_94630.png"));
		boton2.setBackground(new Color(178, 34, 34));
		boton2.setVisible(false);
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operacion=origen.getSelectedItem().toString();
				operacion1=destino.getSelectedItem().toString();
				
				if(boton2.isEnabled()) {
					
				}
				
				if(operacion1 == operacion){
					
					JOptionPane.showMessageDialog(BuscarVuelo1, "Seleccione los datos correspondiente", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
				}else{
					
					
				try {	
				String [] BuscarVuelo = new String [4];
				BuscarVuelo[0]=(String)origen.getSelectedItem();
				BuscarVuelo[1]=(String)destino.getSelectedItem();
				SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
				BuscarVuelo[2]=(String)dFormat.format(partida.getDate());
				
				if (Ida.isSelected()) {
			          regreso.setEnabled(false);
			        } else {
			            regreso.setEnabled(true);
			      
				SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");	
				BuscarVuelo[3]=(String)dformat.format(regreso.getDate());
			
			        }
				for ( int i = 0; i < tabla.getColumnCount(); i ++) {
				tabla.setModel(model);
				tabla.setValueAt(BuscarVuelo[i], filas, i);
				
				
				}
				}catch (Exception e1) {
					
					JOptionPane.showMessageDialog(BuscarVuelo1, "Error de datos. Vuelva a intentar", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);				
					
				}
				}
			}
			
		});
		boton2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		boton2.setBounds(566, 131, 81, 72);
		contentPane.add(boton2);
		
		JRadioButton botonbuscar = new JRadioButton("");
		botonbuscar.setHorizontalAlignment(SwingConstants.CENTER);
		botonbuscar.setHorizontalTextPosition(SwingConstants.CENTER);
		botonbuscar.setBackground(new Color(178, 34, 34));
		botonbuscar.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\plasmasearch_94630.png"));
		botonbuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operacion=origen.getSelectedItem().toString();
				operacion1=destino.getSelectedItem().toString();
				
				
				
				if(operacion == operacion1){
					{	
						JOptionPane.showMessageDialog(BuscarVuelo1, "Revise los campos ingresados", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);
						}
				}else{
					{	
					JOptionPane.showMessageDialog(BuscarVuelo1, "Buscando su Destino...", "Aerolineas CyP", JOptionPane.PLAIN_MESSAGE);				
					}
							
					try {
					String []BuscarVuelo = new String [4];
					BuscarVuelo[0]=(String)origen.getSelectedItem();
					BuscarVuelo[1]=(String)destino.getSelectedItem();
					
					SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
					BuscarVuelo[2]=(String)dFormat.format(partida.getDate());
					
					
				       if(botonbuscar.isSelected()) {
	                        boton2.setVisible(true);
	                        botonbuscar.setEnabled(false);
	                        elegir.setVisible(true);
	            	}else {	
	            		
	            	}
				       
				       if(botonbuscar.isSelected()) {
	                        
		            	}else {	
		            		boton2.setVisible(true);
	                        botonbuscar.setEnabled(false);
	                        elegir.setVisible(true);
		            	}
					
					
					
					
					if (Ida.isSelected()) {
				          regreso.setEnabled(false);
				        } else {
				            regreso.setEnabled(true);
				        
				     
				            
				            
					SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
					BuscarVuelo[3]=(String)dformat.format(regreso.getDate());
				      
					if(botonbuscar.isSelected()) {
	                        boton2.setVisible(true);
	                        botonbuscar.setEnabled(false);
	                        elegir.setVisible(true);
	            	}else {	
	            		
	            	}
				       
				       if(botonbuscar.isSelected()) {
	                        
		            	}else {	
		            		boton2.setVisible(true);
	                        botonbuscar.setEnabled(false);
	                        elegir.setVisible(true);
		            	}
				        }
			            model.addRow(BuscarVuelo);
				           
					}catch (Exception e1) {
						
						JOptionPane.showMessageDialog(BuscarVuelo1, "Error de datos. Vuelva a intentar", "Aerolineas CyP", JOptionPane.ERROR_MESSAGE);				
						
					}
					
					
					
				            }}
			
			
			
				 	
		});
		botonbuscar.setBounds(566, 131, 81, 72);
		contentPane.add(botonbuscar);
		partida.getJCalendar().setMinSelectableDate(new Date());
		regreso.getJCalendar().setMinSelectableDate(new Date());
		
		
		
}
}

