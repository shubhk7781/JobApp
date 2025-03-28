package com.N41_JobApp_SpringSecurity.springbootrest.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.N41_JobApp_SpringSecurity.springbootrest.model.JobPost;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}
