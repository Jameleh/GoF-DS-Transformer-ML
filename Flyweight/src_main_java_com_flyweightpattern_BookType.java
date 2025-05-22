package com.flyweightpattern;


public class BookType {

    private  String type;
    private  String distributor;
    private  String otherData;
    
    public BookType(String type, String distributor, String otherData) {
    	this.type = type;
    	this.distributor = distributor;
    	this.otherData = otherData;
    }
    
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDistributor() {
		return distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}
	public String getOtherData() {
		return otherData;
	}
	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}
	
	public String toString() {
		return "{"+
				"type='"+type+'\''+
				",distributor='"+distributor+'\''+
				",otherData='"+otherData+'\''+
				'}';
	}

}