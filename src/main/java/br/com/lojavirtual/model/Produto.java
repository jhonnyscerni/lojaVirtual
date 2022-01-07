package br.com.lojavirtual.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id;

    @Column(nullable = false)
    private String tipoUnidade;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Boolean ativo = Boolean.TRUE;

    @Column(columnDefinition = "text", length = 2000, nullable = false)
    private String descricao;

    /** Nota item nota produto - ASSOCIAR **/

    @Column(nullable = false)
    private Double peso; /* 1000.55 G */

    @Column(nullable = false)
    private Double largura;

    @Column(nullable = false)
    private Double altura;

    @Column(nullable = false)
    private Double profundidade;

    @Column(nullable = false)
    private BigDecimal valorVenda = BigDecimal.ZERO;

    @Column(nullable = false)
    private Integer QtdEstoque = 0;

    private Integer QtdeAlertaEstoque = 0;

    private String linkYoutube;

    private Boolean alertaQtdeEstoque = Boolean.FALSE;

    private Integer qtdeClique = 0;
}
