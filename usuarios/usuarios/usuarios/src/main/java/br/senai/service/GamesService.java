package br.senai.service;


import br.senai.model.Games;
import br.senai.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface GamesService {

    //Pesquisar todos os Jogos
    public List <Games> findAll();

    //pesquisar pelo usuario a partir do id
    public Optional<Games> findById(long id);

    //novo usuario
    public Games create (Usuario usuario);


    //editar usuario
    public  Games update (Usuario usuario, long id);



    // deletar usuario
    public void delete (long id);
}
