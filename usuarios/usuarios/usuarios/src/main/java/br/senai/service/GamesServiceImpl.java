package br.senai.service;

import br.senai.model.Games;
import br.senai.model.Usuario;
import br.senai.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesServiceImpl implements GamesService {

    @Autowired
    GamesRepository gamesRepository;

    @Override
    public List <Games> findAll() {
        return gamesRepository.findAll();
    }

    @Override
    public Optional<Games> findById(long id) {
        return gamesRepository.findById(id);
    }

    @Override
    public Games create(Usuario usuario) {
        return null;
    }

    @Override
    public Games update(Usuario usuario, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }


}
