/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.d156.projetoPOO.dao;

import com.d156.projetoPOO.model.Aluno;
import com.d156.projetoPOO.model.Notas;
import com.d156.projetoPOO.utils.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author lucme
 */
public class AlunoDAO {

    // Insere os valores na tabela clientes.
    public static boolean salvar(Aluno obj) {
        boolean retorno = false;
        Connection conexao = null;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement
        ("insert into aluno (nome,idade,dtanascimento,endereco,cidade,bairro,estado,numero,cpf,sexo,cep,telefone,estadocivil,responsavel) \n" +
"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            sql.setString(1, obj.getNome());
            sql.setInt(2, obj.getIdade());
            sql.setString(3, obj.getDataNascimento());
            sql.setString(4, obj.getEndereco());
            sql.setString(5, obj.getCidade());
            sql.setString(6, obj.getBairro());
            sql.setString(7, obj.getEstado());
            sql.setString(8, obj.getNcasa());
            sql.setString(9, obj.getCPF());
            sql.setString(10, obj.getSexo());
            sql.setString(11, obj.getCEP());
            sql.setString(12, obj.getTelefone());
            sql.setString(13, obj.getEstadocivil());
            sql.setString(14, obj.getResponsavel());
            sql.setString(16, obj.getSituacao());
            int linhasAfetadas = sql.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
                throw new Exception("Não foi possível inserir o Aluno");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro:" + ex.getMessage());
            retorno = false;
        } catch (Exception ex) {
            System.out.println("Erro:" + ex.getMessage());
            retorno = false;
        }
        return retorno;
    }

    // Consulta o cliente utilizando o cpf como parâmetro.
    public static Aluno consultarAluno(Aluno obj) {
        Connection conexao = null;
        ResultSet rs = null;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("Select * from aluno where cpf=?");
            sql.setString(1, obj.getCPF());
            rs = sql.executeQuery();
            while (rs.next()) {
                obj.setIdAluno(rs.getInt("idCliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCPF(rs.getString("cpf"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNcasa(rs.getString("numero"));
                obj.setSexo(rs.getString("genero"));
                obj.setEstadocivil(rs.getString("estadoCivil"));
                obj.setDataNascimento(rs.getString("dataNascimento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setCEP(rs.getString("cep"));
                obj.setEstado(rs.getString("estado"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar o Aluno!");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
        return obj;
    }

    // Retorna um objeto preenchido a partir de um id.
    public static Aluno consultarAlunoId(Aluno obj) {
        Connection conexao = null;
        ResultSet rs = null;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("Select * from aluno where idAluno=?");
            sql.setInt(1, obj.getIdAluno());
            rs = sql.executeQuery();
            while (rs.next()) {
                obj.setIdAluno(rs.getInt("idCliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCPF(rs.getString("cpf"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNcasa(rs.getString("numero"));
                obj.setSexo(rs.getString("genero"));
                obj.setEstadocivil(rs.getString("estadoCivil"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setDataNascimento(rs.getString("dataNascimento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setCEP(rs.getString("cep"));
                obj.setEstado(rs.getString("estado"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar o Aluno!");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
        return obj;
    }

    // Listagem dos clientes sem parâmetros.
    public static ArrayList<Aluno> listaAluno(Aluno obj) {
        Connection conexao = null;
        ArrayList<Aluno> listaRetorno = new ArrayList<Aluno>();
        ResultSet rs = null;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("Select * from clientes");
            rs = sql.executeQuery();
            while (rs.next()) {
                obj.setIdAluno(rs.getInt("idCliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCPF(rs.getString("cpf"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNcasa(rs.getString("numero"));
                obj.setSexo(rs.getString("genero"));
                obj.setEstadocivil(rs.getString("estadoCivil"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setDataNascimento(rs.getString("dataNascimento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setCEP(rs.getString("cep"));
                obj.setEstado(rs.getString("estado"));
                listaRetorno.add(obj);
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
        return listaRetorno;
    }

    // Listatem dos clientes por nome, sendo utilizada em um evento de "key typed".
    public static ArrayList<Aluno> listaAlunoNome(Aluno obj) {
        Connection conexao = null;
        ArrayList<Aluno> listaRetorno = new ArrayList<Aluno>();
        ResultSet rs = null;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("Select * from clientes where nome like ?");
            sql.setString(1, '%' + obj.getNome() + '%');
            rs = sql.executeQuery();
            while (rs.next()) {
                obj = new Aluno();
                obj.setIdAluno(rs.getInt("idCliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCPF(rs.getString("cpf"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNcasa(rs.getString("numero"));
                obj.setSexo(rs.getString("genero"));
                obj.setEstadocivil(rs.getString("estadoCivil"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setDataNascimento(rs.getString("dataNascimento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setCEP(rs.getString("cep"));
                obj.setEstado(rs.getString("estado"));
                listaRetorno.add(obj);
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage() + "Aqui!!");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
        return listaRetorno;
    }

    // Listatem dos clientes por cpf, sendo utilizada em um evento de "key typed".
    public static ArrayList<Aluno> listaAlunoCpf(Aluno obj) {
        Connection conexao = null;
        ArrayList<Aluno> listaRetorno = new ArrayList<Aluno>();
        ResultSet rs = null;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("Select * from clientes where cpf like ?");
            sql.setString(1, '%' + obj.getCPF()+ '%');
            rs = sql.executeQuery();
            while (rs.next()) {
                obj = new Aluno();
                obj.setIdAluno(rs.getInt("idCliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCPF(rs.getString("cpf"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNcasa(rs.getString("numero"));
                obj.setSexo(rs.getString("genero"));
                obj.setEstadocivil(rs.getString("estadoCivil"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setDataNascimento(rs.getString("dataNascimento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setCEP(rs.getString("cep"));
                obj.setEstado(rs.getString("estado"));
                listaRetorno.add(obj);
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
        return listaRetorno;
    }

    // Exclui um cadastro utilizando o id como parâmetro.
    public static boolean excluir(Aluno obj) {
        Connection conexao = null;
        boolean retorno = false;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("delete from clientes where idCliente=?");
            sql.setInt(1, obj.getIdAluno());
            int linhasAfetadas = sql.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao excluir o Aluno!");
        } finally {
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
        return retorno;
    }

    // Altera um cadastro utilizando o id como parâmetro.
    public static boolean atualizar(Aluno obj) {
        Connection conexao = null;
        boolean retorno = false;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("update clientes"
                    + " set nome=?,endereco=?,numero=?,genero=?,estadoCivil=?,email=?,telefone=?,dataNascimento=?,complemento=?,bairro=?,cidade=?,cep=?,estado=? where idCliente=?");
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getEndereco());
            sql.setString(3, obj.getNcasa());
            sql.setString(4, obj.getSexo());
            sql.setString(5, obj.getEstadocivil());
            sql.setString(7, obj.getTelefone());
            sql.setString(8, obj.getDataNascimento());
            sql.setString(10, obj.getBairro());
            sql.setString(11, obj.getCidade());
            sql.setString(12, obj.getCEP());
            sql.setString(13, obj.getEstado());
            sql.setInt(14, obj.getIdAluno());
            int linhasAfetadas = sql.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao alterar!");
        } finally {
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
        return retorno;
    }

    public static boolean salvarNota(Notas qnotas) {
         boolean retorno = false;
        Connection conexao = null;
        try {
            conexao = ConexaoFactory.getConexao();
            PreparedStatement sql = conexao.prepareStatement("insert into Aluno"
                    + "(nome,cpf,endereco,numero,genero,estadoCivil,email,telefone,dataNascimento,complemento, bairro, cidade, cep, estado)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            sql.setDouble(1, qnotas.getNota1());
            sql.setDouble(2, qnotas.getNota2());
            sql.setDouble(3, qnotas.getNota3());
            sql.setDouble(4, qnotas.getNota4());
            sql.setInt(6, qnotas.getIdQnotas());
            int linhasAfetadas = sql.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
                throw new Exception("Não foi possível inserir a nota");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro:" + ex.getMessage());
            retorno = false;
        } catch (Exception ex) {
            System.out.println("Erro:" + ex.getMessage());
            retorno = false;
        }
        return retorno;
    }
}
