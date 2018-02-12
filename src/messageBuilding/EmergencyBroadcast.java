package messageBuilding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmergencyBroadcast
 */
@WebServlet("/emergencyBroadcast")
public class EmergencyBroadcast extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmergencyBroadcast() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yourDoom = request.getParameter("yourDoom");
		String capitalizedDoom = yourDoom.toUpperCase();
		
		
		String yourDoomLocation = request.getParameter("doomLocation");
		String capitalizedDoomLocation = yourDoomLocation.substring(0,1).toUpperCase() +
		yourDoomLocation.substring(1).toLowerCase();
		
		String drill = request.getParameter("drill");
		
		
		PrintWriter writer = response.getWriter();
		writer.println("EMERGENCY ALERT<br>");
		writer.println("IMMEDIATE THREAT: " + capitalizedDoom + " INBOUND TO: "+ capitalizedDoomLocation+"<br>");
		writer.println("SEEK IMMEDIATE SHELTER<br>");
		writer.println(drill+"<br>");
		writer.println("<button onclick=\"goBack()\">Make another Alert</button>\r\n" + 
				"\r\n" + 
				"<script>\r\n" + 
				"function goBack() {\r\n" + 
				"    window.history.back();\r\n" + 
				"}\r\n" + 
				"</script>");
		
		writer.close();
		//doGet(request, response);
	}

}
