package net.weg.GestaoBiblioteca.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Livro {
@Id
@GeneratedValue
    private int id;
    private String nome;
    private String Genero;
    private String  autor;
    private int anoPublicacao;

    public Livro(){

    }

    public Livro(int id, String nome, String genero, String autor, int anoPublicacao) {
        this.id = id;
        this.nome = nome;
        Genero = genero;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String nome, String genero, String autor, int anoPublicacao) {
        this.nome = nome;
        Genero = genero;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}

