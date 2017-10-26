package com.slokam.insurence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.insurence.entity.GhBasicDetails;
@Repository
public interface GhBasicDetailsDao extends JpaRepository<GhBasicDetails, Integer> {

}
