package org.alvorada.tec.confirmationlist.domain.repository;

import org.alvorada.tec.confirmationlist.domain.entity.Convidados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadosRepository extends JpaRepository<Convidados, Integer> {
}
