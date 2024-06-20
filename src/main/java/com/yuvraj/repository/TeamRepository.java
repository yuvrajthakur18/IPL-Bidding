package com.yuvraj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuvraj.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{

}
