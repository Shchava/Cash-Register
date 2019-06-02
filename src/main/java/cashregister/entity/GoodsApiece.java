package cashregister.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@DiscriminatorValue("2")
public class GoodsApiece extends Goods {
    @Column(name = "apiece_price")
    int apiece_price;

    @Column(name = "count")
    int count;
}
