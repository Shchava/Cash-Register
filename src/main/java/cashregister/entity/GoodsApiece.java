package cashregister.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "goods")
@DiscriminatorValue("Apiece")
public class GoodsApiece extends Goods {
    @Column(name = "apiece_price")
    int apiece_price;

    @Column(name = "count")
    int count;
}
