package com.java.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.java.beans.User;

public class UserDAOImpl implements DAOUser
{
	private DAOFactory daofactory;
	public UserDAOImpl(DAOFactory daofactory)
	{
		this.daofactory = daofactory;
	}




	@Override
	public List<User> getAllUsers() {
		return null;
	}

	@Override
	public void addUser(String CIN, String nom, String prenom, String adresse, String tel, String nationalite, String profession, Date myDate, String lieunaissance, String sexe, String email, String mdp) {

	}

	@Override
	public void deleteUser(String CIN) {

	}

	@Override
	public void updateUser(String CIN, String nom, String prenom, String adresse, String tel, String email, String mdp) {

	}

	@Override
	public List<User> findUser(String CIN) {
		return null;
	}

	@Override
	public User getUserByEmailAndPassword(String email, String mdp) {
		return null;
	}
}
