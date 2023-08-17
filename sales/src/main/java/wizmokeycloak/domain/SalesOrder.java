package wizmokeycloak.domain;

import wizmokeycloak.domain.SalesOrderCreated;
import wizmokeycloak.domain.SalesOrderUpdated;
import wizmokeycloak.domain.SalesOrderDeleted;
import wizmokeycloak.SalesApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="SalesOrder_table")
@Data

//<<< DDD / Aggregate Root
public class SalesOrder  {


    
    @Id
    
    
    
    
    
    private String salesOrderNumber;
    
    
    
    
    private String salesPerson;
    
    
    
    
    private SalesType SalesType ;
    
    
    
    @Embedded
    private CompanyId companyId;
    
    
    
    @Embedded
    private SalesItem salesItem;

    @PostPersist
    public void onPostPersist(){


        SalesOrderCreated salesOrderCreated = new SalesOrderCreated(this);
        salesOrderCreated.publishAfterCommit();



        SalesOrderUpdated salesOrderUpdated = new SalesOrderUpdated(this);
        salesOrderUpdated.publishAfterCommit();



        SalesOrderDeleted salesOrderDeleted = new SalesOrderDeleted(this);
        salesOrderDeleted.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static SalesOrderRepository repository(){
        SalesOrderRepository salesOrderRepository = SalesApplication.applicationContext.getBean(SalesOrderRepository.class);
        return salesOrderRepository;
    }






}
//>>> DDD / Aggregate Root
