import java.util.*;
import java.io.*;
public class Event {
	private String name;
	private int fbegin[];
	private int fend[];
	private int lbegin[];
	private int lend[];
	private Event previous ;
	private Scanner scan= new Scanner(System.in);	
	
	Event(){
	
		boolean answer=false;
		
		do{
			try{
				System.out.println("Entre the Envent's name");
				name=scan.nextLine();
			}
			catch(Exception exept){
				System.err.println(exept);
				System.out.println("Entre a string");
				answer=true;
			}
		}
		while(answer);
		
		answer=false;
		
		do{
			try{
				System.out.println("prodject first begin");
				System.out.println("Entre the day, the month and the year");
				for(int i=0;i<3;i++){
					fbegin[i]=scan.nextInt();
				}
			}
			catch(Exception exept){
				System.err.println(exept);
				System.out.println("Entre 3 integers");
				answer=true;
			}
		}
		while(answer);
		
		answer=false;
		
		do{
			try{
				System.out.println("prodject last begin");
				System.out.println("Entre the day, the month and the year");
				for(int i=0;i<3;i++){
					lbegin[i]=scan.nextInt();
				}
			}
			catch(Exception exept){
				System.err.println(exept);
				System.out.println("Entre 3 integers");
				answer=true;
			}
		}
		while(answer);
		
		answer=false;
		
		do{
			try{
				System.out.println("event first end ");
				System.out.println("Entre the day, the month and the year");
				for(int i=0;i<3;i++){
					fend[i]=scan.nextInt();
				}
			}
			catch(Exception exept){
				System.err.println(exept);
				System.out.println("Entre 3 integers");
				answer=true;
			}
		}
		while(answer);
		
		answer=false;
		
		do{
			try{
				System.out.println("event last end ");
				System.out.println("Entre the day, the month and the year");
				for(int i=0;i<3;i++){
					lend[i]=scan.nextInt();
				}
			}
			catch(Exception exept){
				System.err.println(exept);
				System.out.println("Entre 3 integers");
				answer=true;
			}
		}
		while(answer);
		
		answer=false;
		
		do{
			try{
				System.out.println("entre the name of the previous event");
				String name=scan.nextLine();
				previous=researchElement(name);
			}
			catch(Exception exept){
				System.err.println(exept);
				System.out.println("Entre a name");
				answer=true;
			}
		}
		while(answer);

	}
	
	
	public Event researchElement(String name){
		
		for (Event e:Projet.le){
			if(e.name==name){
				return e;
			}
		}
		
		return null;
	}


	
	public void print(){
		System.out.println("|"+name+"|"+printDate(fbegin)+"|"+printDate(lbegin)+"|"+printDate(fend)+"|"+printDate(lend)+"|");
		for (Event e:Projet.le){
			if (e.previous.name==name){
				System.out.println(e.name+"\t");
			}
		}
		System.out.println("| \n ------------------------------------------------------------------------");
		
	}
	public String printDate(int[] date){
		return (date[0]+"/"+date[1]+"/"+date[2]);		
	}
	public String getName() {
		return name;
	}


	public Event getPrevious() {
		return previous;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrevious(Event previous) {
		this.previous = previous;
	}


		

	
}
