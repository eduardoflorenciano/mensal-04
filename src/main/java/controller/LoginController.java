package controller;

import model.Usuario;
import service.auth.AuthService;

public class LoginController {

    private final AuthService authService;

    public LoginController() {
        this.authService = new AuthService();
    }

    public Usuario login(String email, String senha) {
        return authService.login(email, senha);
    }
}