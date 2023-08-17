package wizmokeycloak.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateSalesOrderCommand {

    private String salesOrderNumber;
}
