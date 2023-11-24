package com.example.jogos.service;

import com.example.jogos.model.Jogo;
import com.example.jogos.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> getAll() {
        return jogoRepository.findAll();
    }
    public Jogo getById(int id) {
        Optional<Jogo> jogoRequerido = jogoRepository.findById(id);
        if (jogoRequerido.isPresent()) {
            Jogo jogo = jogoRequerido.get();
            jogoRepository.getById(jogo.getId());
            return jogo;
        }return null;
    }

    public Jogo save(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    public Jogo favoritar(int idJogo) {
        Optional<Jogo> optionalJogo = jogoRepository.findById(idJogo);

        if (optionalJogo.isPresent()) {
            Jogo jogo = optionalJogo.get();
            jogo.setEstaFavoritado(!jogo.isEstaFavoritado());
            return jogoRepository.save(jogo);
        }
        return null;
    }
    public Jogo deletar(int id){
        Optional<Jogo> jogoExcluido = jogoRepository.findById(id);
        if (jogoExcluido.isPresent()){
            Jogo jogo = jogoExcluido.get();
            jogoRepository.deleteById(jogo.getId());
            return jogo;
        }
        return null;
    }

}
