package livros;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import record.cadastrolivro;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "bibliotech")
@Entity
public class livrosjpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String autor;
    private String quantidade;
    private String genero;

    public livrosjpa(cadastrolivro dados) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.genero = genero;
    }
}
