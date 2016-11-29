package com.linky.offersystem.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Linky on 16-11-29.
 * 报价系统条目
 */
@Entity
public class OfferItemBean {
    @Id
    public Long id;
    public int channel; // 渠道，1 DHL, 2 FEDEX
    public int country;
    public double weight;
    public double price;
    public double fuelRate;     // 燃油费率
    public double subCharge;    // 附加费
    public String remark;       // 备注
    public String getRemark() {
        return this.remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public double getSubCharge() {
        return this.subCharge;
    }
    public void setSubCharge(double subCharge) {
        this.subCharge = subCharge;
    }
    public double getFuelRate() {
        return this.fuelRate;
    }
    public void setFuelRate(double fuelRate) {
        this.fuelRate = fuelRate;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getCountry() {
        return this.country;
    }
    public void setCountry(int country) {
        this.country = country;
    }
    public int getChannel() {
        return this.channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1858197355)
    public OfferItemBean(Long id, int channel, int country, double weight,
            double price, double fuelRate, double subCharge, String remark) {
        this.id = id;
        this.channel = channel;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.fuelRate = fuelRate;
        this.subCharge = subCharge;
        this.remark = remark;
    }
    @Generated(hash = 1339568588)
    public OfferItemBean() {
    }
}
