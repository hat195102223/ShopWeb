package com.hat.pojos;

import com.hat.pojos.SanPham;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-12T14:10:21")
@StaticMetamodel(DanhMuc.class)
public class DanhMuc_ { 

    public static volatile SingularAttribute<DanhMuc, Integer> id;
    public static volatile SingularAttribute<DanhMuc, String> ten;
    public static volatile SetAttribute<DanhMuc, SanPham> sanPhamSet;

}