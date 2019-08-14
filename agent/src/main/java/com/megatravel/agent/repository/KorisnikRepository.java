package com.megatravel.agent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatravel.agent.model.Korisnik;

@Repository
public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

}
