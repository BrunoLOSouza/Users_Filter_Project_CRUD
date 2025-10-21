package brunolosouza.Users_Filter_Project.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    private boolean online;
    private boolean verificado;
    private boolean assinaturaAtiva;
    private LocalDateTime ultimoAcesso;
}
