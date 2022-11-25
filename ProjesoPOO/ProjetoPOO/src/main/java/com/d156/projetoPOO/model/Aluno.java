/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.d156.projetoPOO.model;

/**
 *
 * @author filip
 */
public class Aluno extends Pessoa implements MetodosAluno{
    private int idAluno;
   
    private String Status;
    private String Responsavel;
    private String Situacao;

    public Aluno() {
    }

    public int getIdAluno() {
        return idAluno;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    //codigo que gera a media do aluno
    @Override
    public double CalculoMedia(double nota1, double nota2, double nota3, double nota4) {
  
        double media = (nota1+nota2+nota3+nota4)/4;    
            
        return media;
    }
    
   
}
