package com.antonio.connectabackend.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "business_roles")
@Getter
@Setter
@ToString
public class BusinessRoles {

    @Id @GeneratedValue private UUID id;

    @Column(name = "description")
    @NotNull
    private String description;

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
/*
    @ManyToOne // molti annunci su uno user
    @JoinColumn(name = "employee_id")
    private Employee employee; */
/*
    @OneToOne(mappedBy = "businessRoles")
    private Employee employee; */

}
