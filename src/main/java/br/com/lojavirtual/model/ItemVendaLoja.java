package br.com.lojavirtual.model;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item_venda_loja")
@SequenceGenerator(name = "seq_item_venda_loja", sequenceName = "seq_item_venda_loja", allocationSize = 1, initialValue = 1)
public class ItemVendaLoja {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_venda_loja")
    private Long id;

    @Column(nullable = false)
    private Double quantidade;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "venda_compraLoja_virtu_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "venda_compraLoja_virtu_fk"))
    private VendaCompraLojaVirtual vendaCompraLojaVirtual;

}
