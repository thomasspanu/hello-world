package fr.formation.inti.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DecisionBean {
	
	public String calcul() {
		return Math.random() < 0.5 ? "success" : "echec";
		}
}
