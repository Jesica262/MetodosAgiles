package Aplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCliente extends JFrame {

	private JPanel contentPane;

	public MenuCliente() {
		setLocationRelativeTo(null);
		setBackground(SystemColor.inactiveCaption);
		setTitle("Menu");
		setForeground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(1, 1, 1, 1));
		menuBar.setForeground(SystemColor.desktop);
		menuBar.setBackground(UIManager.getColor("Button.shadow"));
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu menuVendedor = new JMenu("Vendedor");
		menuVendedor.setBackground(SystemColor.inactiveCaptionText);
		menuBar.add(menuVendedor);
		
		JMenuItem menuItemVendedor = new JMenuItem("ABM Vendedor");
		menuItemVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendedorABM vendedor = new VendedorABM();
				vendedor.setVisible(true);
				vendedor.setLocationRelativeTo(null);
			}
		});
		menuVendedor.add(menuItemVendedor);
		menuVendedor.addActionListener(null);
		
		JMenu menuCliente = new JMenu("Cliente");
		menuCliente.setBackground(Color.BLACK);
		menuBar.add(menuCliente);
		
		JMenuItem menuItemCliente = new JMenuItem("ABM Cliente");
		menuItemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteABM cliente = new ClienteABM();
				cliente.setVisible(true);
				cliente.setLocationRelativeTo(null);
			}
		});
		menuCliente.add(menuItemCliente);
		
		JMenu menuPorpietario = new JMenu("Propietario");
		menuPorpietario.setBackground(Color.BLACK);
		menuBar.add(menuPorpietario);
		
		JMenuItem menuItemPropietario = new JMenuItem("ABM Propietario");
		menuItemPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PropietarioABM propietario = new PropietarioABM();
				propietario.setVisible(true);
				propietario.setLocationRelativeTo(null);
			}
		});
		menuPorpietario.add(menuItemPropietario);
		
		JMenu menuInmueble = new JMenu("Inmueble");
		menuInmueble.setBackground(Color.BLACK);
		menuBar.add(menuInmueble);
		
		JMenuItem menuItemConsultaInmueble = new JMenuItem("Consultar Inmueble");
		menuItemConsultaInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarInmueble consulta = new ConsultarInmueble();
				consulta.setVisible(true);
				consulta.setLocationRelativeTo(null);
			}
		});
		menuInmueble.add(menuItemConsultaInmueble);
		
		JMenuItem menuItemInmueble = new JMenuItem("ABM Inmueble");
		menuItemInmueble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InmuebleABM inmueble = new InmuebleABM();
				inmueble.setVisible(true);
				inmueble.setLocationRelativeTo(null);
			}
		});
		menuInmueble.add(menuItemInmueble);
		
		JMenuItem menuItemCatalogo = new JMenuItem("Cat\u00E1logo de Inmuebles");
		menuItemCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Ver que agregar
			}
		});
		menuInmueble.add(menuItemCatalogo);
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
