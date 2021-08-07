package org.alvorada.tec.confirmationlist.rest.controller;


import lombok.RequiredArgsConstructor;
import org.alvorada.tec.confirmationlist.domain.entity.Convidados;
import org.alvorada.tec.confirmationlist.service.ConvidadosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/convidados")
public class ConvidadosController {

    private final ConvidadosService convidadosService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Convidados> getConvidadosId(@PathVariable Integer id) {
        return ResponseEntity.ok(convidadosService.retornaConvidado(id));
    }

    @PostMapping
    public Convidados postConvidados(@RequestBody Convidados convidados) {
        return convidadosService.salvarConvidado(convidados);
    }

}
