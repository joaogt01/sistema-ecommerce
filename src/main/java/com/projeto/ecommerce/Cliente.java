package com.projeto.ecommerce;

public class Cliente {

    private String nome;
    private String email;
    private Endereco endereco;

    public Cliente(String nome, String email, Endereco endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String exibirResumo(){
        String dados = "Nome: " + nome + "\nEmail: " + email + "\nEndereco: " + endereco;
        return dados;
    }

}
