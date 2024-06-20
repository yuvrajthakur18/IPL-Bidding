package com.yuvraj.service;

import com.yuvraj.model.Player;
import com.yuvraj.model.Team;

public interface AdminService {
	public Team createTeam(Team team);
	
	public Team updateTeam(Long id, Team team);
	
	public void deleteTeam(Long id);
	
	public Player createPlayer(Player player);
	
	public Player updatePlayer(Long id, Player player);
	
	public void deletePlayer(Long id);
}
