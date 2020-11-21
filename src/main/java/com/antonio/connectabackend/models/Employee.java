package com.antonio.connectabackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "employees")
@Getter
@Setter
@ToString
public class Employee {

    @Id @GeneratedValue private UUID id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "surname")
    @NotNull
    private String surname;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @Column(name = "mobile")
    @NotNull
    private String mobile;

    @Email
    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "active")
    @NotNull
    private String active;

    @Column(name = "note")
    @NotNull
    private String note;

    @Column(name = "insert_by")
    @NotNull
    private String insert_by;

    @Column(name = "insert_date")
    @NotNull
    private LocalDateTime insert_date;

    @Column(name = "modify_by")
    @NotNull
    private String modify_by;

    @Column(name = "modify_date")
    @NotNull
    private LocalDateTime modify_date;

    @Column(name = "deleted_by")
    @NotNull
    private String deleted_by;

    @Column(name = "deleted_date")
    @NotNull
    private LocalDateTime deleted_date;

    @ManyToOne // molti annunci su uno user
    @JoinColumn(name = "company_areas_id")
    private CompanyAreas company_areas;

    @ManyToOne // molti annunci su uno user
    @JoinColumn(name = "office_id")
    private Office office;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL) // 1 employee può avere più business roles
    private List<BusinessRoles> businessRoles;
}
