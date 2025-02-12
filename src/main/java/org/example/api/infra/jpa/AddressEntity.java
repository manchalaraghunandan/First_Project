package org.example.api.infra.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AddressEntity {

    @Id
    @Column(unique = true, nullable = false)
    private int id;

    @Column
    private String flatNo;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zip;
}
