package Aplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.Inmueble;
import Class.Propietario;
import Controller.GestorInmueble;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Font;

public class ConsultarInmueble extends JFrame {

	private JPanel contentPane;
	private JTextField textBarrio;
	private GestorInmueble gI = new GestorInmueble();
	
	public ConsultarInmueble() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("Consultar Inmueble");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.activeCaption);
		
		JLabel lblVendedorX = new JLabel("CONSULTAR INMUEBLE");
		lblVendedorX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox comboCantDormitorio = new JComboBox();
		
		comboCantDormitorio.setModel(new DefaultComboBoxModel(new String[] {"","1","2","3","4","5","6"}));
		
		textBarrio = new JTextField();
		textBarrio.setColumns(10);
		
		JComboBox comboProvincia = new JComboBox();
		
		JLabel lblNewLabel_1_1 = new JLabel("Localidad:");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tipo:");
		
		JComboBox comboLocalidad = new JComboBox();
		
		JComboBox comboTipoBarrio = new JComboBox();
	
		comboProvincia.setModel(new DefaultComboBoxModel(new String[] {"", "Santa fe", "Neuquen", "Jujuy", "Salta", "Catamarca", "Rio Negro", "La Pampa", "Misiones", "Corriente", "Santiago de estero", "Tucuman", "Entre Rios"}));
	
		comboLocalidad.setModel(new DefaultComboBoxModel(new String[] {"", "Rosario", "Santa Fe", "Resistencia", "Santo Tome", "Rincon", "Sauce"}));
		
		comboTipoBarrio.setModel(new DefaultComboBoxModel(new String[] {"", "L", "C", "D", "T", "Q", "G"}));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.controlHighlight);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*	List<Inmueble> inmueble = new ArrayList<Inmueble>();
				
				
				try {
					inmueble = gI.buscarTodos();
				} catch (Exception e1) {
					e1.printStackTrace();
				}*/		
				String provincia = comboProvincia.getSelectedItem().toString();
				String localidad = comboLocalidad.getSelectedItem().toString();
				String barrio = comboTipoBarrio.getSelectedItem().toString();
				String dormitorio = comboCantDormitorio.getSelectedItem().toString();
				
				
			}	
		});
		btnBuscar.setBackground(SystemColor.controlHighlight);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.activeCaption);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(SystemColor.activeCaption);
		
		JLabel lblNewLabel_1_3 = new JLabel("PRECIO");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JComboBox comboPrecioMin = new JComboBox();
		
		comboPrecioMin.setModel(new DefaultComboBoxModel(new String[] {"","0","100000","250000","500000","1000000"}));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Maximo:");
		
		JComboBox comboPrecioMax = new JComboBox();
	
		comboPrecioMax.setModel(new DefaultComboBoxModel(new String[] {"", "100000", "250000", "500000", "1000000", "5000000"}));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Minimo:");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(18, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(427))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboPrecioMin, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboPrecioMax, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(16)
					.addComponent(lblNewLabel_1_3)
					.addGap(23)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1_1)
						.addComponent(lblNewLabel_1_1_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboPrecioMin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboPrecioMax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(65)
					.addComponent(lblVendedorX, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(228, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(333, Short.MAX_VALUE)
					.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(21)
					.addComponent(lblVendedorX)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnBuscar))
					.addGap(23))
		);
		
		JLabel lblNewLabel_1 = new JLabel("Provincia:");
		
		JLabel lblNewLabel_1_2 = new JLabel("Barrio:");
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Cant. Dormitorios:");
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(comboCantDormitorio, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_2_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addComponent(textBarrio, Alignment.LEADING)
						.addComponent(comboProvincia, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboTipoBarrio, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboLocalidad, 0, 222, Short.MAX_VALUE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(10)
							.addComponent(comboProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1_1)
							.addGap(10)
							.addComponent(comboLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_2)
						.addComponent(lblNewLabel_1_2_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textBarrio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboTipoBarrio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_1_2_2)
					.addGap(14)
					.addComponent(comboCantDormitorio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 574, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 501, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
}
