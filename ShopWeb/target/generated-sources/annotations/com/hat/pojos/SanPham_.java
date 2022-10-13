package com.hat.pojos;

import com.hat.pojos.Comment;
import com.hat.pojos.DanhMuc;
import com.hat.pojos.OrderDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-12T14:10:21")
@StaticMetamodel(SanPham.class)
public class SanPham_ { 

    public static volatile SingularAttribute<SanPham, String> hinhAnh;
    public static volatile SetAttribute<SanPham, Comment> commentSet;
    public static volatile SingularAttribute<SanPham, String> ghiChu;
    public static volatile SingularAttribute<SanPham, Boolean> active;
    public static volatile SingularAttribute<SanPham, DanhMuc> danhMucId;
    public static volatile SingularAttribute<SanPham, Integer> id;
    public static volatile SingularAttribute<SanPham, String> ten;
    public static volatile SingularAttribute<SanPham, Date> ngayTao;
    public static volatile SingularAttribute<SanPham, Long> gia;
    public static volatile SetAttribute<SanPham, OrderDetail> orderDetailSet;

}