package br.edu.ifsp.lg2a2.saopaulo;

public class Pessoa {
    
    String nome;

    // protected void definirNome(String nome, int a) {
    //     this.nome = nome;
    // }
    
    public String recuperarNome() { // getNome
        return this.nome;
    }

    protected boolean definirNome(String nome) { // setNome
        if (nome != null && !nome.isEmpty()) {
            // this.nome = nome;
            atualizarNome(nome);
            return true;
        } else {
            return false;
        }
    }

    private void atualizarNome(String nome) { // updateNome
        this.nome = nome;
    }

    // public String deletarNome() { // deleteNome
    //     this.nome = "";
    //     return this.nome;
    // }
}
