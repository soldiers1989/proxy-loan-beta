package com.cw.biz.user.domain.entity;

import com.cw.biz.common.entity.AggEntity;
import com.cw.biz.user.app.enums.EducationEnum;
import com.cw.biz.user.app.enums.IdentityEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户信息
 * Created by dujy on 2017/7/31.
 */
@Entity
@Table(name="yx_user_info")
@Getter
@Setter
public class YxUserInfo extends AggEntity{

    @Column(name="user_id",columnDefinition="varchar(100) not null comment '用户ID'")
    private Long userId;

    @Column(name="name",columnDefinition="varchar(100)  comment '姓名'")
    private String name;

    @Column(name="cert_no",columnDefinition="varchar(20)  comment '证件号码'")
    private String certNo;

    @Column(name="phone",columnDefinition="varchar(11)  comment '手机号码'")
    private String phone;

    @Column(name="bank_account_no",columnDefinition="varchar(18)  comment '银行卡号'")
    private String bankAccountNo;

    @Column(name="address",columnDefinition="varchar(200)  comment '住所'")
    private String address;

    @Column(name="sesame_score",columnDefinition="int(11)  comment '芝麻分'")
    private Integer sesameScore;

}