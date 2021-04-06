package com.wolken.wolkenapp.dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.wolken.wolkenapp.dto.TeamsDTO;



public class IplDaoImpl  implements IplDao{
	public List<TeamsDTO>  teams = new LinkedList<TeamsDTO>();
	public void IplDaoImpl() {
		
	}
	@Override
	public void save(TeamsDTO dto) {
		teams.add(dto);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TeamsDTO> getAllTeams() {
		List<TeamsDTO> teamsDTOs = new LinkedList<TeamsDTO>();
		Iterator<TeamsDTO> itr = teams.iterator();
		while(itr.hasNext())
		{
			Object object = itr.next();
			teamsDTOs.add((TeamsDTO)object);
			System.out.println(object);
		// TODO Auto-generated method stub
		
	}
		return teamsDTOs;
	}
	

}
