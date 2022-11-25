/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.d156.projetoPOO.controller;

import com.d156.projetoPOO.dao.AlunoDAO;
import com.d156.projetoPOO.dao.ProfessorDAO;
import com.d156.projetoPOO.model.Aluno;
import com.d156.projetoPOO.model.Professor;
import java.util.ArrayList;
import java.util.Date;

/**
 * Métodos são utilizados para enviar objetos preenchidos às DAO
 *
 * @author lucme
 */
public class ProfessorController {
    
    // Inserção de clientes.
    public static boolean salvar(String nome,String responsavel, String cpf, String endereco,String numero, String estadoCivil, String telefone,
            String genero, String dataNascimento,  String bairro, String cidade, String cep, String estado) {
        Professor obj = new Professor();
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
        return ProfessorDAO.salvar(obj);
    }

    // Alteração de clientes.
    public static boolean alterar(int id, String nome, String endereco, String numero, String estadoCivil, String telefone,
            String genero, String dataNascimento, String cpf,String bairro, String cidade, String cep, String estado) {
        Professor obj = new Professor();
        obj.setNome(nome);
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
        obj.setCPF(cpf);
        return ProfessorDAO.salvar(obj);
    }

    // Consulta clientes por id, retorna objeto preenchido.
    public static Professor consultaId(int id) {
        Professor obj = new Professor();
        obj.setIdProfessor(id);
        return ProfessorDAO.consultarProfessorId(obj);
    }

    // Exclusão de clientes.
    public static boolean excluir(int id) {
         Professor obj = new Professor();
        obj.setIdProfessor(id);
        return ProfessorDAO.excluir(obj);
    }

    // Listagem de clientes pelo nome.
    public static ArrayList<Professor> listaProfessorNome(String nome) {
        Professor obj = new Professor();
        obj.setNome(nome);
        return ProfessorDAO.listaAlunoNome(obj);
    }

    // Listagem de clientes pelo cpf.
    public static ArrayList<Professor> listaProfessorCpf(String cpf) {
        Professor obj = new Professor();
        obj.setCEP(cpf);
        return ProfessorDAO.listaProfessorCpf(obj);
    }

    // Consulta clientes pelo cpf, retorna objeto preenchido.
    public static Professor consultar(String cpf) {
        Professor obj = new Professor();
        obj.setCPF(cpf);
        return ProfessorDAO.consultarProfessor(obj);
    }
}
