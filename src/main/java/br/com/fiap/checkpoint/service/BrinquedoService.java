package br.com.fiap.checkpoint.service;

import br.com.fiap.checkpoint.model.Brinquedo;
import br.com.fiap.checkpoint.repository.BrinquedoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    private final BrinquedoRepository brinquedoRepository;

    public BrinquedoService(BrinquedoRepository brinquedoRepository) {
        this.brinquedoRepository = brinquedoRepository;
    }

    public List<Brinquedo> listarTodos() {
        return brinquedoRepository.findAll();
    }

    public Optional<Brinquedo> buscarPorId(Long id) {
        return brinquedoRepository.findById(id);
    }

    public Brinquedo cadastrar(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    public Optional<Brinquedo> atualizar(Long id, Brinquedo brinquedoAtualizado) {
        return brinquedoRepository.findById(id).map(brinquedo -> {
            brinquedo.setNome(brinquedoAtualizado.getNome());
            brinquedo.setTipo(brinquedoAtualizado.getTipo());
            brinquedo.setClassificacao(brinquedoAtualizado.getClassificacao());
            brinquedo.setTamanho(brinquedoAtualizado.getTamanho());
            brinquedo.setPreco(brinquedoAtualizado.getPreco());

            return brinquedoRepository.save(brinquedo);
        });
    }

    public boolean deletar(Long id) {
        if (brinquedoRepository.existsById(id)) {
            brinquedoRepository.deleteById(id);
            return true;
        }

        return false;
    }
}