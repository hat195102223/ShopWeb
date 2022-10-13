package com.hat.pojos;

import com.hat.pojos.OrderDetail;
import com.hat.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-12T14:10:21")
@StaticMetamodel(SaleOrder.class)
public class SaleOrder_ { 

    public static volatile SingularAttribute<SaleOrder, Long> amount;
    public static volatile SingularAttribute<SaleOrder, Integer> id;
    public static volatile SingularAttribute<SaleOrder, User> userId;
    public static volatile SingularAttribute<SaleOrder, Date> ngayTao;
    public static volatile SetAttribute<SaleOrder, OrderDetail> orderDetailSet;

}