package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.repository.ContactRepository;

/**
 * Servlet implementation class ContactDeleteController
 */
public class ContactDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(ContactUpdateController.class.getName());
	
    public ContactDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO: Delete contact
		
		ContactRepository repository = ContactRepository.getInstance();
		repository.deleteContact(request.getParameter("id"));
		
		// TODO: Forward to contact list view
		request.setAttribute("message", "Contact deleted successfully");
		request.getRequestDispatcher("/contactlist").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
