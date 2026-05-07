package br.com.fiap.checkpoint.controller;

import br.com.fiap.checkpoint.model.Brinquedo;
import br.com.fiap.checkpoint.service.BrinquedoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private final BrinquedoService brinquedoService;

    public BrinquedoController(BrinquedoService brinquedoService) {
        this.brinquedoService = brinquedoService;
    }

    @GetMapping
    public ResponseEntity<List<Brinquedo>> listarTodos() {
        List<Brinquedo> brinquedos = brinquedoService.listarTodos();
        return ResponseEntity.ok(brinquedos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> buscarPorId(@PathVariable Long id) {
        return brinquedoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Brinquedo> cadastrar(@RequestBody Brinquedo brinquedo) {
        Brinquedo brinquedoCadastrado = brinquedoService.cadastrar(brinquedo);
        return ResponseEntity.ok(brinquedoCadastrado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Brinquedo> atualizar(
            @PathVariable Long id,
            @RequestBody Brinquedo brinquedo
    ) {
        return brinquedoService.atualizar(id, brinquedo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deletado = brinquedoService.deletar(id);

        if (deletado) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}