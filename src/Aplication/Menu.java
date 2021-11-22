package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Insets;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("Menu");
		setForeground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 400);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(1, 1, 1, 1));
		menuBar.setForeground(SystemColor.desktop);
		menuBar.setBackground(UIManager.getColor("Button.shadow"));
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu menuVendedor = new JMenu("Vendedor");
		menuVendedor.setBackground(SystemColor.inactiveCaptionText);
		menuBar.add(menuVendedor);
		menuVendedor.add("Nuevo");
		menuVendedor.add("Eliminar");
		
		JMenu menuCliente = new JMenu("Cliente");
		menuCliente.setBackground(Color.BLACK);
		menuBar.add(menuCliente);
		menuCliente.add("Nuevo");
		
		JMenu menuPorpietario = new JMenu("Propietario");
		menuPorpietario.setBackground(Color.BLACK);
		menuBar.add(menuPorpietario);
		
		JMenu menuInmueble = new JMenu("Inmueble");
		menuInmueble.setBackground(Color.BLACK);
		menuBar.add(menuInmueble);
		menuInmueble.add("Agregar");
		menuInmueble.add("Consultar Inmueble");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 534, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Yesii\\eclipse-workspace\\busqueda-de-propiedades.jpg"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 534, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
