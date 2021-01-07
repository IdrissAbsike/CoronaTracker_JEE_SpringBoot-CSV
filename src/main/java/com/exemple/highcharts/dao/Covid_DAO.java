package com.exemple.highcharts.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemple.highcharts.model.CovidModel;

@Repository
public interface Covid_DAO extends JpaRepository<CovidModel ,Integer>{
	
	
}
