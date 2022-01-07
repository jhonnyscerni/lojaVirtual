package br.com.lojavirtual.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cup_desc")
@SequenceGenerator(name = "seq_cup_desc", sequenceName = "seq_cup_desc", allocationSize = 1, initialValue = 1)
public class CupDesc {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cup_desc")
    private Long id;

    @Column(nullable = false)
    private String codDesc;

    private BigDecimal valorRealDesc;

    private BigDecimal valorPorcentDesc;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataValidadeCupom;
}
