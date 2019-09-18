package br.edu.senai.model.bean;

public class Especie {
    private final String[] nomeEspecie = {"Cão", "Gato", "Passaro", "Roedor"};

    public String[] getNomeEspecie() {
        return nomeEspecie;
    }
    
    public String getIndex(int id){
        return nomeEspecie[id];
    }
}
