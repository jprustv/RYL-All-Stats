package view;

import javax.swing.JPanel;
import model.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;

public class EquipView extends JPanel {

	/**
	 * Create the panel.
	 */
	public EquipView(Equipment eqp) {
		String stat1="", stat2="", stat3="", stat4="", stat5="", stat6="", stat7="";
		
		if (eqp.getMaxStats().getStatsInfo().equals("armor")){
			stat1 = "Defesa:";
			stat2 = "Evasão:";
			stat3 = "Vida:";
			stat4 = "HP Rec:";
			stat5 = "Resist:";
			stat6 = "";
			stat7 = "";
		}
		if (eqp.getMaxStats().getStatsInfo().equals("weapon")){
			stat1 = "Dano:";
			stat2 = "Precisão:";
			stat3 = "Mana:";
			stat4 = "MP Rec:";
			stat5 = "Crítico:";
			stat6 = "Bloqueio:";
			stat7 = "";
		}
		if (eqp.getMaxStats().getStatsInfo().equals("shield")){
			stat1 = "Defesa:";
			stat2 = "Evasão:";
			stat3 = "Vida:";
			stat4 = "HP Rec:";
			stat5 = "Resist:";
			stat6 = "Bloqueio:";
			stat7 = "";
		}
		if (eqp.getMaxStats().getStatsInfo().equals("staff")){
			stat1 = "Dano:";
			stat2 = "Precisão:";
			stat3 = "Mana:";
			stat4 = "MP Rec:";
			stat5 = "Crítico:";
			stat6 = "Magic:";
			stat7 = "Bloqueio:";
		}
		
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setBorder(new LineBorder(new Color(255, 200, 0), 2));
		setLayout(null);
		
		JLabel lblNomeEquip = new JLabel(eqp.getNome());
		lblNomeEquip.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeEquip.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNomeEquip.setForeground(Color.LIGHT_GRAY);
		lblNomeEquip.setBounds(10, 11, 178, 23);
		add(lblNomeEquip);
		
		JLabel lblReq = new JLabel("Requer " + eqp.getReqQuantity() + " " + eqp.getReqStat() );
		lblReq.setFont(new Font("Arial", Font.PLAIN, 14));
		lblReq.setForeground(new Color(255, 222, 173));
		lblReq.setHorizontalAlignment(SwingConstants.CENTER);
		lblReq.setBounds(10, 54, 178, 23);
		add(lblReq);
		
		JLabel lblStat1 = new JLabel(stat1);
		lblStat1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStat1.setForeground(Color.WHITE) ;
		lblStat1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat1.setBounds(10, 88, 76, 17);
		add(lblStat1);
		
		JLabel lblStat1_Value;
		if (stat1.equals("Dano:"))
			lblStat1_Value = new JLabel(eqp.getMaxStats().getDmgMin()+" ~ "+eqp.getMaxStats().getDmgMax());
		else
			lblStat1_Value = new JLabel(eqp.getMaxStats().getDef()+"");
		lblStat1_Value.setHorizontalAlignment(SwingConstants.LEFT);
		lblStat1_Value.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat1_Value.setForeground(Color.LIGHT_GRAY);
		lblStat1_Value.setBounds(96, 89, 92, 14);
		add(lblStat1_Value);
		
		JLabel lblTipoEquip = new JLabel(eqp.getTipoEquip().toString());
		lblTipoEquip.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoEquip.setForeground(Color.WHITE);
		lblTipoEquip.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTipoEquip.setBounds(10, 33, 178, 23);
		add(lblTipoEquip);
		
		JLabel lblStat2 = new JLabel(stat2);
		lblStat2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStat2.setForeground(Color.WHITE);
		lblStat2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat2.setBounds(10, 108, 76, 17);
		add(lblStat2);
		
		JLabel lblStat2_Value;
		if (stat2.equals("Precisão:"))
			lblStat2_Value = new JLabel(eqp.getMaxStats().getPrecisao()+ "");
		else
			lblStat2_Value = new JLabel(eqp.getMaxStats().getEvade() + "");
		lblStat2_Value.setHorizontalAlignment(SwingConstants.LEFT);
		lblStat2_Value.setForeground(Color.LIGHT_GRAY);
		lblStat2_Value.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat2_Value.setBounds(96, 109, 92, 14);
		add(lblStat2_Value);
		
		JLabel lblStat3 = new JLabel(stat3);
		lblStat3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStat3.setForeground(Color.WHITE);
		lblStat3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat3.setBounds(10, 128, 76, 14);
		add(lblStat3);
		
		JLabel lblStat3_Value;
		if (stat3.equals("Mana:"))
			lblStat3_Value = new JLabel(eqp.getMaxStats().getMana() + "");
		else
			lblStat3_Value = new JLabel(eqp.getMaxStats().getHealth() + "");
		lblStat3_Value.setHorizontalAlignment(SwingConstants.LEFT);
		lblStat3_Value.setForeground(Color.LIGHT_GRAY);
		lblStat3_Value.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat3_Value.setBounds(96, 129, 92, 14);
		add(lblStat3_Value);
		
		JLabel lblStat4 = new JLabel(stat4);
		lblStat4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStat4.setForeground(Color.WHITE);
		lblStat4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat4.setBounds(10, 148, 76, 14);
		add(lblStat4);
		
		JLabel lblStat4_Value;
		if (stat4.equals("MP Rec:"))
			lblStat4_Value = new JLabel(eqp.getMaxStats().getManaRegen() + "");
		else
			lblStat4_Value = new JLabel(eqp.getMaxStats().getHealthRegen() + "");
		lblStat4_Value.setHorizontalAlignment(SwingConstants.LEFT);
		lblStat4_Value.setForeground(Color.LIGHT_GRAY);
		lblStat4_Value.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat4_Value.setBounds(96, 149, 92, 14);
		add(lblStat4_Value);
		
		JLabel lblStat5 = new JLabel(stat5);
		lblStat5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStat5.setForeground(Color.WHITE);
		lblStat5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat5.setBounds(10, 167, 76, 14);
		add(lblStat5);
		
		JLabel lblStat5_Value;
		if (stat5.equals("Crítico:"))
			lblStat5_Value = new JLabel(eqp.getMaxStats().getCritico()+ "");
		else
			lblStat5_Value = new JLabel(eqp.getMaxStats().getMagicResist()+ "");
		lblStat5_Value.setHorizontalAlignment(SwingConstants.LEFT);
		lblStat5_Value.setForeground(Color.LIGHT_GRAY);
		lblStat5_Value.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat5_Value.setBounds(96, 168, 92, 14);
		add(lblStat5_Value);
		
		JLabel lblStat6 = new JLabel(stat6);
		lblStat6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStat6.setForeground(Color.WHITE);
		lblStat6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat6.setBounds(10, 187, 76, 14);
		add(lblStat6);
		
		JLabel lblStat6_Value;
		if (stat6.equals("Bloqueio:"))
			lblStat6_Value = new JLabel(eqp.getMaxStats().getBloqueio() + "");
		else if (stat6.equals("Magic:"))
			lblStat6_Value = new JLabel(eqp.getMaxStats().getMagicPower() + "");
		else
			lblStat6_Value = new JLabel("");
		lblStat6_Value.setHorizontalAlignment(SwingConstants.LEFT);
		lblStat6_Value.setForeground(Color.LIGHT_GRAY);
		lblStat6_Value.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat6_Value.setBounds(96, 188, 92, 14);
		add(lblStat6_Value);
		
		JLabel lblStat7 = new JLabel(stat7);
		lblStat7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStat7.setForeground(Color.WHITE);
		lblStat7.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat7.setBounds(10, 207, 76, 15);
		add(lblStat7);
		
		JLabel lblStat7_Value;
		if (stat7.equals("Bloqueio:"))
			lblStat7_Value = new JLabel(eqp.getMaxStats().getBloqueio()+"");
		else
			lblStat7_Value = new JLabel("");
		lblStat7_Value.setHorizontalAlignment(SwingConstants.LEFT);
		lblStat7_Value.setForeground(Color.LIGHT_GRAY);
		lblStat7_Value.setFont(new Font("Arial", Font.PLAIN, 14));
		lblStat7_Value.setBounds(96, 208, 92, 14);
		add(lblStat7_Value);
		
	}
}
