package src;

import java.awt.*;
import javax.swing.*;
public class Confirmation extends Frame {
	JLabel main;
	JLabel id,date,theatre,time,movie,seats;
	JLabel print_id,print_date,print_theatre,print_time,print_movie,print_seats;
	public Confirmation(String cid,String cdate,String ctheatre,String ctime,String cmovie,String cseats)
	{
		JFrame jf=new JFrame();
		main = new JLabel("CONFIRMATION");
		main.setForeground(Color.blue);
		main.setFont(new Font("Serif", Font.BOLD, 20));

	    id=new JLabel("BOOKING ID");
	    date=new JLabel("DATE");
	    theatre=new JLabel("THEATRE");
	    time=new JLabel("TIME");
	    movie=new JLabel("MOVIE");
	    seats=new JLabel("SEATS");
	    
	    print_id=new JLabel(cid);
	    print_date=new JLabel(cdate);
	    print_theatre=new JLabel(ctheatre);
	    print_time=new JLabel(ctime);
	    print_movie=new JLabel(cmovie);
	    print_seats=new JLabel(cseats);
	    
	    main.setBounds(400, 30, 450, 30);
		id.setBounds(180, 70, 200, 30);
		date.setBounds(180, 110, 200, 30);
		theatre.setBounds(180, 150, 200, 30);
		time.setBounds(180, 190, 200, 30);
		movie.setBounds(180, 230, 200, 30);
		seats.setBounds(180, 270, 200, 30);
		
		print_id.setBounds(500, 70, 200, 30);
		print_date.setBounds(500, 110, 200, 30);
		print_theatre.setBounds(500, 150, 200, 30);
		print_time.setBounds(500, 190, 200, 30);
		print_movie.setBounds(500, 230, 200, 30);
		print_seats.setBounds(500, 270, 200, 30);

		  
		jf.add(main);
		jf.add(id);
		jf.add(date);
		jf.add(theatre);
		jf.add(time);
		jf.add(movie);
		jf.add(seats);
		
		jf.add(print_id);
		jf.add(print_date);
		jf.add(print_theatre);
		jf.add(print_time);
		jf.add(print_movie);
		jf.add(print_seats);
				
		jf.setSize(1000, 1000);
		jf.setLayout(null);
		jf.setVisible(true);
		
	  }
	 
	public static void main(String[] args) {
		Confirmation screen=new Confirmation("1234","24-August-2018","City Pride","12:15 pm","Infinity war","A-1,A-2");
	}
	
}
