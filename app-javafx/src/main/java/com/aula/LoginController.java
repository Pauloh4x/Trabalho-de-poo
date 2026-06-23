package com.aula;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;

public class LoginController {

    @FXML
    private TextField usuarioField;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Button loginButton;

    @FXML
    public void initialize() {
        if (loginButton != null) {
            loginButton.setOnAction(event -> handleLogin());
        }
    }

    private void handleLogin() {
        String usuario = usuarioField.getText().trim();
        String senha = senhaField.getText().trim();

        if (usuario.isEmpty() || senha.isEmpty()) {
            System.out.println("⚠ Por favor, preencha todos os campos!");
            return;
        }

        System.out.println("✅ Login realizado com sucesso!");
        System.out.println("👤 Usuário: " + usuario);

        // Limpar campos
        usuarioField.clear();
        senhaField.clear();
    }}