package br.com.lojavirtual.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa_fisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa {

    @Column(nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

}
