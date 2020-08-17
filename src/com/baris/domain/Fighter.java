package com.baris.domain;

import java.util.ArrayList;
import java.util.List;

public class Fighter {

	private String name;
	private int id;
	
	public Fighter(int id,String name) {
		this.name=name;
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<Fighter> getFighterList() {
		 final List<Fighter> fighterList = new ArrayList<Fighter>();
		 fighterList.add(new Fighter(1,"Vladimir"));
		 fighterList.add(new Fighter(2,"Justin"));
		 fighterList.add(new Fighter(3,"Por"));
		 fighterList.add(new Fighter(4,"Ruslan"));
		 fighterList.add(new Fighter(5,"Badr"));
		 fighterList.add(new Fighter(6,"Colin"));
		 fighterList.add(new Fighter(7,"Jeshua"));
		 fighterList.add(new Fighter(8,"Mike"));
		 fighterList.add(new Fighter(1,"Khabib"));
		 
		 return fighterList;
			
	}
	
	
}
