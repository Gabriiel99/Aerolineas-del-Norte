import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Itinerario1 extends JFrame {

	private JPanel panel1;
	public static JTextField salida;
	public static JTextField regreso;
	public static JTextField apellido;
	public static JTextField nombre;
	public static JTextField documento;
	public static JTextField email;
    String cadena;
	

	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Itinerario1 frame = new Itinerario1();
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
	public Itinerario1() {
		
		
		
		setVisible(true);
		setBackground(new Color(72, 209, 204));
	
		setResizable(false);
		setTitle("\u00A1Disfruta del Viaje!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 465);
		panel1 = new JPanel();
		panel1.setBackground(new Color(178, 34, 34));
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel1);
		
		Dimension pantalla, cuadro;
		  pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		  cuadro = this.getSize();
		  
		  this.setLocation(((pantalla.width - cuadro.width)/2),
		        (pantalla.height - cuadro.height)/2);
		panel1.setLayout(null);
		  
		
		JLabel lblItinerario = new JLabel("ITINERARIO");
		lblItinerario.setForeground(new Color(255, 255, 255));
		lblItinerario.setBounds(10, 11, 334, 28);
		lblItinerario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel1.add(lblItinerario);
		
		JLabel lblSalida = new JLabel("SALIDA");
		lblSalida.setBounds(20, 50, 628, 20);
		lblSalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblSalida);
		
		JLabel lblVuelo = new JLabel("VUELO 842");
		lblVuelo.setBounds(60, 77, 103, 14);
		lblVuelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVuelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblVuelo);
		
		JLabel lblClaseZ = new JLabel("CLASE Z");
		lblClaseZ.setBounds(60, 102, 103, 14);
		lblClaseZ.setHorizontalAlignment(SwingConstants.CENTER);
		lblClaseZ.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblClaseZ);
		
		JLabel lblDuracionhs = new JLabel("Duracion 02:59hs");
		lblDuracionhs.setBounds(20, 138, 416, 14);
		lblDuracionhs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblDuracionhs);
		
		JLabel lblRegreso = new JLabel("REGRESO");
		lblRegreso.setBounds(20, 173, 628, 34);
		lblRegreso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblRegreso);
		
		JLabel lblVuelo_1 = new JLabel("VUELO 841");
		lblVuelo_1.setBounds(60, 212, 103, 14);
		lblVuelo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVuelo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblVuelo_1);
		
		JLabel lblClaseZ_1 = new JLabel("CLASE Z");
		lblClaseZ_1.setBounds(60, 237, 103, 14);
		lblClaseZ_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClaseZ_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblClaseZ_1);
		
		JLabel lblDuracionhs_1 = new JLabel("Duracion: 02:05hs");
		lblDuracionhs_1.setBounds(20, 280, 432, 14);
		lblDuracionhs_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblDuracionhs_1);
		
		JLabel lblContacto = new JLabel("CONTACTO");
		lblContacto.setBounds(25, 319, 427, 14);
		lblContacto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblContacto);
		
		JLabel lblNacimiento = new JLabel("Nombre:");
		lblNacimiento.setBounds(227, 344, 76, 14);
		lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblNacimiento);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(227, 380, 86, 20);
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblDocumento);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(20, 381, 60, 14);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel1.add(lblEmail);
		
		JPanel panel = new JPanel();
		panel.setBounds(243, 11, 182, 28);
		panel.setBackground(Color.GREEN);
		panel1.add(panel);
		
		JLabel lblReservaFrzx = new JLabel("Reserva : F5RZX63");
		panel.add(lblReservaFrzx);
		lblReservaFrzx.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservaFrzx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		salida = new JTextField();
		salida.setBounds(77, 50, 86, 20);
		salida.setFont(new Font("Tahoma", Font.BOLD, 11));
		salida.setForeground(new Color(0, 0, 0));
		salida.setText("MIERCOLES");
		salida.setOpaque(false);
		salida.setEditable(false);
		salida.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(salida);
		salida.setColumns(10);
		
		
		
		
		regreso = new JTextField();
		regreso.setBounds(88, 179, 86, 20);
		regreso.setFont(new Font("Tahoma", Font.BOLD, 11));
		regreso.setForeground(new Color(0, 0, 0));
		regreso.setText("JUEVES");
		regreso.setHorizontalAlignment(SwingConstants.CENTER);
		regreso.setOpaque(false);
		regreso.setEditable(false);
		panel1.add(regreso);
		regreso.setColumns(10);
		
		apellido = new JTextField();
		apellido.setBounds(77, 344, 139, 20);
		apellido.setEditable(false);
		apellido.setDisabledTextColor(new Color(255, 140, 0));
		apellido.setOpaque(false);
		apellido.setForeground(new Color(0, 0, 0));
		apellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		apellido.setHorizontalAlignment(SwingConstants.LEFT);
		panel1.add(apellido);
		apellido.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(291, 343, 129, 20);
		nombre.setEditable(false);
		nombre.setOpaque(false);
		nombre.setForeground(new Color(0, 0, 0));
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setHorizontalAlignment(SwingConstants.LEFT);
		panel1.add(nombre);
		nombre.setColumns(10);
		
		documento = new JTextField();
		documento.setBounds(311, 380, 109, 20);
		documento.setEditable(false);
		documento.setOpaque(false);
		documento.setForeground(new Color(0, 0, 0));
		documento.setFont(new Font("Tahoma", Font.BOLD, 11));
		documento.setHorizontalAlignment(SwingConstants.LEFT);
		panel1.add(documento);
		documento.setColumns(10);
		
		email = new JTextField();
		email.setBounds(77, 380, 139, 20);
		email.setOpaque(false);
		email.setEditable(false);
		email.setForeground(new Color(0, 0, 0));
		email.setFont(new Font("Tahoma", Font.BOLD, 11));
		email.setHorizontalAlignment(SwingConstants.LEFT);
		panel1.add(email);
		email.setColumns(10);
		
		JButton btnInicio = new JButton("");
		btnInicio.setBounds(460, 369, 45, 45);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Inicio1 abrir = new Inicio1();	
				abrir.setVisible(true);
				Itinerario1.this.dispose();
				
			}
		});
		panel1.add(btnInicio);
		btnInicio.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\icono-de-inicio-silueta.png"));
		
		JButton Estado = new JButton("");
		Estado.setBounds(603, 369, 45, 45);
		Estado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {

		            Desktop.getDesktop().browse(new URI("https://www.aa2000.com.ar/"));

		        } catch (URISyntaxException ex) {

		            System.out.println(ex);

		        }catch(IOException e1){

		            System.out.println(e1);

		        }
		      
		 }                                   
			
		});
		panel1.add(Estado);
		Estado.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\vuelo-en-avion.png"));
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(20, 344, 65, 14);
		panel1.add(lblApellido);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 42, 416, 372);
		panel_1.setBackground(new Color(255, 255, 255));
		panel1.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("-----------------------------------------------------------------------------------------------------------------");
		label.setBounds(0, 114, 452, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("-----------------------------------------------------------------------------------------------------------------");
		label_1.setBounds(0, 256, 452, 14);
		panel_1.add(label_1);
		
		JComboBox hsalida = new JComboBox();
		hsalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hsalida.setModel(new DefaultComboBoxModel(new String[] {"           Horarios", "  09:30hs ---  10:30hs", "  17:00hs ---  18:00hs", "  21:00hs ---  22:00hs"}));
		hsalida.setBounds(181, 47, 176, 20);
		panel_1.add(hsalida);
		
		JComboBox hregreso = new JComboBox();
		hregreso.setModel(new DefaultComboBoxModel(new String[] {"           Horarios", "  09:30hs ---  10:30hs", "  17:00hs ---  18:00hs", "  21:00hs ---  22:00hs"}));
		hregreso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hregreso.setBounds(181, 179, 176, 20);
		panel_1.add(hregreso);
		
		JButton btnImprimir = new JButton("");
		btnImprimir.setBounds(529, 369, 45, 45);
		btnImprimir.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\-print_89796.png"));
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrinterJob job = PrinterJob.getPrinterJob();
				job.setJobName("Print Data");
				
				job.setPrintable(new Printable(){
					public int print(Graphics pg,PageFormat pf, int pageNum) {	
						if(pageNum > 0) {
							return Printable.NO_SUCH_PAGE;
						}
						
						Graphics2D g2 = (Graphics2D)pg;
						g2.translate(pf.getImageableX(), pf.getImageableY());
						g2.scale(1.50, 1.40);
						
						panel1.paint(g2);
					
						
						return Printable.PAGE_EXISTS;
					}	
				
			
				});
				
				boolean ok = job.printDialog();
				if(ok) {
					try {
						job.print();
					}
					catch (PrinterException ex) {}
				}
				
			}
		});
		panel1.add(btnImprimir);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Pictures\\Screenshots\\tenor.gif"));
		label_2.setBounds(390, 21, 278, 342);
		panel1.add(label_2);
		
	}	
}
		
	
	
	
