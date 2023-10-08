package com.skkudteam3.skkusirenorder.src.customer.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String email;
    private int phoneNumber;
    private SocialType socialType;
    private int point;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    @OneToOne
    @JoinColumn(name = "customer_login_id")
    private CustomerLogin customerLogin;

    @OneToOne
    @JoinColumn(name = "customer_image_id")
    private CustomerImage customerImage;

    @OneToMany(mappedBy = "customer")
    private List<Bookmark> bookmarks = new ArrayList<>();

    private Customer(String customerName, String email, int phoneNumber,SocialType socialType, int point){
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.socialType = socialType;
        this.point = point;
    }

    public static Customer createCustomer(String customerName, String email, int phoneNumber,SocialType socialType, int point){
        return new Customer(customerName, email, phoneNumber, socialType, point);
    }

    public void changePoint (int point){
        this.point = point;
    }


}
