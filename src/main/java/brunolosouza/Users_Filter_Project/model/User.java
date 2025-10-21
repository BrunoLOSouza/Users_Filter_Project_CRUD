package brunolosouza.Users_Filter_Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table (name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private LocalDate dataNascimento;

    @Embedded
    private Address endereco;
    private String telefone;
    private boolean ativo;
    private String funcao;
    private LocalDateTime dataCadastro;

    @Embedded
    private Status status;
}
