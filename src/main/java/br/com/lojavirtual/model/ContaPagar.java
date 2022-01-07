package br.com.lojavirtual.model;

import br.com.lojavirtual.enums.StatusContaPagar;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar", sequenceName = "seq_conta_pagar", allocationSize = 1, initialValue = 1)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ContaPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_pagar")
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal valorTotal;

    private BigDecimal valorDesconto;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusContaPagar status;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;

    @Temporal(TemporalType.DATE)
    private Date dtPagamento;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_forn_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_forn_fk"))
    private Pessoa pessoa_fornecedor;
}
