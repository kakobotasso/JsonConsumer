package br.com.kakobotasso.jsonconsumer.models;

/**
 * Created by kakobotasso on 8/21/16.
 */
public class Usuario {
    private String id;
    private String nome;
    private String pwd;

    public Usuario(){
    }

    public Usuario(String id, String nome, String pwd){
        this.id = id;
        this.nome = nome;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
