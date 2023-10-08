package com.skkudteam3.skkusirenorder.src.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // Entity에서는 Setter를 만들면 안됨!!!! => 별도의 메서드를 만들기!!
@Entity // 필수, Class 를 Database Table화 해주는 것이다
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class CustomerLogin {

    @Id
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long id;

    private String content2;

}
