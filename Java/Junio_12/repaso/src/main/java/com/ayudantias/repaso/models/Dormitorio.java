package com.ayudantias.repaso.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dormitorios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dormitorio extends BaseModel {

    @NotNull
    @Size(min = 2)
    private String nombre;

    @JsonManagedReference
    @OneToMany(mappedBy = "dormitorio", fetch = FetchType.LAZY)
    private List<Estudiante> estudiantes;

}
