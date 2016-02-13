package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

class CBHandler implements ItemListener{

	String tipoEquipe;
	boolean isSelected;
	String selecionados = "";
	Header_Filter header_filter;
	
	public CBHandler(Header_Filter header_filter){
		this.header_filter = header_filter;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		int textIndex = e.getItem().toString().indexOf("text=");
		tipoEquipe = e.getItem().toString().substring(textIndex+5);
		tipoEquipe = tipoEquipe.replaceAll("]", "");
		
		if (e.getStateChange()==1) isSelected=true;
		else if	(e.getStateChange()==2) isSelected=false;
		
		if (this.isSelected()){
			selecionados+=tipoEquipe +",";
		}
		else{
			selecionados = selecionados.replace(tipoEquipe, "");
		}
		header_filter.setEquipamentosSelecionados(selecionados);
	
	}
	
	public String getSelecionados(){
		return selecionados;
	}
	
	public boolean isSelected(){
		return isSelected;
	}
	
}