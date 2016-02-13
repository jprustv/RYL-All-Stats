package model;

import java.util.List;

public class MaxStats{

	int dmgMin, dmgMax, precisao, mana, manaRegen, critico, bloqueio, magicPower;
	int def, evade, health, healthRegen, magicResist;
	
	TipoEquipamento tipoEquip;
	
	public MaxStats(TipoEquipamento tipoEquip) {
		this.tipoEquip = tipoEquip;
	}
	
	public String getStatsInfo(){
		if (this.tipoEquip == TipoEquipamento.KR_Armor || this.tipoEquip == TipoEquipamento.KR_Boots
				|| this.tipoEquip == TipoEquipamento.KR_Gloves || this.tipoEquip == TipoEquipamento.KR_Helmet
				|| this.tipoEquip == TipoEquipamento.MK_Armor || this.tipoEquip == TipoEquipamento.MK_Helmet
				|| this.tipoEquip == TipoEquipamento.MK_Pants || this.tipoEquip == TipoEquipamento.MK_GuardArm)
			return "armor";
		else if (this.tipoEquip == TipoEquipamento.KR_Axe_1h ||this.tipoEquip == TipoEquipamento.KR_Axe_2h
				|| this.tipoEquip == TipoEquipamento.KR_Blunt || this.tipoEquip == TipoEquipamento.KR_Bow
				|| this.tipoEquip == TipoEquipamento.KR_Dagger || this.tipoEquip == TipoEquipamento.KR_Hammer
				|| this.tipoEquip == TipoEquipamento.KR_Sword_1h || this.tipoEquip == TipoEquipamento.KR_Sword_2h
				|| this.tipoEquip == TipoEquipamento.MK_AttArm || this.tipoEquip == TipoEquipamento.MK_GunArm
				|| this.tipoEquip == TipoEquipamento.MK_ShadowArm || this.tipoEquip == TipoEquipamento.MK_Cimitarra
				|| this.tipoEquip == TipoEquipamento.MK_Clava || this.tipoEquip == TipoEquipamento.MK_Cutelo
				|| this.tipoEquip == TipoEquipamento.MK_Gadanha || this.tipoEquip == TipoEquipamento.MK_Garra
				|| this.tipoEquip == TipoEquipamento.MK_Porrete
		)
			return "weapon";
		else if (this.tipoEquip == TipoEquipamento.KR_Shield || this.tipoEquip == TipoEquipamento.MK_TemplarArm)
			return "shield";
		else if (this.tipoEquip == TipoEquipamento.KR_Staff || this.tipoEquip == TipoEquipamento.MK_Gadanha)
			return "staff";
		return null;
		
	}
	
	public int getDmgMin() {
		return dmgMin;
	}
	public void setDmgMin(int dmgMin) {
		this.dmgMin = dmgMin;
	}
	public int getDmgMax() {
		return dmgMax;
	}
	public void setDmgMax(int dmgMax) {
		this.dmgMax = dmgMax;
	}
	public int getPrecisao() {
		return precisao;
	}
	public void setPrecisao(int precisao) {
		this.precisao = precisao;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getManaRegen() {
		return manaRegen;
	}
	public void setManaRegen(int manaRegen) {
		this.manaRegen = manaRegen;
	}
	public int getCritico() {
		return critico;
	}
	public void setCritico(int critico) {
		this.critico = critico;
	}
	public int getBloqueio() {
		return bloqueio;
	}
	public void setBloqueio(int bloqueio) {
		this.bloqueio = bloqueio;
	}
	public int getMagicPower() {
		return magicPower;
	}
	public void setMagicPower(int magicPower) {
		this.magicPower = magicPower;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getEvade() {
		return evade;
	}
	public void setEvade(int evade) {
		this.evade = evade;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealthRegen() {
		return healthRegen;
	}
	public void setHealthRegen(int healthRegen) {
		this.healthRegen = healthRegen;
	}
	public int getMagicResist() {
		return magicResist;
	}
	public void setMagicResist(int magicResist) {
		this.magicResist = magicResist;
	}
	
	
	
}
