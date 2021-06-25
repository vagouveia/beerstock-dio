package one.digitalinnovation.beerstockdio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerstockdio.enums.BeerType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, name = "name")
    private String name;

    @Column(nullable = false, name = "brand")
    private String brand;

    @Column(nullable = false, name = "max")
    private int max;

    @Column(nullable = false, name = "quantity")
    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "type")
    private BeerType type;


}
