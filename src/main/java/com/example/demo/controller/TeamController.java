package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Team;

@RestController
public class TeamController {

	@Autowired TeamDao teamDao;
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamDao.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public Team getTeam(@PathVariable Long id){
		return teamDao.findById(id).get();
	}
	
}
