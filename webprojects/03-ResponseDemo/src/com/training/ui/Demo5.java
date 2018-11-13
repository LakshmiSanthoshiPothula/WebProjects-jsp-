package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Player;

/**
 * Servlet implementation class Demo5
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Set<Player> players=new HashSet<Player>();
		
        Player p1 = new Player(101, "sachin", 500, 33300, 2, true);
        Player p2 = new Player(102, "Rahil", 500, 40333, 1, false);
        Player p3 = new Player(103, "maheendhar", 50, 35, 2, false);
        Player p4 = new Player(104, "tendulkar", 50, 25, 1, false);
        Player p5 = new Player(105, "kohli", 50, 40, 2, false);
        Player p6 = new Player(106, "sachin", 50, 45, 2,false);
        Player p7 = new Player(107, "shewag", 50, 4441, 3, false);
        Player p8 = new Player(108, "Dhoni", 50, 48, 2, false);
        Player p9 = new Player(109, "sachin", 50, 424, 2, false);
        Player p10 = new Player(110, "kapil", 50, 40, 4, true);
        Player p11 = new Player(111, "virat", 50, 465, 2,true);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
        players.add(p9);
        players.add(p10);
        players.add(p11);
        PrintWriter out = response.getWriter();
        out.println("<link href='style.css' rel='Stylesheet'>");
        out.println("<table style=' border:dotted' ><tr>"
        
        		+ "<th>Id</th>"
        		+ "<th>Name</th>"
        		+ "<th>Matches</th>"
        		+ "<th>Runs</th>"
        		+ "<th>Wickets</th>"
        		+ "<th>Captain</th>"
        		+ "<th>BowingRating</th>"
        		+ "<th>BattingRating</th></tr>");   
          for (Player player : players) {
        	  out.println("<tr>");
        	  out.println("<td>");
        	  out.println(player.getPlayerId());
        	  out.println("</td>");
        	  out.println("<td>");
        	  out.println(player.getPlayerName());
        	  out.println("</td>");
        	  out.println("<td>");
        	  out.println(player.getNoOfMatches());
        	  out.println("</td>");
        	  out.println("<td>");
        	  out.println(player.getTotalRunsScored());
        	  out.println("</td>");
        	  out.println("<td>");
        	  out.println(player.getNoOWickets());
        	  out.println("</td>");
        	  out.println("<td>");
        	  out.println(player.isCaptain());
        	  out.println("</td>");
        	  out.println("<td>");
        	  out.println(player.getBowlingRating());
        	  out.println("</td>");
        	  out.println("<td>");
        	  out.println(player.getBattingRating());
        	  out.println("</td>");
        	  out.println("</tr>");
         }


		
	}

}
