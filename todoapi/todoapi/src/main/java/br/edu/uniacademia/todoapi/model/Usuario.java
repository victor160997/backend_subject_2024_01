package br.edu.uniacademia.todoapi.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private String email;
    protected Double saldo;
    private LocalDateTime dataUltimoAcesso;

    public Usuario(String nome) {
        this.nome = nome;
    }
}
