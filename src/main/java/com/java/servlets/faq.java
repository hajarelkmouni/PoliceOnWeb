package com.java.servlets;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.java.beans.Faq;
import com.java.dao.DAOFactory;
import com.java.dao.DAOFaq;
import com.java.helpers.dashAdminNum;

public class faq extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public faq() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dashAdminNum.getInstance(request,response);	
		DAOFaq obj = DAOFactory.getInstance().getDAOFaq();
		List<Faq> faqs = obj.getAllFaqs();
		request.setAttribute("faqs", faqs);
		this.getServletContext().getRequestDispatcher("/WEB-INF/dashAdmin/faq/index.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
