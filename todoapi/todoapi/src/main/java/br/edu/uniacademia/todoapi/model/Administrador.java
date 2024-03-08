package br.edu.uniacademia.todoapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Administrador extends Usuario {
    public Administrador(String nome, String login, String senha) {
        setNome(nome);
        setSenha(senha);
        setLogin(login);
        this.saldo = 0.0;
    }

    private Etipo tipoAdmin;
}
