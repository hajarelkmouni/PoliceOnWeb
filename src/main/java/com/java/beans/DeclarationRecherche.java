package com.java.beans;

import java.time.LocalDateTime;

public class DeclarationRecherche
{
	private int id_plainte_pr;
	private String id_pre;
	private String id_user;
	private String lieuDesFaits;
	private LocalDateTime dateDesFaits;
	private String description;
	private String témoins;
	private String photos;
	private String filiationconnue;
	public int getId_plainte_pr() {
		return id_plainte_pr;
	}
	public void setId_plainte_pr(int id_plainte_pr) {
		this.id_plainte_pr = id_plainte_pr;
	}
	public String getId_pre() {
		return id_pre;
	}
	public void setId_pre(String id_pre) {
		this.id_pre = id_pre;
	}
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getLieuDesFaits() {
		return lieuDesFaits;
	}
	public void setLieuDesFaits(String lieuDesFaits) {
		this.lieuDesFaits = lieuDesFaits;
	}
	public LocalDateTime getDateDesFaits() {
		return dateDesFaits;
	}
	public void setDateDesFaits(LocalDateTime dateDesFaits) {
		this.dateDesFaits = dateDesFaits;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTémoins() {
		return témoins;
	}
	public void setTémoins(String témoins) {
		this.témoins = témoins;
	}
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	public String getFiliationconnue() {
		return filiationconnue;
	}
	public void setFiliationconnue(String filiationconnue) {
		this.filiationconnue = filiationconnue;
	}


	

}
