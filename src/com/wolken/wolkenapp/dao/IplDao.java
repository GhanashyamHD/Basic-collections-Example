package com.wolken.wolkenapp.dao;

import java.util.Iterator;
import java.util.List;

import com.wolken.wolkenapp.dto.TeamsDTO;


public interface IplDao {
	public void save(TeamsDTO dto) ;
		//teams.add(dto);
	public List<TeamsDTO>getAllTeams();
		/*List<TeamsDTO> teamsDTOs = new LinkedList<TeamsDTO>();
		Iterator <TeamsDto> itr= teams.iterator();
		while(itr.hasNext())
		{
			Object object = itr.next();
			teamsDTOs.add((TeamsDTO)object);
			System.out.println(object);
		}*/
	
	

}
