package br.com.marcoshsilva.desafio.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FormularioEntity {

    @Id
    private Integer id;

    private String nome;
    private String email;
    private String assunto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
