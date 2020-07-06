package com.mingqi.goTravel.pojo;

public class Power {
    private Integer id;

    private String powername;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Power))
			return false;
		return this.getId() == ((Power)obj).getId();
	}

	public String getPowername() {
        return powername;
    }

    @Override
	public String toString() {
		return "Power [id=" + id + ", powername=" + powername + ", url=" + url + "]";
	}

	public void setPowername(String powername) {
        this.powername = powername == null ? null : powername.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}