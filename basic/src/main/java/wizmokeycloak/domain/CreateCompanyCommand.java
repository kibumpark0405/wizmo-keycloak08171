package wizmokeycloak.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateCompanyCommand {

    private String name;
    private String industry;
    private String foundedDate;
}
