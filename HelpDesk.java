import java.util.Scanner;

public class HelpDesk {

    private static ArrayPriorityQueue<Ticket> _q;
    
    public HelpDesk(){
	_q = new ArrayPriorityQueue<Ticket>();
    }

    public static boolean addToQueue(){
	System.out.println("Ok. Como se llama?");
	Ticket newTicket = new Ticket();
	_q.add(newTicket);
	newTicket.setStatus(0);
	newTicket.setName(superScanner.nextLine());
	System.out.println("Okay. What seems to be the problem?");
	newTicket.setProblem(superScanner.nextLine());
	System.out.println("How would you rate the direness of your problem?");
	newTicket.setPriority(superScanner.nextLine());
	return true;
    }
    
    public static void helpThing(){
	Ticket currentTicket = _q.removeMin();
	System.out.println("Come on up, " + currentTicket.getName());
	System.out.println("Did you try turning your machine off and on again?");
        while (superScanner.nextLine().equals("no")){
	    System.out.println("Try turning it off and on again");
	}
	System.out.println("Good job! Does your machine work?");
	if (superScanner.nextLine().equals("yes")){
	    System.out.println("Glad to help!");
	}
	else{
	    System.out.println("Sorry we couldn't be of assistance. We're not actully a helpdesk");
	}
    }
    
    public static void main(String[] args){
	HelpDesk helpme = new HelpDesk();
	Scanner superScanner = new Scanner(System.in);
	String response = "";
	System.out.println("Hola. Como estas? Do you need help?");
	if(superScanner.nextLine().equals("yes")){
	    addToQueue();
	    System.out.println("Do you have another problem?");
	    if (superScanner.nextLine().equals("yes")){
		addToQueue();
	    }
	    helpThing();
	}
	else{
	    System.out.println("Ok. Thanks for wasting my time.");
	}
    }

}
