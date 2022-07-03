package br.com.dbc.model;

import br.com.dbc.model.Usuario;

import java.util.Scanner;

public class Cliente extends Usuario {
    
    private Integer idCliente;
    private String nome;
    private String cpf; // (UNIQUE);
    private String telefone;
    private String endereco;
    private Double saldo;

    public Cliente() {};

    public Cliente(Integer idCliente, String nome, String cpf, String telefone, String endereco, Double saldo) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldo = saldo;
    }
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getSaldo() { return saldo; }

    public void setSaldo(Double saldo) { this.saldo = saldo; }

    @Override
    public void imprimir() {
        System.out.println("Nome do br.com.dbc.model.Cliente: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nTelefone: " + this.getTelefone() + "\nEndereço: " + this.getEndereco() + "\nSaldo R$: " + this.getSaldo());
    }

    //    public Double saldoCliente(Double valor){
//        System.out.println("Escreva seu saldo disponível: ");
//        Scanner sc = new Scanner(System.in);
//        this.setSaldo(sc.nextDouble());
//        return getSaldo();
//    }
}