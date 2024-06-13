package com.ayudantias.repaso.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class BaseModel {

    /* LLAVE PRIMARIA */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    /* TIMESTAMPS */
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected Date updatedAt;

    /* FUNCION PARA PREVIO AL GUARDADO */
    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    /* FUNCION PARA PREVIO A ACTUALIZAR */
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

}
