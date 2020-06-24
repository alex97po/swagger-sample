package com.pogorelov.swaggersample.domain.main;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
@Data
public class City {

    @Id
    private Long id;

    @Column(name = "city_name")
    private String name;
}
