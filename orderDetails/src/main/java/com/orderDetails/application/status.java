package com.orderDetails.application;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "status")
public class status {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long statusId;

    @Column (name = "statusId", length = 30)
    private int StatusId;
    
    
    @Column(name = "status", length = 255)
    @NotNull
    private String Status;

	public status() {
	}

	public Long getststusId() {
		return statusId;
	}

	public void setstatusId(Long StatusId) {
		this.statusId = StatusId;
	}


	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		this.Status = status;
	}

}
