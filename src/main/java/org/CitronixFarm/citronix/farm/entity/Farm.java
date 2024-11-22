package org.CitronixFarm.citronix.Farm.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Farm")
@Table(name = "farms")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name must not be empty!")
    @Size(min = 2, max = 20, message = "name should contain at least 2 characters!")
    private String name;

    @NotBlank(message = "location must not be empty!")
    private String localisation;

    @NotNull(message = "total area should not be null!")
    private Double totalArea;

    @NotNull(message = "creation date should not be null!")
    private LocalDate creationDate;
}
