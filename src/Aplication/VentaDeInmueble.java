package Aplication;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Cliente;
import Class.Inmueble;
import Class.Propietario;
import Controller.GestorCliente;
import Controller.GestorInmueble;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class VentaDeInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textCalle;
	private JTextField textNumero;
	private JTextField textProvincia;
	private JTextField textLocalidad;
	private JTextField textTipo;
	private JTextField textPrecio;
	GestorInmueble gI = new GestorInmueble();
	
	public VentaDeInmueble() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("Venta de Inmueble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.activeCaption);
		
		JLabel lblPropietarioX = new JLabel("INFORMACI\u00D3N DE LA VENTA");
		lblPropietarioX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(SystemColor.inactiveCaption);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione un Inmueble Reservado:");
		
		JComboBox comboInmuebleReservado = new JComboBox();
		
		List<Inmueble> inmuebles = new ArrayList<Inmueble>();
		
		try {
			inmuebles = gI.buscarTodos();
				
			comboInmuebleReservado.addItem("");
			for(Inmueble e: inmuebles)
			{
					
				comboInmuebleReservado.addItem(e.getCodigo());
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JButton btnventa = new JButton("Aceptar");
		btnventa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String inmueble = comboInmuebleReservado.getSelectedItem().toString();
				
				if(!comboInmuebleReservado.getSelectedItem().toString().equals(""))
				{	
					try {
						Inmueble i = gI.BuscarPorCodigo(inmueble);
						
						textCodigo.setText(i.getCodigo().toString());
						textCalle.setText(i.getCalle());;
						textNumero.setText(i.getNumeroCalle().toString());;
						textProvincia.setText(i.getProvincia());;
						textLocalidad.setText(i.getLocalidad());;
						textTipo.setText(i.getTipoInmueble());;
						textPrecio.setText(i.getPrecioVenta().toString());;
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
				}
				else {
					
					 mensajeDeSeleccion();
				}
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(61, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnventa, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(19))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(comboInmuebleReservado, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
							.addGap(190))))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel_2)
					.addGap(18)
					.addComponent(comboInmuebleReservado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnventa)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JButton btnAgregar = new JButton("Vender");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAgregar.setBackground(SystemColor.controlHighlight);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBackground(SystemColor.controlHighlight);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1_1.setBackground(SystemColor.inactiveCaption);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel("Caracteristicas:");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("C\u00F3digo:");
		
		textCodigo = new JTextField();
		textCodigo.setEditable(false);
		textCodigo.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("Calle:");
		
		textCalle = new JTextField();
		textCalle.setEditable(false);
		textCalle.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2_1_2 = new JLabel("N\u00FAmero de Calle:");
		
		textNumero = new JTextField();
		textNumero.setEditable(false);
		textNumero.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2_1_1_3 = new JLabel("Provincia:");
		
		textProvincia = new JTextField();
		textProvincia.setEditable(false);
		textProvincia.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_2 = new JLabel("Localidad:");
		
		textLocalidad = new JTextField();
		textLocalidad.setEditable(false);
		textLocalidad.setColumns(10);
		
		JLabel lblTipo_1 = new JLabel("Tipo de Inmueble:");
		
		textTipo = new JTextField();
		textTipo.setEditable(false);
		textTipo.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_1_1 = new JLabel("Precio de Venta:");
		
		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		textPrecio.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Datos del Inmueble Buscado");
		GroupLayout gl_panel_2_1_1 = new GroupLayout(panel_2_1_1);
		gl_panel_2_1_1.setHorizontalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel_1_1_1_2_1_1_2_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addComponent(textPrecio, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_2_1_1.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblNewLabel_1_1_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_1_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
									.addComponent(textCodigo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
									.addComponent(textCalle, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_1_1_1_2_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addComponent(textNumero, Alignment.LEADING)
									.addComponent(lblNewLabel_1_1_1_2_2, Alignment.LEADING)))
							.addGroup(gl_panel_2_1_1.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel_1_1_1_2_1_1_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addComponent(textProvincia, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1_1_1_2_1_1_2_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addComponent(textLocalidad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
						.addComponent(textTipo, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipo_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addGap(64))
		);
		gl_panel_2_1_1.setVerticalGroup(
			gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2_1_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2_1_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_2_1_1_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblNewLabel_1_1_1_2_1_1_2_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2_1_1.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1)
							.addGap(18)
							.addComponent(lblNewLabel_1_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblNewLabel_1_1_1_2_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel_2_1_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2_1_1.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1_2_1_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2_1_1.createSequentialGroup()
							.addComponent(lblTipo_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1_1_1_2_1_1_2_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1173)
					.addComponent(lblNewLabel_1_1_1_2_1_1_1_1)
					.addGap(31))
		);
		panel_2_1_1.setLayout(gl_panel_2_1_1);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(57)
					.addComponent(lblPropietarioX, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(260, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
							.addGap(29))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
								.addComponent(panel_2_1_1, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
							.addContainerGap())))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addComponent(lblPropietarioX)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2_1_1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAgregar))
					.addContainerGap(117, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 656, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(432, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void informarErrorDeAlta() {
		
		JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos para dar de alta el Inmueble");
		
	}
	public void mensajeExitosoDeAlta()
	{
		JOptionPane.showMessageDialog(null, "Inmueble dado de alta con exito");
	}
	public void mensajeDeSeleccion()
	{
		JOptionPane.showMessageDialog(null, "Debe seleccionar un Inmueble para poder buscar");
	}
}
