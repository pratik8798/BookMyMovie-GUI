package src;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/*
public class UserFrame extends Frame implements ActionListener {

	JButton button1,button2,button3;
	JLabel labelback;
	
	JPanel pan1,pan2,pan3,pan4,pan5;
	JButton pan_button1,pan_button2,pan_button3,pan_button4,pan_button5,pan_button6;
	JLabel pan_label1,pan_label2,pan_label3,pan_label4,pan_label5,pan_label6;
	JComboBox movie_list,theatre_list,screen_list,city_list,time_list;
	
	String[] list_of_movies= {"Movie1","Movie2","Movie3bigstring fits in or not"};
	String[] list_of_theatres= {"Theatre1","Theatre2","Theatre3bigstring fits in or not"};
	String[] list_of_screens= {"Screen1","Screen2","Screen3bigstring fits in or not"};
	String[] list_of_dates= {"Movie1","Movie2","Movie3bigstring fits in or not"};
	String[] list_of_time= {"Theatre1","Theatre2","Theatre3bigstring fits in or not"};
	String[] seats= {"1","2","3","4","5","6","7","8","9","10"
			,"1","2","3","4","5","6","7","8","9","10",
			"1","2","3","4","5","6","7","8","9","10",
			"1","2","3","4","5","6","7","8","9","10"};
			
	
	
	
	
	
	public UserFrame()
	{
		JFrame main=new JFrame("User Frame");
		
		labelback=new JLabel("USER PAGE");
		labelback.setForeground(Color.BLUE);
		labelback.setFont(new Font("Serif",Font.BOLD,20));
		
		button1=new JButton(new AbstractAction("BOOK") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
	        	pan1.setVisible(true);
	        	pan2.setVisible(false);
	            pan3.setVisible(false);
	            pan4.setVisible(false);
	            pan5.setVisible(false);
	          
	        }
	    });
		button2=new JButton(new AbstractAction("SHOw") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
	        	pan1.setVisible(true);
	        	pan2.setVisible(false);
	            pan3.setVisible(false);
	            pan4.setVisible(false);
	            pan5.setVisible(false);
	          
	        }
	    });


		
		button3=new JButton(new AbstractAction("LOGOUT") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	            pan1.setVisible(false);
	            pan2.setVisible(false);
	            pan3.setVisible(false);
	            pan4.setVisible(false);
	            pan5.setVisible(false);
	            
	        }
	    });
		
		pan1=new JPanel();
		pan2=new JPanel();
		pan3=new JPanel();
		pan4=new JPanel();
		pan5=new JPanel();
		
		
		pan_button1=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan2.setVisible(true);
				
			}
		});

		pan_button2=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan3.setVisible(true);
				
			}
		});

		pan_button3=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan4.setVisible(true);
				
			}
		});
		
		pan_button4=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan5.setVisible(true);
				
			}
		});


		pan_label1=new JLabel("SELECT CITY");
		pan_label2=new JLabel("SELECT MOVIE");
		pan_label3=new JLabel("SELECT DATE");
		pan_label4=new JLabel("SELECT MOVIE");
		pan_label5=new JLabel("SELECT DATE");
		
		pan_label4=new JLabel();
		
		movie_list=new JComboBox(list_of_movies);
		theatre_list=new JComboBox(list_of_theatres);
		screen_list=new JComboBox(list_of_screens);
		
		
		//movie_list.addItem(list_of_movies);
		
		pan1.setVisible(false);
		pan2.setVisible(false);
		labelback.setBounds(425, 30, 1000, 30);
		button1.setBounds(30,80,200,50);
		button2.setBounds(30,200,200,50);
		
		pan1.setBounds(250,100,900,100);
		pan2.setBounds(250,200,900,100); 
		pan3.setBounds(250,300,900,100); 
		pan4.setBounds(250,400,900,100); 

		pan_label1.setBounds(30,30,200,50);
		movie_list.setBounds(250, 30, 200, 50);
		pan_button1.setBounds(480, 30,200, 50);
		
		pan_label2.setBounds(30,30,200,50);
		theatre_list.setBounds(250, 30, 200, 50);
		pan_button2.setBounds(480,30,200, 50);
		
		pan_label3.setBounds(30,30,200,50);
		screen_list.setBounds(250, 30, 200, 50);
		pan_button3.setBounds(480,30,200, 50);
		
		//pan1.setLayout(new FlowLayout());
		//pan2.setLayout(new FlowLayout());
		//pan1.setLayout(new BoxLayout(pan1, BoxLayout.PAGE_AXIS));
		//pan2.setLayout(new BoxLayout(pan2, BoxLayout.PAGE_AXIS));
		
		//pan1.setSize(250, 250);
		//pan2.setSize(250, 250);

		main.add(labelback);
		main.add(button1);
		main.add(button2);		
		main.add(pan1);
		main.add(pan2);
		//main.add(pan3);
		//main.add(pan4);
		
		pan1.add(pan_label1);
		pan1.add(movie_list);
		pan1.add(pan_button1);

		pan2.add(pan_label2);
		pan2.add(theatre_list);
		pan2.add(pan_button2);

		pan3.add(pan_label3);
		pan3.add(screen_list);
		pan3.add(pan_button3);

		
		main.setSize(2000, 2000);
		main.setLayout(null);
		main.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		UserFrame user=new UserFrame();
		
	}
	}
	
	*/



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;


import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
public class UserFrame extends Frame implements ActionListener {

	JButton button1,button2,button3;
	JLabel labelback;
	
	JPanel pan1,pan2,pan3,pan4,pan5,pan6,pan7;
	JPanel pan2_1,pan2_2;
	JButton pan_button1,pan_button2,pan_button3,pan_button4,pan_button5,pan_button6;
	JButton pan_button_2_1,pan_button_2_2;
	JLabel pan_label1,pan_label2,pan_label3,pan_label4,pan_label5,pan_label6,pan_label7;
	JLabel pan_label_2_1,pan_label_2_2;
	
	JTextField seats1;
	
	
	 JFrame main;
	
	 JComboBox movie_list,theatre_list,date_list,city_list,time_list,active_tickets,history_tickets;
		
	String[] list_of_movies= {"Movie1","Movie2","Movie3bigstring fits in or not"};
	String[] list_of_theatres= {"Theatre1","Theatre2","Theatre3bigstring fits in or not"};
	String[] list_of_cities= {"Screen1","Screen2","Screen3bigstring fits in or not"};
	String[] list_of_dates= {"Movie1","Movie2","Movie3bigstring fits in or not"};
	String[] list_of_time= {"Theatre1","Theatre2","Theatre3bigstring fits in or not"};
	String seats= "1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10";
	String[] active= {"active 1","active 2"};
	String[] history= {"hist 1","hist 2"};
	
	public UserFrame()
	{
		 main=new JFrame("User Frame");
		
		labelback=new JLabel("USER PAGE");
		labelback.setForeground(Color.BLUE);
		labelback.setFont(new Font("Serif",Font.BOLD,20));
		
		
		
		
		button1=new JButton(new AbstractAction("BOOK") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
	        	pan1.setVisible(true);
	        	pan2.setVisible(false);
	            pan3.setVisible(false);
	            pan4.setVisible(false);
	            pan5.setVisible(false);
	            pan6.setVisible(false);
	            pan7.setVisible(false);
	            pan2_1.setVisible(false);
	            pan2_2.setVisible(false);
	        }
	    });

		button2=new JButton(new AbstractAction("SHOW") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	            pan1.setVisible(false);
	            pan2.setVisible(false);
	            pan3.setVisible(false);
	            pan4.setVisible(false);
	            pan5.setVisible(false);
	            pan6.setVisible(false);
	            pan7.setVisible(false);
	            pan2_1.setVisible(true);
	            pan2_2.setVisible(true);
	            
	            
	            
	        }
	    });
		
		button3=new JButton(new AbstractAction("LOGOUT") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	              main.dispose();
	            
	        }
	    });
		
		pan1=new JPanel();
		pan2=new JPanel();
		pan3=new JPanel();
		pan4=new JPanel();
		pan5=new JPanel();
		pan6=new JPanel();
		pan7=new JPanel();
		pan2_1=new JPanel();
		pan2_2=new JPanel();
		
		
		pan1.setVisible(false);
		pan2.setVisible(false);
		pan3.setVisible(false);
		pan4.setVisible(false);
		pan5.setVisible(false);
		pan6.setVisible(false);
		pan7.setVisible(false);
		pan2_1.setVisible(false);
		pan2_2.setVisible(false);
		
		pan_button1=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan2.setVisible(true);
				
			}
		});

		pan_button2=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan3.setVisible(true);
				
			}
		});

		pan_button3=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan4.setVisible(true);
				
			}
		});
		
		pan_button4=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan5.setVisible(true);
				
				
			}
		});
		
		pan_button5=new JButton(new AbstractAction("NEXT") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan6.setVisible(true);
				pan7.setVisible(true);
				
			}
		});

		pan_button6=new JButton(new AbstractAction("FINISH") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//confirmation page constructor
				
			}
		});
		pan_button_2_1=new JButton(new AbstractAction("GO") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				//confirmation constructor
				
			}
		});
		pan_button_2_2=new JButton(new AbstractAction("GO") {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//confirmation constructor
	}
});



		pan_label1=new JLabel("SELECT CITY");
		pan_label2=new JLabel("SELECT MOVIE");
		pan_label3=new JLabel("SELECT DATE");
		pan_label4=new JLabel("SELECT THEATRE");
		pan_label5=new JLabel("SELECT TIME");
		pan_label6=new JLabel("SEATING ARRANGEMENT");
		pan_label7=new JLabel("SELECT SEATS");
		pan_label_2_1=new JLabel("ACTIVE TICKETS");
		pan_label_2_2=new JLabel("HISTORY");

		
		movie_list=new JComboBox(list_of_movies);
		theatre_list=new JComboBox(list_of_theatres);
		date_list=new JComboBox(list_of_dates);
		time_list=new JComboBox(list_of_time);
		city_list=new JComboBox(list_of_cities);
		active_tickets=new JComboBox(active);
		history_tickets=new JComboBox(history);
		
		seats1=new JTextField();
		
		//movie_list.addItem(list_of_movies);
		
		labelback.setBounds(425, 0, 1000, 30);
		button1.setBounds(30,80,200,50);
		button2.setBounds(30,160,200,50);
		button3.setBounds(30,250,200,50);
		
		pan1.setBounds(250,0,900,80);
		pan2.setBounds(250,90,900,80); 
		pan3.setBounds(250,180,900,80); 
		pan4.setBounds(250,270,900,80); 
		pan5.setBounds(250,360,900,80);
		pan6.setBounds(250,450,900,160); 
		pan7.setBounds(250,630,900,80);
		
		pan2_1.setBounds(250,50,900,250);
		pan2_2.setBounds(250,350,900,250); 
		
		pan1.setLayout(null);
		pan2.setLayout(null);
		pan3.setLayout(null);
		pan4.setLayout(null);
		pan5.setLayout(null);
		pan6.setLayout(null);
		pan7.setLayout(null);
		pan2_1.setLayout(null);
		pan2_2.setLayout(null);

		pan_label1.setBounds(50,50,150,30);
		city_list.setBounds(250, 50, 300, 30);
		pan_button1.setBounds(600, 50,200, 30);
		
		pan_label2.setBounds(50,20,150,30);
		movie_list.setBounds(250, 20, 300, 30);
		pan_button2.setBounds(600,20,200, 30);
		
		pan_label3.setBounds(50,20,150,30);
		date_list.setBounds(250, 20, 300, 30);
		pan_button3.setBounds(600,20,200, 30);
		
		//pan1.setLayout(new FlowLayout());
		//pan2.setLayout(new FlowLayout());
		//pan1.setLayout(new BoxLayout(pan1, BoxLayout.PAGE_AXIS));
		//pan2.setLayout(new BoxLayout(pan2, BoxLayout.PAGE_AXIS));
		
		//pan1.setSize(250, 250);
		//pan2.setSize(250, 250);

		pan_label4.setBounds(50,20,150,30);
		theatre_list.setBounds(250, 20, 300, 30);
		pan_button4.setBounds(600,20,200, 30);
		
		pan_label5.setBounds(50,20,150,30);
		time_list.setBounds(250, 20, 300, 30);
		pan_button5.setBounds(600,20,200, 30);
		
	   	pan_label6.setBounds(50,20,250,30);
	   	JLabel seating=new JLabel("ABCDFSKFSEFGS:LAFFAjkahlafjlajfljfelknflksjfalhdkgsaugiBDAKK");
        JTextArea seatnew=new JTextArea();
        seatnew.setEditable(false);
        seatnew.add(seating);
	    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED ;
	    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED ;
	 
	    //JScrollPane js = new JScrollPane(js, v, h ) ;
	    JScrollPane scrPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
	    		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    scrPane.setBounds(350,10,500,150);
	    seatnew.setBounds(350,10,500,150);
	    scrPane.setPreferredSize(new Dimension(100,100));
	    //scrPane .getViewport().add( lab_test);
	    scrPane.add(seatnew);
	    
	   	//js.setBounds(250,500,900,150);
	   	
	   	pan_label7.setBounds(50,20,150,30);
		seats1.setBounds(300, 20, 300, 30);
		pan_button6.setBounds(650,20,200, 30);
		
		pan_label_2_1.setBounds(50,50,250,30);
		active_tickets.setBounds(300, 50, 300, 30);
		pan_button_2_1.setBounds(650,50,200, 30);
		
		pan_label_2_2.setBounds(50,50,150,30);
		history_tickets.setBounds(300, 50, 300, 30);
		pan_button_2_2.setBounds(650,50,200, 30);
		
		
		main.add(labelback);
		main.add(button1);
		main.add(button2);	
		main.add(button3);
		
		main.add(pan1);
		main.add(pan2);
		main.add(pan3);
		main.add(pan4);
		main.add(pan5);
		main.add(pan6);
		//main.getContentPane().add(pan6);
		main.add(pan7);
		main.add(pan2_1);
		main.add(pan2_2);
		
		pan1.add(pan_label1);
		pan1.add(city_list);
		pan1.add(pan_button1);

		pan2.add(pan_label2);
		pan2.add(movie_list);
		pan2.add(pan_button2);

		pan3.add(pan_label3);
		pan3.add(date_list);
		pan3.add(pan_button3);

		pan4.add(pan_label4);
		pan4.add(theatre_list);
		pan4.add(pan_button4);
		
		pan5.add(pan_label5);
		pan5.add(time_list);
		pan5.add(pan_button5);
		
		pan6.add(pan_label6);
		pan6.add(seating);  
		pan6.add(scrPane);
		
		pan7.add(pan_label7);
		pan7.add(seats1);
		pan7.add(pan_button6);
		
		pan2_1.add(pan_label_2_1);
		pan2_1.add(active_tickets);
		pan2_1.add(pan_button_2_1);
		
		pan2_2.add(pan_label_2_2);
		pan2_2.add(history_tickets);
		pan2_2.add(pan_button_2_2);
		
		main.setSize(2000, 3000);
		main.setLayout(null);
		main.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		UserFrame user=new UserFrame();
		
	}
};	