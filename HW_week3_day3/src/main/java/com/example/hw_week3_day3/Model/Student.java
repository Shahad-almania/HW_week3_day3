package com.example.hw_week3_day3.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor @Data
@NoArgsConstructor
@Entity
public class Student {
   @NotNull(message = "Id can't be null")
   @Id
    private Integer Id;
   @NotEmpty(message = "name can't be null")
    private String Name;
   @NotNull(message = "age can't be null")
    private Integer Age;

  @NotEmpty(message = "major can't be null")
  @Enumerated
    private Mojor mojor;

}
