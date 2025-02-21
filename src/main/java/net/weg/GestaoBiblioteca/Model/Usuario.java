package net.weg.GestaoBiblioteca.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String Email;
    private String CEP;
    private int telefone;

    public Usuario() {

    }

    public Usuario(String nome, String email, String CEP, int telefone) {
        this.nome = nome;
        Email = email;
        this.CEP = CEP;
        this.telefone = telefone;
    }

    public Usuario(int id, String nome, String email, String CEP, int telefone) {
        this.id = id;
        this.nome = nome;
        Email = email;
        this.CEP = CEP;
        this.telefone = telefone;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
