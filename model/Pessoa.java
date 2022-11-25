/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.d156.projetoPOO.model;

/**
 *
 * @author filip
 */
public abstract class Pessoa {
    
    private String Nome;
    private String Sobrenome;
    private int Idade;
    private String DataNascimento;
    private String Endereco;
    private String Cidade;
    private String Bairro;
    private String Estado;
    private String Ncasa;
    private String CPF;
    private String Sexo;
    private String CEP;
    private String Telefone;
    private String Estadocivil;
    
    public Pessoa() {
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNcasa() {
        return Ncasa;
    }

    public void setNcasa(String Ncasa) {
        this.Ncasa = Ncasa;
    }

    
    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

   

    public String getEstadocivil() {
        return Estadocivil;
    }

    public void setEstadocivil(String Estadocivil) {
        this.Estadocivil = Estadocivil;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

        public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

  

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + Nome + ", Sobrenome=" + Sobrenome + ", Idade=" + Idade + ", DataNascimento=" + DataNascimento + '}';
    }
    
    
}
