package com.mingqi.goTravel.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;

    private Integer ordernum;

    private Date ordertime;

    private Integer peoplecount;

    private String orderdesc;

    private Integer paytype;

    private Integer orderstatus;

    private Integer productid;

    private Integer memberid;
    
    private Product product;	
    
    private Member member;

    private List<Tourist> tourists;
    
    public List<Tourist> getTourists() {
		return tourists;
	}

	public void setTourists(List<Tourist> tourists) {
		this.tourists = tourists;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getOrdertime() {
    	String str = "";
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    	if (ordertime != null) {
			str = sdf.format(ordertime);
		}
        return str;
    }

    @Override
	public String toString() {
		return "Order [id=" + id + ", ordernum=" + ordernum + ", ordertime=" + ordertime + ", peoplecount="
				+ peoplecount + ", orderdesc=" + orderdesc + ", paytype=" + paytype + ", orderstatus=" + orderstatus
				+ ", productid=" + productid + ", memberid=" + memberid + ", product=" + product + ", member=" + member
				+ ", tourists=" + tourists + "]";
	}

	public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getPeoplecount() {
        return peoplecount;
    }

    public void setPeoplecount(Integer peoplecount) {
        this.peoplecount = peoplecount;
    }

    public String getOrderdesc() {
        return orderdesc;
    }

    public void setOrderdesc(String orderdesc) {
        this.orderdesc = orderdesc == null ? null : orderdesc.trim();
    }

    public String getPaytype() {
    	String str = "";
    	if (paytype == 0) {
			str = "微信";
		}else {
			str = "֧支付宝";
		}
        return str;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getOrderstatus() {
    	String str = "";
    	if (orderstatus == 0) {
			str = "未支付";
		}else {
			str = "已支付";
		}
        return str;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }
}