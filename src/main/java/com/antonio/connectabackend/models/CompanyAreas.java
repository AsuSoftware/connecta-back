package com.antonio.connectabackend.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "employees")
@Getter
@Setter
@ToString
public class CompanyAreas {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    @NotNull
    private String name;

  /*  @Column(name = "responsible_key")
    @NotNull
    private String responsible_key; */

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "insert_by")
    @NotNull
    private String insert_by;

    @Column(name = "insert_date")
    @NotNull
    private Date insert_date;

    @Column(name = "modify_by")
    @NotNull
    private String modify_by;

    @Column(name = "modify_date")
    @NotNull
    private Date modify_date;

    @Column(name = "deleted_by")
    @NotNull
    private String deleted_by;

    @Column(name = "deleted_date")
    @NotNull
    private Date deleted_date;

    /*
    @OneToMany(mappedBy = "company_areas", cascade = CascadeType.ALL) // 1 companu area può avere più office
    private List<Office> office;

    @OneToMany(cascade = CascadeType.ALL) // 1 company areas può avere più employee
    private List<Employee> employee; */
}
