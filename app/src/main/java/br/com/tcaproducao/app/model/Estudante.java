package br.com.tcaproducao.app.model;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Estudante {
    private int id;
    private String nome;
    private static List<Estudante> estudanteList;

    public Estudante(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Estudante(String nome) {
        this.nome = nome;
    }


    private static void estudanteRepository() {
        estudanteList = new ArrayList<>(asList(new Estudante ("José da silva"), new Estudante("Maria Silva")));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public static void setEstudanteList(List<Estudante> estudanteList) {
        Estudante.estudanteList = estudanteList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
