package br.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity(name = "games")

public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;



    @Size(max=100)
    private String nomeJogo;


    @Size(max=80)
    private String empresaJogo;

    @Size(max=50)
    private String nomeJogo;




}
