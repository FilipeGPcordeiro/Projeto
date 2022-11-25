/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.d156.projetoPOO.controller;

import com.d156.projetoPOO.dao.AlunoDAO;
import com.d156.projetoPOO.model.Aluno;
import com.d156.projetoPOO.model.Notas;
import java.util.ArrayList;
import java.util.Date;

/**
 * Métodos são utilizados para enviar objetos preenchidos às DAO
 *
 * @author lucme
 */
public class AlunoController {
    
    // Inserção de clientes.
    public static boolean salvar(String nome,String responsavel, String cpf, String endereco,String numero, String estadoCivil, String telefone,
            String genero, String dataNascimento,  String bairro, String cidade, String cep, String estado) {
        Aluno obj = new Aluno();
        obj.setNome(nome);
        obj.setCPF(cpf);
        obj.setEndereco(endereco);
        obj.setNcasa(numero);
        obj.setEstadocivil(estadoCivil);
        obj.setTelefone(telefone);
        obj.setSexo(genero);
        obj.setDataNascimento(dataNascimento);
        obj.setBairro(bairro);
        obj.setCidade(cidade);
        obj.setCEP(cep);
        obj.setEstado(estado);
        obj.setResponsavel(responsavel);
        return AlunoDAO.salvar(obj);
    }
    
    
    public static boolean inserirNota(int idaluno,double nota1,double nota2,double nota3,double nota4){
Notas qnotas  = new Notas();
qnotas.setNota1(nota1);
qnotas.setNota2(nota2);
qnotas.setNota3(nota3);
qnotas.setNota4(nota4);
qnotas.setIdAluno(idaluno);
return AlunoDAO.salvarNota(qnotas);
    }

    // Alteração de clientes.
    public static boolean alterar(int id, String nome, String endereco, String numero,String responsavel , String estadoCivil, String telefone,
            String genero, String dataNascimento, String cpf,String bairro, String cidade, String cep, String estado) {
         Aluno obj = new Aluno();
        obj.setNome(nome);
        obj.setEndereco(endereco);
        obj.setNcasa(numero);
        obj.setResponsavel(responsavel);
        obj.setEstadocivil(estadoCivil);
        obj.setTelefone(telefone);
        obj.setSexo(genero);
        obj.setDataNascimento(dataNascimento);
        obj.setBairro(bairro);
        obj.setCidade(cidade);
        obj.setCEP(cep);
        obj.setEstado(estado);
        obj.setCPF(cpf);
        return AlunoDAO.salvar(obj);
    }

    // Consulta clientes por id, retorna objeto preenchido.
    public static Aluno consultaId(int id) {
        Aluno obj = new Aluno();
        obj.setIdAluno(id);
        return AlunoDAO.consultarAlunoId(obj);
    }

    // Exclusão de clientes.
    public static boolean excluir(int id) {
        Aluno obj = new Aluno();
        obj.setIdAluno(id);
        return AlunoDAO.excluir(obj);
    }

    // Listagem de clientes pelo nome.
    public static ArrayList<Aluno> listaAlunoNome(String nome) {
        Aluno obj = new Aluno();
        obj.setNome(nome);
        return AlunoDAO.listaAlunoNome(obj);
    }

    // Listagem de clientes pelo cpf.
    public static ArrayList<Aluno> listaAlunoCpf(String cpf) {
        Aluno obj = new Aluno();
        obj.setCEP(cpf);
        return AlunoDAO.listaAlunoCpf(obj);
    }

    // Consulta clientes pelo cpf, retorna objeto preenchido.
    public static Aluno consultar(String cpf) {
        Aluno obj = new Aluno();
        obj.setCPF(cpf);
        return AlunoDAO.consultarAluno(obj);
    }
}
