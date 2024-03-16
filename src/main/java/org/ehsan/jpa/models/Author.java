package org.ehsan.jpa.models;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@Table(name = "author")
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private int age;
}
