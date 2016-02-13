package model;

public class Equipment {
	String nome;
	RequirementStat reqStat;
	int reqQuantity;
	Nation nation;
	TipoEquipamento tipoEquip;
	MaxStats maxStats;
	
	public Equipment(String nome, RequirementStat reqStat, int reqQuantity, Nation nation, TipoEquipamento tipoEquip){
		this.nome = nome;
		this.reqStat = reqStat;
		this.reqQuantity = reqQuantity;
		this.nation = nation;
		this.tipoEquip = tipoEquip;
	}
	
	public void setMaxStats(MaxStats maxStats){
		this.maxStats = maxStats;
	}
	
	public Equipment getEquipamento(){
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public RequirementStat getReqStat() {
		return reqStat;
	}

	public void setReqStat(RequirementStat reqStat) {
		this.reqStat = reqStat;
	}

	public int getReqQuantity() {
		return reqQuantity;
	}

	public void setReqQuantity(int reqQuantity) {
		this.reqQuantity = reqQuantity;
	}

	public Nation getNation() {
		return nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	public TipoEquipamento getTipoEquip() {
		return tipoEquip;
	}

	public void setTipoEquip(TipoEquipamento tipoEquip) {
		this.tipoEquip = tipoEquip;
	}

	public MaxStats getMaxStats() {
		return maxStats;
	}
	
	
	
	
}
