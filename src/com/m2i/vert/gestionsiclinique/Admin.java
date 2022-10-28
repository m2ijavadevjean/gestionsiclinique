package com.m2i.vert.gestionsiclinique;

public class Admin {
private int id;
private String username;
private int isAdmin;
public Admin(int id, String username, int isAdmin, MedicalStaff medicalstaff, Receptionist receptionist,
		Finance finance) {
	
	this.id = id;
	this.username = username;
	this.isAdmin = isAdmin;
	this.medicalstaff = medicalstaff;
	this.receptionist = receptionist;
	this.finance = finance;
}
private MedicalStaff medicalstaff;
private Receptionist receptionist;
private Finance finance;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getIsAdmin() {
	return isAdmin;
}
public void setIsAdmin(int isAdmin) {
	this.isAdmin = isAdmin;
}
public MedicalStaff getMedicalstaff() {
	return medicalstaff;
}
public void setMedicalstaff(MedicalStaff medicalstaff) {
	this.medicalstaff = medicalstaff;
}
public Receptionist getReceptionist() {
	return receptionist;
}
public void setReceptionist(Receptionist receptionist) {
	this.receptionist = receptionist;
}
public Finance getFinance() {
	return finance;
}
public void setFinance(Finance finance) {
	this.finance = finance;
}













}
//une fontion "add"
//une fontion "modify"
//une fontion "view"
//une fontion "search"
//une fontion "edit data"
//une fontion "edit profile"
