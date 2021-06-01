package br.edu.ifsp.lg2a2.supermercado;

// import java.io.BufferedInputStream;
import java.util.Date;
// import java.util.stream.Stream.Builder;

public class Usuario {

    // estados imutaveis
    final int cpf; // chave unica
    Date nascimento;
    Endereco localDeNascimento;
    String nomePai;
    String nomeMae;
    
    // estado mutaveis
    String nome;
    String sexo;
    Endereco endereco;
    String temCartao;
    int comprasRealizadas;
    
    // construtor
    public Usuario(int cpf, String nome, Date nascimento, String sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }
    
    // CRUD - Create, Recover, Update, Delete
    
    // comportamento
    public boolean mudarEndereco(Endereco novoEndereco) {
        // BufferedInputStream bufferDeLeitura; // busca de cep no site dos correios
        if (novoEndereco.cep == 0) {
            return false;
        }
        this.endereco = novoEndereco;
        return true;
    }
    
    public int realizouCompra() {
        // int idUltimaCompra;
        this.comprasRealizadas = this.comprasRealizadas + 1;
        return this.comprasRealizadas;
    }
}
