package org.alvorada.tec.confirmationlist.service;

import lombok.RequiredArgsConstructor;
import org.alvorada.tec.confirmationlist.domain.entity.Convidados;
import org.alvorada.tec.confirmationlist.domain.repository.ConvidadosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@Service
public class ConvidadosService {

    private final ConvidadosRepository convidadosRepository;

    public Convidados retornaConvidado(Integer id) {
        return convidadosRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Convidado não encontrado."));
    }

    public Convidados salvarConvidado(Convidados convidados) {
        return convidadosRepository.save(convidados);
    }

}
