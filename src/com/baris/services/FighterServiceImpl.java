package com.baris.services;


import javax.jws.WebService;

import com.baris.domain.Fighter;

@WebService
public class FighterServiceImpl implements IFighterService {

	
	@Override
	public Fighter getFighterById(int id) {
		
		for(Fighter f: Fighter.getFighterList())
			
		{
			if(f.getId()==id)
				return f;
			
		}
		
		return null;
		
	}

	@Override
	public Fighter getFighterByName(String name) {
		
		for(Fighter f: Fighter.getFighterList())
			
			{
				if(f.getName().equals(name))
				return f;
			
			}
		
		return null;
		
	}



	

	

}
