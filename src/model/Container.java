package model;

import java.util.LinkedList;
import java.util.List;

public class Container implements Subject {
	
	private List<Equipment> equipamentos;
	
	public Container(){
		equipamentos = new LinkedList<Equipment>();
	}
	public void addEquipamento(Equipment eqp){
		equipamentos.add(eqp);
		notifyObserversAdd();
	}
	
	public void removeEquipamento(Equipment eqp){
		equipamentos.remove(eqp);
	}
	
	public List<Equipment> getEquipamentos(){
		return equipamentos;
	}
	
	@Override
	public void notifyObserversAdd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserversSearch(List result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserversAddMusica() {
		// TODO Auto-generated method stub
		
	}
	
}
