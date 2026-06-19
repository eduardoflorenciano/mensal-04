package controller;

import model.Usuario;
import service.usuario.GerenciadorUsuarioService;

import java.util.List;

public class UsuarioController {
    private final GerenciadorUsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new GerenciadorUsuarioService();
    }

    public void cadastrarUsuario(String nome, String email, String senha, int perfil) {

        usuarioService.cadastrar(nome, email, senha, perfil);
    }

    public void atualizarUsuario(Long id, String nome, String email, String senha, int perfil, Long idLogado) {
        usuarioService.atualizar(id, nome, email, senha, perfil, idLogado);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioService.listarTodos();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioService.buscarPorId(id);
    }

    public void removerUsuario(Long id, Long idLogado) {
        usuarioService.remover(id, idLogado);
    }
}