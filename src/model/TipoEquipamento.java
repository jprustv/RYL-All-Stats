package model;

public enum TipoEquipamento {
	KR_Dagger, KR_Blunt, KR_Hammer, KR_Sword_1h, KR_Sword_2h, KR_Staff, KR_Bow, KR_Axe_1h, KR_Axe_2h, KR_Armor, KR_Helmet, KR_Gloves, KR_Boots, KR_Shield,
	MK_Cutelo, MK_Porrete, MK_Cimitarra, MK_Garra, MK_AttArm, MK_GunArm, MK_ShadowArm, MK_Gadanha, MK_Clava, MK_Armor, MK_Helmet, MK_Pants, MK_GuardArm, MK_TemplarArm;

	public boolean isArmor(){
		if(this.equals(TipoEquipamento.KR_Armor))
			return true;
		return false;
	}

	public boolean isWeapon(){
		if (this.equals(TipoEquipamento.KR_Dagger))
			return true;
		return false;
	}
	
}
