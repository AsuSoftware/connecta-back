package com.antonio.connectabackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "offices")
@Getter
@Setter
@ToString
public class Office {

    @Id @GeneratedValue private UUID id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "address")
    @NotNull
    private String address;

    @Column(name = "district")
    @NotNull
    private String district;

    @Column(name = "postal_code")
    @NotNull
    private String postal_code;

    @Column(name = "locality")
    @NotNull
    private String locality;

    @Column(name = "city")
    @NotNull
    private String city;

    @Column(name = "vat")
    @NotNull
    private String vat;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @Column(name = "pec")
    @NotNull
    private String pec;

    @Email
    @Column(name = "email")
    @NotNull
    private String email;

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

    @OneToMany(mappedBy = "office", cascade = CascadeType.ALL) // 1 office può avere più company areas
    private List<Employee> employees;

    @ManyToOne // molti annunci su uno user
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne // molti annunci su uno user
    @JoinColumn(name = "company_areas_id")
    private CompanyAreas company_areas;

}
