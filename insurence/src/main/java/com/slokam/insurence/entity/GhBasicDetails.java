package com.slokam.insurence.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="ghbasicdetails")
public class GhBasicDetails {
	
	@Id
	@GeneratedValue
	 private Integer id;
	 private String code;
	 private String panno;
	 private String otherspecify;
	 private String name;
	 private String tanno;
	 private Date dateofappointment;
	 private Date effectivedate;
	 private double businessincome;
	 
	 @ManyToOne
	 @JoinColumn(name="pinid")
	 private PreviousinsurernameEntity pinid;
	 @ManyToOne
	 @JoinColumn(name="catid")
	 private CorporateagencytypeEntity catid;
	 @ManyToOne
	 @JoinColumn(name="statusid")
	 private GhStatusEntity statusid;
	 @ManyToOne
	 @JoinColumn(name="channelid")
	 private ChannelEntity channelid;
	 @ManyToOne
	 @JoinColumn(name="retid")
	 private RelationshiptypeEntity retid;
	 @ManyToOne
	 @JoinColumn(name="arocid")
	 private AreaOfOperationEntity arocid;
	 
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getOtherspecify() {
		return otherspecify;
	}
	public void setOtherspecify(String otherspecify) {
		this.otherspecify = otherspecify;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTanno() {
		return tanno;
	}
	public void setTanno(String tanno) {
		this.tanno = tanno;
	}
	public Date getDateofappointment() {
		return dateofappointment;
	}
	public void setDateofappointment(Date dateofappointment) {
		this.dateofappointment = dateofappointment;
	}
	public Date getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	public double getBusinessincome() {
		return businessincome;
	}
	public void setBusinessincome(double businessincome) {
		this.businessincome = businessincome;
	}
	public PreviousinsurernameEntity getPinid() {
		return pinid;
	}
	public void setPinid(PreviousinsurernameEntity pinid) {
		this.pinid = pinid;
	}
	public CorporateagencytypeEntity getCatid() {
		return catid;
	}
	public void setCatid(CorporateagencytypeEntity catid) {
		this.catid = catid;
	}
	public GhStatusEntity getStatusid() {
		return statusid;
	}
	public void setStatusid(GhStatusEntity statusid) {
		this.statusid = statusid;
	}
	public ChannelEntity getChannelid() {
		return channelid;
	}
	public void setChannelid(ChannelEntity channelid) {
		this.channelid = channelid;
	}
	public RelationshiptypeEntity getRetid() {
		return retid;
	}
	public void setRetid(RelationshiptypeEntity retid) {
		this.retid = retid;
	}
	public AreaOfOperationEntity getArocid() {
		return arocid;
	}
	public void setArocid(AreaOfOperationEntity arocid) {
		this.arocid = arocid;
	}
	
	 
	 
}
