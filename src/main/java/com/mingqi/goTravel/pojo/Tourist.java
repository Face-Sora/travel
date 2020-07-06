package com.mingqi.goTravel.pojo;

public class Tourist {
    private Integer id;

    private String name;

    private Integer sex;

    private String phone;

    private Integer cardtype;

    private String cardnum;

    private Integer touristtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", cardtype=" + cardtype
				+ ", cardnum=" + cardnum + ", touristtype=" + touristtype + "]";
	}

	public String getSex() {
		String str = "";
		if(sex == 0) {
			str = "女";
		}else {
			str = "男";
		}
        return str;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCardtype() {
    	String str = "";
    	if(cardtype == 0) {
    		str = "学生证";
    	}else {
    		str = "身份证";
    	}
        return str;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum == null ? null : cardnum.trim();
    }

    public String getTouristtype() {
    	String str = "";
    	if(touristtype == 0) {
    		str = "儿童票";
    	}else {
    		str = "成人票";
    	}
        return str;
    }

    public void setTouristtype(Integer touristtype) {
        this.touristtype = touristtype;
    }
}