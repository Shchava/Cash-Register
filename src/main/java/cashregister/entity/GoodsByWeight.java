package cashregister.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


@Entity
@DiscriminatorValue("1")
public class GoodsByWeight extends Goods {
    @Column(name = "weight_price")
    int weight_price;

    @Column(name = "weight")
    int weight;
}
