package com.megatravel.agent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatravel.agent.model.SpojUslugaJedinica;

@Repository
public interface SpojUslugaJedinicaRepository extends JpaRepository<SpojUslugaJedinica, Long> {

}
