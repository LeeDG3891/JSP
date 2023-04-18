package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet1
 */
/*@WebServlet("")*/
public class TestServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out=response.getWriter();
	    
	    String context = request.getContextPath(); // context 이름 가져옴.
	    String url = request.getRequestURL().toString();	// 전체 URL 가져옴.
	    String mapping = request.getServletPath();
	    String uri = request.getRequestURI();
	    
	    out.println("<html><head>");
	    out.println("<title>Test Servlet4</title>");
	    out.println("</head>");
	    out.println("<body bgcolor='pink'>");
	    out.println("<b>TestServlet4입니다.</b><br>");
	    out.println("<b>컨텍스트명 : " + context + "</b><br>");
	    out.println("<b>전체경로 : " + url + "</b><br>");
	    out.println("<b>매핑명 : " + mapping + "</b><br>");
	    out.println("<b>URI : " + uri + "</b>");
	    out.println("</body></html>");
	}

}
