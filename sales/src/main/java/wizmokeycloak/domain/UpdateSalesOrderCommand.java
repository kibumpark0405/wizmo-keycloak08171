package wizmokeycloak.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateSalesOrderCommand {

    private String salesOrderNumber;
    private String salesPerson;
    private CompanyId companyId;
    private List<SalesItem> salesItems;
    private SalesType salesType;
}
