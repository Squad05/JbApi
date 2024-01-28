package com.api.jbcompany.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.jbcompany.api.model.Candidaturas;

@Repository
public interface CandidaturasRepository extends JpaRepository<Candidaturas, Long> {
    List<Candidaturas> findByVagasId(Long vagaId);

    int countByCandidataEmail(String email);

    int countByVagasEmpresasId(Long empresaId);

}
