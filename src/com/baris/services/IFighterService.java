package com.baris.services;

import com.baris.domain.Fighter;

public interface IFighterService {

	public Fighter getFighterById(int id);
	
	public Fighter getFighterByName(String name);
	
	
}

