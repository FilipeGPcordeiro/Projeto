/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.d156.projetoPOO.model;

/**
 *
 * @author filip
 */
public class Professor extends Pessoa implements MetodosProfessor{
    
    private int idProfessor;
    private String Materia;
    private String Salario;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

 
   
}
