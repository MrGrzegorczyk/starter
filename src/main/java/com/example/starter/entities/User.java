package com.example.starter.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@Entity(name = "USERS")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long UUID;

  @Column(nullable = false, name = "login", length = 50)
  private String login;

  @Column(nullable = false, name = "password", length = 50)
  private String password;

  private List<Item> itemsList;

}
