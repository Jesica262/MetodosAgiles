package Aplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Administrador;
import Class.DTOAdministrador;
import Controller.GestorAdministrador;
import Controller.LoginController;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField textContrasenia;
	private LoginController lc = new LoginController();
	GestorAdministrador ga = GestorAdministrador.get();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public InicioSesion() {
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tus datos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String usuario = txtUsuario.getText();
				String contrasenia= textContrasenia.getText();
				
				
				if(lc.validacionVacios(usuario, contrasenia)) {
					DTOAdministrador administradorABuscar = new DTOAdministrador(usuario,contrasenia);
					ArrayList<DTOAdministrador> listaAdministradores;
					try {
						listaAdministradores = ga.buscarAdministrador(administradorABuscar);
						
						if(!listaAdministradores.isEmpty()) {
							VendedorABM vendedorABM = new VendedorABM(listaAdministradores.get(0));
							vendedorABM.setVisible(true);
							vendedorABM.setLocationRelativeTo(null);
							dispose();
							
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
				}
				
//				administrador.setNombre(nombre);
//				try {
//					ga.guardar(administrador);
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				//	String user = txtUsuario.getText();
				//String password = textContrasenia.getText();
				//Boolean aux = lc.validacionVacios(user, password);
		/*		if(lc.validacionVacios(txtUsuario.getText().toString(), textContrasenia.getText().toString()))
				{
					Menu menu = new Menu();
					menu.setVisible(true);
					menu.setLocationRelativeTo(null);
					dispose();
				}
				else {
			
					informarError();
				}*/
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(166)
							.addComponent(btnNewButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(119)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(15))
		);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		
		textContrasenia = new JTextField();
		textContrasenia.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(64)
							.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textContrasenia, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblContrasea)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addComponent(textContrasenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void informarError() {
		JOptionPane.showMessageDialog(null, "Debe completar los datos faltantes");
		
	}
	
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}


	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}


	public JTextField getTextContrasenia() {
		return textContrasenia;
	}


	public void setTextContrasenia(JTextField textContrasenia) {
		this.textContrasenia = textContrasenia;
	}
}
