package br.com.isthefani.ordemdesevico.departamento.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DEPARAMENTO")
    private Integer idDepartamento;
    @Column(name = "NOME_DEPARAMENTO")
    private String nomeDepartamento;

}
