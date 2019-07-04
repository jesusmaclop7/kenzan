package com.jesus.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jesus.demo.dto.Client;

/**
 * @author Jesus
 *
 */
@Repository
public interface ClientDao extends JpaRepository<Client, Long>{
	@Query(name = "Client.findActiveClients")
	List<Client> findAllActive(@Param("status") boolean f);
	@Query(name = "Client.findClientId")
	Client findId(@Param("id") long i);
}
