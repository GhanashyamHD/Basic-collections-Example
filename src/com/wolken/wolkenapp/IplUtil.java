package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dao.IplDao;
import com.wolken.wolkenapp.dao.IplDaoImpl;
import com.wolken.wolkenapp.dto.TeamsDTO;

public class IplUtil {
public static void main(String args[]) {
	TeamsDTO teams = new TeamsDTO(2 , "DElhi" , "DC");
	IplDao teamsDao = new IplDaoImpl();
	teamsDao.save(teams);
	teamsDao.getAllTeams();
	
}
}
