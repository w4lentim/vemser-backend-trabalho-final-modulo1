package br.com.dbc.service;

import br.com.dbc.exception.BancoDeDadosException;
import br.com.dbc.model.Cliente;
import br.com.dbc.model.Usuario;
import br.com.dbc.repository.ClienteRepository;
import br.com.dbc.repository.UsuarioRepository;

public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public UsuarioService() {
        usuarioRepository = new UsuarioRepository();
    }

    public void adicionarUsuario(Usuario usuario) {
        try {
            Usuario usuarioAdicionado = usuarioRepository.adicionar(usuario);
            System.out.println("Usuário adicionado com sucesso! " + usuarioAdicionado);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void removerUsuario(Integer id) {
        try {
            boolean conseguiuRemover = usuarioRepository.remover(id);
            System.out.println("Removido? " + conseguiuRemover + "| com id = " + id);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void atualizarUsuario(Integer id, Usuario usuario) {
        try {
            boolean conseguiuEditar = usuarioRepository.editar(id, usuario);
            System.out.println("Editado? " + conseguiuEditar + "| com id = " + id);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }

    public void listarUsuario() {
        try {
            usuarioRepository.listar().forEach(System.out::println);
        } catch (BancoDeDadosException e) {
            e.printStackTrace();
        }
    }
}
