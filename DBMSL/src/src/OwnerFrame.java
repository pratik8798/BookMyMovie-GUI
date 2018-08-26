package src;

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
public class OwnerFrame extends Frame implements ActionListener {

	JButton button1,button2;
	JLabel labelback;
	
	JPanel pan1,pan2,pan3,pan4,pan5,pan6;
	JButton pan_button1,pan_button2,pan_button3,pan_button4,pan_button5,pan_button6;
	JLabel pan_label1,pan_label2,pan_label3,pan_label4,pan_label5,pan_label6;
	JComboBox movie_list,theatre_list,screen_list;
	
	JTextField price;
	
	JSpinner hours,minutes;
	String[] list_of_movies= {"Movie1","Movie2","Movie3bigstring fits in or not"};
	String[] list_of_theatres= {"Theatre1","Theatre2","Theatre3bigstring fits in or not"};
	String[] list_of_screens= {"Screen1","Screen2","Screen3bigstring fits in or not"};
	 JFrame main;
	public OwnerFrame()
	{
		 main=new JFrame("Owner Frame");
		
		labelback=new JLabel("OWNER PAGE");
		labelback.setForeground(Color.BLUE);
		labelback.setFont(new Font("Serif",Font.BOLD,20));
		
		
		
		
		button1=new JButton(new AbstractAction("SCHEDULE") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	            // add Action
	        	pan1.setVisible(true);
	        	pan2.setVisible(false);
	            pan3.setVisible(false);
	            pan4.setVisible(false);
	            pan5.setVisible(false);
	            pan6.setVisible(false);
	            
	          
	        }
	    });

		button2=new JButton(new AbstractAction("LOGOUT") {
	        @Override
	        public void actionPerformed( ActionEvent e ) {
	            pan1.setVisible(false);
	            pan2.setVisible(false);
	            pan3.setVisible(false);
	            pan4.setVisible(false);
	            pan5.setVisible(false);
	            pan6.setVisible(false);
	            main.dispose();
	            
	        }
	    });
		
		pan1=new JPanel();
		pan2=new JPanel();
		pan3=new JPanel();
		pan4=new JPanel();
		pan5=new JPanel();
		pan6=new JPanel();
		
		pan1.setVisible(false);
		pan2.setVisible(false);
		pan3.setVisible(false);
		pan4.setVisible(false);
		pan5.setVisible(false);
		pan6.setVisible(false);
			
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
				
			}
		});

		pan_button6=new JButton(new AbstractAction("FINISH") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.dispose();
				
			}
		});



		pan_label1=new JLabel("MOVIES");
		pan_label2=new JLabel("THEATRE");
		pan_label3=new JLabel("SCREENS");
		pan_label4=new JLabel("DATE");
		pan_label5=new JLabel("TIME");
		pan_label6=new JLabel("PRICE");
		
		movie_list=new JComboBox(list_of_movies);
		theatre_list=new JComboBox(list_of_theatres);
		screen_list=new JComboBox(list_of_screens);
		
		price=new JTextField();
		
		//movie_list.addItem(list_of_movies);
		
		labelback.setBounds(425, 30, 1000, 30);
		button1.setBounds(30,80,200,50);
		button2.setBounds(30,200,200,50);
		
		pan1.setBounds(250,100,900,100);
		pan2.setBounds(250,200,900,100); 
		pan3.setBounds(250,300,900,100); 
		pan4.setBounds(250,400,900,100); 
		pan5.setBounds(250,500,900,100);
		pan6.setBounds(250,600,900,100); 

		pan1.setLayout(null);
		pan2.setLayout(null);
		pan3.setLayout(null);
		pan4.setLayout(null);
		pan5.setLayout(null);
		pan6.setLayout(null);
		

		pan_label1.setBounds(50,30,150,50);
		movie_list.setBounds(250, 30, 300, 50);
		pan_button1.setBounds(600, 30,200, 50);
		
		pan_label2.setBounds(50,30,150,50);
		theatre_list.setBounds(250, 30, 300, 50);
		pan_button2.setBounds(600,30,200, 50);
		
		pan_label3.setBounds(50,30,150,50);
		screen_list.setBounds(250, 30, 300, 50);
		pan_button3.setBounds(600,30,200, 50);
		
		//pan1.setLayout(new FlowLayout());
		//pan2.setLayout(new FlowLayout());
		//pan1.setLayout(new BoxLayout(pan1, BoxLayout.PAGE_AXIS));
		//pan2.setLayout(new BoxLayout(pan2, BoxLayout.PAGE_AXIS));
		
		//pan1.setSize(250, 250);
		//pan2.setSize(250, 250);

		UtilDateModel model = new UtilDateModel();
		//model.setDate(24,04,2018);
		// Need this...
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		// Don't know about the formatter, but there it is...
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(250, 50, 200, 100);
		pan_label4.setBounds(50,30,150,50);
		pan_button4.setBounds(600,30,200, 50);
		
		SpinnerModel hvalue =  
	             new SpinnerNumberModel(0, //initial value  
	                0, //minimum value  
	                23, //maximum value  
	                1); //step  
	    hours = new JSpinner(hvalue);   
	            hours.setBounds(100,100,50,30);    

	    SpinnerModel mvalue =  
	   	             new SpinnerNumberModel(0, //initial value  
	   	                0, //minimum value  
	   	                59, //maximum value  
	   	                15); //step  
	   	  minutes = new JSpinner(mvalue);   
	   	            minutes.setBounds(100,100,50,30);    
	
	   	pan_label5.setBounds(50,30,150,50);
	   	hours.setBounds(250, 30, 100, 30);
	   	minutes.setBounds(375, 30, 100, 30);
	   	pan_button5.setBounds(600,30,200, 50);
	   	
	   	pan_label6.setBounds(50,30,150,50);
		price.setBounds(300, 30, 200, 50);
		pan_button6.setBounds(600,30,200, 50);
		
	
		
		main.add(labelback);
		main.add(button1);
		main.add(button2);		
		main.add(pan1);
		main.add(pan2);
		main.add(pan3);
		main.add(pan4);
		main.add(pan5);
		main.add(pan6);
		
		pan1.add(pan_label1);
		pan1.add(movie_list);
		pan1.add(pan_button1);

		pan2.add(pan_label2);
		pan2.add(theatre_list);
		pan2.add(pan_button2);

		pan3.add(pan_label3);
		pan3.add(screen_list);
		pan3.add(pan_button3);

		pan4.add(pan_label4);
		pan4.add(datePicker);
		pan4.add(pan_button4);
		
		pan5.add(pan_label5);
		pan5.add(hours);
		pan5.add(minutes);
		pan5.add(pan_button5);
		
		pan6.add(pan_label6);
		pan6.add(price);
		pan6.add(pan_button6);
		
		
		main.setSize(2000, 2000);
		main.setLayout(null);
		main.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		OwnerFrame owner=new OwnerFrame();
		
	}
	public void calender()
	{
		JFrame f1 = new JFrame();
        //f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(300, 300);
        f1.setVisible(true);

        //Container conn = f1.getContentPane();
        //conn.setLayout(null);

		
		UtilDateModel model = new UtilDateModel();
		//model.setDate(24,04,2018);
		// Need this...
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		// Don't know about the formatter, but there it is...
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(50, 50, 100, 100);
        f1.add(datePicker);

	}
	}


class DateLabelFormatter extends AbstractFormatter {

    private String datePattern = "dd-MM-yyyy";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }

        return "";
    }

}