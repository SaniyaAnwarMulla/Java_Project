package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.model.Feedback;

import jakarta.transaction.Transactional;

@Repository
public interface feedbackRepository extends JpaRepository<Feedback, Integer>{

	Feedback findByfirstName(String firstName);
	@Transactional
	@Modifying
	@Query("update Feedback c set c.courses=:cour where c.Id=:id")
	public void updateFeddbackOnId(@Param(value = "cour")
	String cour,@Param(value = "id")int id);

}
