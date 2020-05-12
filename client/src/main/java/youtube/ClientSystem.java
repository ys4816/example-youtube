package youtube;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="ClientSystem_table")
public class ClientSystem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String clientId;
    private Integer totalView;

    @PrePersist
    public void onPrePersist(){
        CreatedCustomer createdCustomer = new CreatedCustomer();
        BeanUtils.copyProperties(this, createdCustomer);
        createdCustomer.publishAfterCommit();


        CheckedRefund checkedRefund = new CheckedRefund();
        BeanUtils.copyProperties(this, checkedRefund);
        checkedRefund.publishAfterCommit();


    }


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public Integer getTotalView() {
        return totalView;
    }

    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }




}
