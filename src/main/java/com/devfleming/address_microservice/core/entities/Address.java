package com.devfleming.address_microservice.core.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ADDRESS")
public class Address extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID", unique = true, updatable = false, nullable = false)
    private Long addressId;

    @Column(name = "CEP", nullable = false, length = 9)
    private String cep;

    @Column(name = "STREET_NAME", nullable = false)
    private String streetName;

    @Column(name = "COMPLEMENT", nullable = false, length = 50)
    private String complement;

    @Column(name = "CITY", length = 50, nullable = false)
    private String city;

    @Column(name = "UF", length = 2, nullable = false)
    private String uf;

    @Column(name = "STATE", length = 25, nullable = false)
    private String state;

    @Column(name = "REGION", nullable = false, length = 20)
    private String region;

    @Column(name = "IBGE", nullable = false, length = 7)
    private String ibge;

    @Column(name = "GIA", nullable = false, length = 4)
    private String gia;

    @Column(name = "DDD", nullable = false, length = 2)
    private String ddd;

    @Column(name = "SIAFI", nullable = false, length = 4)
    private String siafi;
}
