import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio1 frame = new Inicio1();
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
	public Inicio1() {
		
		

		setResizable(false);
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 Dimension pantalla, cuadro;
		  pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		  cuadro = this.getSize();
		  
		  this.setLocation(((pantalla.width - cuadro.width)/2),
		        (pantalla.height - cuadro.height)/2);
		
		JLabel lblAerolineasDelNorte = new JLabel("AEROLINEAS DEL NORTE CYP");
		lblAerolineasDelNorte.setFont(new Font("Freestyle Script", Font.PLAIN, 45));
		lblAerolineasDelNorte.setHorizontalAlignment(SwingConstants.CENTER);
		lblAerolineasDelNorte.setForeground(new Color(255, 165, 0));
		lblAerolineasDelNorte.setBackground(new Color(0, 0, 0));
		lblAerolineasDelNorte.setBounds(33, 95, 625, 92);
		contentPane.add(lblAerolineasDelNorte);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				aerolineas1 abrir = new aerolineas1();	
				abrir.setVisible(true);	
				
				Inicio1.this.dispose();
			}
			
		});
		
		JLabel lblA = new JLabel("A");
		lblA.setHorizontalTextPosition(SwingConstants.CENTER);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setForeground(new Color(255, 165, 0));
		lblA.setFont(new Font("Freestyle Script", Font.PLAIN, 40));
		lblA.setBounds(33, 67, 576, 51);
		contentPane.add(lblA);
		
		JLabel lblBienvenidos = new JLabel("BIENVENIDOS");
		lblBienvenidos.setFont(new Font("Freestyle Script", Font.PLAIN, 40));
		lblBienvenidos.setForeground(new Color(255, 165, 0));
		lblBienvenidos.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBienvenidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidos.setBounds(33, 11, 576, 73);
		contentPane.add(lblBienvenidos);
		button.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\boton-de-reproduccion.png"));
		button.setBounds(568, 352, 76, 73);
		contentPane.add(button);
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\USUARIO\\Downloads\\24df38295f3c2889a944d29305f4337f.jpg"));
		label.setBounds(-295, 0, 973, 897);
		contentPane.add(label);
	}
}
