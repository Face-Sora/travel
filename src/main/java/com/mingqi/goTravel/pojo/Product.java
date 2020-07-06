package com.mingqi.goTravel.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JSpinner.DateEditor;
import javax.swing.text.DateFormatter;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {
    private Integer id;

    private Integer productnum;

    private String productname;

    private String cityname;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date gotime;
    
    
    private Integer productprice;

    private String productdesc;

    private Integer productstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductnum() {
        return productnum;
    }

    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getGotime() {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    	
    	String str = "";
    	if(gotime != null)
    		str = sdf.format(gotime);
        return str;
    }

    public void setGotime(Date gotime) {
        this.gotime = gotime;
    }

    public Integer getProductprice() {
        return productprice;
    }

    public void setProductprice(Integer productprice) {
        this.productprice = productprice;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public Integer getProductstatus() {
    	
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }
}