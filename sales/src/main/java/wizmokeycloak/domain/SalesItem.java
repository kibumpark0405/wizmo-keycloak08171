package wizmokeycloak.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

//<<< DDD / Value Object
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesItem {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long price;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long qty;

    @Embedded
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ProductId productId;
}
//>>> DDD / Value Object
