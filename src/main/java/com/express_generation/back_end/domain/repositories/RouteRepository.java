package com.express_generation.back_end.domain.repositories;

import com.express_generation.back_end.domain.entities.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, String> {

}
