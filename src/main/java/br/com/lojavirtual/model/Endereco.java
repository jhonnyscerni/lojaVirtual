package br.com.lojavirtual.model;

import br.com.lojavirtual.enums.TipoEndereco;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "endereco")
@SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1)
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
    private Long id;

    @Column(nullable = false)
    private String ruaLogra;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String numero;


    private String complemento;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String uf;

    @Column(nullable = false)
    private String cidade;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoEndereco tipoEndereco;
}
