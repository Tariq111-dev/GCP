package org.closure.gcp.repositories;

import org.closure.gcp.entities.InterestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface inrestdRepo extends JpaRepository<InterestEntity,Integer> {
    


    
}