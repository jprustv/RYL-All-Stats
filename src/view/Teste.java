package view;
import model.*;
public class Teste {
	
	public static void main (String[] args){
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
		
		// Fim Adição Equipamento
		
		for (Equipment eqp:container.getEquipamentos()){
			System.out.println(eqp.getNome());
			System.out.println(eqp.getReqQuantity() + " " + eqp.getReqStat() + " " + eqp.getTipoEquip());
		    System.out.println("Dmg: " + eqp.getMaxStats().getDmgMin() + " ~ " + eqp.getMaxStats().getDmgMax());
		    System.out.println("Precisao: " + eqp.getMaxStats().getPrecisao());
		    System.out.println("Mana: " + eqp.getMaxStats().getMana());
		    System.out.println("Regeneração de Mana: "+ eqp.getMaxStats().getManaRegen());
			System.out.println("Critico: " + eqp.getMaxStats().getCritico());
			System.out.println("Bloqueio: " + eqp.getMaxStats().getBloqueio());
			System.out.println("===========================");
			
			EquipView EV1 = new EquipView(eqp);
			
		}
	}
}
