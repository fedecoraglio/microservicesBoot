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
	
	@GetMapping("/hi")
	public Iterable<Team> getTeams() {
		return teamDao.findAll();
	}
	
	@GetMapping("/ta/{id}")
	public Team getTeam(@PathVariable Long id){
		return teamDao.findById(id).get();
	}
	
}
