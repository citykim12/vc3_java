package com.site.ex0719;

import java.sql.Timestamp;

public class BDto {
	
	public BDto() {}
	public BDto(int bid, String btitle, String bcontent, String bname, int bgroup, int bstep, int bindent,
			Timestamp bdate, String bupload, int bhit) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bname = bname;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
		this.bdate = bdate;
		this.bupload = bupload;
		this.bhit = bhit;
	}

	int bid;
	String btitle;
	String bcontent;
	String bname;
	int bgroup;
	int bstep;
	int bindent;
	Timestamp bdate;
	String bupload;
	int bhit;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBgroup() {
		return bgroup;
	}
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	public int getBstep() {
		return bstep;
	}
	public void setBstep(int bstep) {
		this.bstep = bstep;
	}
	public int getBindent() {
		return bindent;
	}
	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	public Timestamp getBdate() {
		return bdate;
	}
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	public String getBupload() {
		return bupload;
	}
	public void setBupload(String bupload) {
		this.bupload = bupload;
	}
	public int getBhit() {
		return bhit;
	}
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	
	
	
	

}
