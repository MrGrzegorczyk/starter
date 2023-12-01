package com.example.starter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
@Entity(name = "ITEMS")
public class Item {

  @Id
  @GeneratedValue
  private long UUID;

  private String name;
}
