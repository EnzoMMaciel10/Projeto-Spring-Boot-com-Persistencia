package br.com.fiap.checkpoint.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "TIPO", nullable = false, length = 100)
    private String tipo;

    @Column(name = "CLASSIFICACAO", nullable = false, length = 50)
    private String classificacao;

    @Column(name = "TAMANHO", length = 50)
    private String tamanho;

    @Column(name = "PRECO", nullable = false)
    private Double preco;
}