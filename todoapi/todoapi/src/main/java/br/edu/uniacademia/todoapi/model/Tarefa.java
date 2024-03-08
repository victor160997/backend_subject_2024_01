package br.edu.uniacademia.todoapi.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tarefa {
    private String descricao;
    private LocalDateTime dataCriacao, dataPrevisao, dataEncerramento;
    private Usuario responsavel;
}
