package view;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

import model.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Header_Filter extends JPanel {
	
	String equipamentosSelecionados;

	/**
	 * Create the panel.
	 */
	
	public void setEquipamentosSelecionados(String s){
		equipamentosSelecionados = s;
	}
	
	public String getEquipamentosSelecionados(){
		return equipamentosSelecionados;
	}
	
	public Header_Filter() {
		setBackground(Color.BLACK);
		setBorder(new LineBorder(Color.YELLOW, 2));
		setLayout(null);
		Dimension d = new Dimension();
		d.setSize(300, 100);
		setPreferredSize(d);

		JLabel lblNewLabel = new JLabel("Ra\u00E7a:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 55, 17);
		add(lblNewLabel);
		
		
		JPanel panelEquips = new JPanel();
		panelEquips.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		panelEquips.setBounds(83, 11, 188, 79);
		add(panelEquips);
		panelEquips.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panelReq = new JPanel();
		panelReq.setBounds(281, 11, 159, 79);
		add(panelReq);
		panelReq.setLayout(new GridLayout(0, 2, 0, 0));
		
		CBHandler CBHandler = new CBHandler(this);
		
		JRadioButton optRacaKR = new JRadioButton("KR");
		optRacaKR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelEquips.removeAll();
				for (TipoEquipamento TE: TipoEquipamento.values()){
					if (TE.toString().startsWith("KR")){
						JCheckBox jcb = new JCheckBox(TE.toString());
						panelEquips.add(jcb);
						jcb.addItemListener(CBHandler);
						panelEquips.revalidate();
					}
				}
				boolean selectedHasWeapon =false;
				boolean selectedHasArmor = false;
				for (Stats stat: Stats.values()){
					if (getEquipamentosSelecionados() == null || getEquipamentosSelecionados().isEmpty())
						return;
					List<String> selecionados = Arrays.asList(getEquipamentosSelecionados().split("\\s*,\\s*"));
					for (String i:selecionados){
						for (TipoEquipamento TE: TipoEquipamento.values()){
							if (i.equals(TE.toString())){
								if (TE.isWeapon()) selectedHasWeapon=true;
								if (TE.isArmor()) selectedHasArmor=true;
							}
						}
					}
				}
				
				System.out.println("Armor: "+ selectedHasArmor);
				System.out.println("Weapon: "+ selectedHasWeapon);
				equipamentosSelecionados = null;
			}
		});
		optRacaKR.setForeground(Color.WHITE);
		optRacaKR.setBackground(Color.BLACK);
		optRacaKR.setBounds(10, 35, 55, 23);
		add(optRacaKR);
		
		JRadioButton optRacaMK = new JRadioButton("MK");
		optRacaMK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelEquips.removeAll();
				for (TipoEquipamento TE: TipoEquipamento.values()){
					if (TE.toString().startsWith("MK")){
						JCheckBox jcb = new JCheckBox(TE.toString());
						panelEquips.add(jcb);
						jcb.addItemListener(CBHandler);
						panelEquips.revalidate();
					}
				}
			}
		});
		optRacaMK.setBackground(Color.BLACK);
		optRacaMK.setForeground(Color.WHITE);
		optRacaMK.setBounds(10, 55, 55, 23);
		add(optRacaMK);

		ButtonGroup optRaca = new ButtonGroup();
		optRaca.add(optRacaKR);
		optRaca.add(optRacaMK);
		
		
	}
}
