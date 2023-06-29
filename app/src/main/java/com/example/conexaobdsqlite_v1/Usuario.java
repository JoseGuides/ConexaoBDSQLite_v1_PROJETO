package com.example.conexaobdsqlite_v1;

public class Usuario {

    public Usuario() {
    }

    public Usuario(int idUsuario, String nomeUsuario, String emailUsuario, int senhaUsuario) {
        this.setIdUsuario(idUsuario);
        this.setNomeUsuario(nomeUsuario);
        this.setEmailUsuario(emailUsuario);
        this.setSenhaUsuario(senhaUsuario);
    }

    public Usuario(String nomeUsuario, String emailUsuario, int senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nomeUsuario='" + nomeUsuario + '\'' + ", emailUsuario=" + emailUsuario +  '\'' + ", senhaUsuario=" + senhaUsuario + '}';
        //"Usuario{idUsuario=1, nomeUsuario=Ronan, idadeUsuario=30}"
    }

    private int idUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private int senhaUsuario;



    protected int getIdUsuario() {
        return idUsuario;
    }

    protected void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    protected String getNomeUsuario() {
        return nomeUsuario;
    }

    protected void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    protected String getEmailUsuario() { return emailUsuario;}

    protected void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    protected int getSenhaUsuario() { return senhaUsuario;}

    protected void setSenhaUsuario(int senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}