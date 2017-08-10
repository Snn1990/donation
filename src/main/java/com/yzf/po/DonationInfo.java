package com.yzf.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by nan on 2017/8/10.
 */
@Entity
public class DonationInfo {

    @Id
    @GeneratedValue
    private Integer id;

    private String donationName;
    private Long donationMoney;

    public DonationInfo() {
    }

    @Override
    public String toString() {
        return "DonationInfo{" +
                "id=" + id +
                ", donationName='" + donationName + '\'' +
                ", donationMoney=" + donationMoney +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonationName() {
        return donationName;
    }

    public void setDonationName(String donationName) {
        this.donationName = donationName;
    }

    public Long getDonationMoney() {
        return donationMoney;
    }

    public void setDonationMoney(Long donationMoney) {
        this.donationMoney = donationMoney;
    }
}
