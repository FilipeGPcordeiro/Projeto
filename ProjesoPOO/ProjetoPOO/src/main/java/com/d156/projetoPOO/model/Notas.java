/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.d156.projetoPOO.model;

/**
 *
 * @author filip
 */
public class Notas extends Aluno{
    private int idQnotas;
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double Nota4;
    private String Materia;

    public Notas() {
    }

    public int getIdQnotas() {
        return idQnotas;
    }

    public void setIdQnotas(int idQnotas) {
        this.idQnotas = idQnotas;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getNota4() {
        return Nota4;
    }

    public void setNota4(double Nota4) {
        this.Nota4 = Nota4;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    
    

}
