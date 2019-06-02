package cashregister.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "Goods")
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.INTEGER,
        name = "type")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_article", updatable = false)
    int id_article;

    @Column(name = "name")
    String name;

}
