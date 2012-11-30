import java.util.*;
public class Projet {
	private String name; 	//name
	private int [] begin; //date begin : day, month, Year
	private int [] end ; //date end : day, month, Year
	public static ArrayList <Event> le;
	private Scanner scan=new Scanner(System.in);
	
	


	Projet(){
	
		boolean answer=false;
		
		do{
			try{
				System.out.println("Entre the project name");
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
				System.out.println("date project begin");
				System.out.println("Entre the day, the month and the year");
				for(int i=0;i<3;i++){
					begin[i]=scan.nextInt();
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
				System.out.println("date project end");
				System.out.println("Entre the day, the month and the year");
				for(int i=0;i<3;i++){
					end[i]=scan.nextInt();
				}
			}
			catch(Exception exept){
				System.err.println(exept);
				System.out.println("Entre 3 integers");
				answer=true;
			}
		}
		while(answer);
				
		addEvent();
	}
	public void print(){
		System.out.println("--------------------------------------------------------------------------\n");
		System.out.println("| \t name \t | \t first begin \t | \t last begin \t | \t first end \t |");
		System.out.println("\t last end \t | \t next \t | \n");
		System.out.println("---------------------------------------------------------------------------\n");
		for (Event e:le){
			e.print();
		}
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	public void addEvent(){
		Event e=new Event();
		le.add(e);
	}
	
	public void removeEvent(Event e){
		le.remove(e);
	}
	
	
	
}
