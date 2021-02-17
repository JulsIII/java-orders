package com.lambdaschool.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    @Column(nullable = false,
        unique = true)
    private String type;

}
