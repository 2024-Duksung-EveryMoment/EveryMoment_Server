package com.everymoment.digitalwalking.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nickname")
    private String nicknamd;
}
