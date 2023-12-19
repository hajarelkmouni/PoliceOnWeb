package com.java.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.java.beans.PersonneNonIdentifiee;
import com.java.dao.DAOFactory;
import com.java.dao.DAOPersonneNonIdentifiee;

public class allPniVisiteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public allPniVisiteur() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOPersonneNonIdentifiee obj = DAOFactory.getInstance().getDAOPersonneNonIdentifiee();
		List<PersonneNonIdentifiee> listpni = obj.getAll();
		request.setAttribute("listpni", listpni);
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/allPni.jsp").forward(request, response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
