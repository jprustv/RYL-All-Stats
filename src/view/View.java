package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Container;
import model.Equipment;
import model.MaxStats;
import model.Nation;
import model.RequirementStat;
import model.TipoEquipamento;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.JInternalFrame;

public class View {

	private JFrame frame;
	private JPanel header,body;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
		teste();
	}

	public void teste(){
		Container container = new Container();
		
		// Adicionando Equipamento
		
		Equipment eqp1 = new Equipment("Syphorly", RequirementStat.DEX, 320, Nation.KR, TipoEquipamento.KR_Dagger);
		container.addEquipamento(eqp1);
		MaxStats eqp1_MS = new MaxStats(eqp1.getTipoEquip());
		eqp1_MS.setDmgMin(315);
		eqp1_MS.setDmgMax(437);
		eqp1_MS.setPrecisao(260);
		eqp1_MS.setMana(1200);
		eqp1_MS.setManaRegen(60);
		eqp1_MS.setCritico(140);
		eqp1_MS.setBloqueio(40);
		eqp1.setMaxStats(eqp1_MS);
		
		Equipment eqp2 = new Equipment("Staffzinha", RequirementStat.INT, 320, Nation.KR, TipoEquipamento.KR_Staff);
		container.addEquipamento(eqp2);
		MaxStats eqp2_MS = new MaxStats(eqp2.getTipoEquip());
		eqp2_MS.setDmgMin(200);
		eqp2_MS.setDmgMax(200);
		eqp2_MS.setPrecisao(200);
		eqp2_MS.setMana(10600);
		eqp2_MS.setManaRegen(120);
		eqp2_MS.setCritico(204);
		eqp2_MS.setBloqueio(56);
		eqp2_MS.setMagicPower(1040);
		eqp2.setMaxStats(eqp2_MS);		
		
		
		// Fim Adição Equipamento
		
		Header_Filter header_filter = new Header_Filter();
		header.add(header_filter);
		
		
		for (Equipment eqp:container.getEquipamentos()){
			EquipView EV = new EquipView(eqp);
			body.add(EV);
		}
		
		
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		
		frame.setTitle("RYL All Stats");
		
		frame.setBounds(100, 100, 472, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		header = new JPanel();
				
		frame.getContentPane().add(header, BorderLayout.NORTH);
		
		
		body = new JPanel();
		frame.getContentPane().add(body, BorderLayout.CENTER);
		body.setLayout(new GridLayout(1, 0, 0, 0));
		header.setLayout(new GridLayout(1, 0, 0, 0));
		
		
	}

}
