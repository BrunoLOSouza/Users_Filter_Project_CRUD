package brunolosouza.Users_Filter_Project.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private int numero;
}
