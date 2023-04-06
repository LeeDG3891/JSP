package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	public void init() {
		System.out.println("init 메서드 호출");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		// getParameter() 메서드를 이용하여 전송된 회원정보를 가져온다
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		// hidden 태그로 전송된 값을 가져온다
		String user_address = request.getParameter("user_address");
		String user_email = request.getParameter("user_email");
		String user_hp = request.getParameter("user_hp");
		
		// 브라우저로 결과 출력
		String data = "안녕하세요!<br> 로그인하셨습니다.<br><br>";
		
		data += "<html><body>";
		data += "아이디 : " + user_id;
		data += "<br>";
		data += "패스워드 : " + user_pw;
		data += "<br>";
		data += "주소 : " + user_address;
		data += "<br>";
		data += "email : " + user_email;
		data += "<br>";
		data += "휴대전화 : " + user_hp;
		data += "</body></html>";
		
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

}
