package com.yuvraj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvraj.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{
	List<Player> findByTeamIsNull();
}
