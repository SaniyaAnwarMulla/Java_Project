package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {
@Id
private int bId;
private String batchName;
/*
@OneToOne(targetEntity = Faculty.class,cascade = CascadeType.ALL)
private Faculty faculty;
*/
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public String getBatchName() {
	return batchName;
}
public void setBatchName(String batchName) {
	this.batchName = batchName;
}
@Override
public String toString() {
	return "Batches [bId=" + bId + ", batchName=" + batchName + "]";
}

}
