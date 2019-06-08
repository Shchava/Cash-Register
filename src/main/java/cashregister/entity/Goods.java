package cashregister.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "goods")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        discriminatorType = DiscriminatorType.STRING,
        name = "type")
public abstract class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_goods")
    protected long id_goods;

    @Column(name = "name")
    protected String name;

}
