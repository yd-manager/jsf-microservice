package tr.com.yd.tabak.restapi.domain.dto;

import java.sql.Date;

import tr.com.yd.tabak.restapi.domain.converter.Convertable;
import tr.com.yd.tabak.restapi.domain.entity.BaseEntity;

public abstract class BaseDTO<E extends BaseEntity> implements Convertable<E>{

	private Long id;
	private Date creationDate;
	private Date updatedDate;
	private Long createdUserId;
	private Long updatedUserId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Long getCreatedUserId() {
		return createdUserId;
	}
	public void setCreatedUserId(Long createdUserId) {
		this.createdUserId = createdUserId;
	}
	public Long getUpdatedUserId() {
		return updatedUserId;
	}
	public void setUpdatedUserId(Long updatedUserId) {
		this.updatedUserId = updatedUserId;
	}
	
	
}
