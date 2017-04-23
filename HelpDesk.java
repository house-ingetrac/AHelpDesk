import java.util.Scanner;

public class HelpDesk {

    private static ArrayPriorityQueue<Ticket> _q;
    
    public HelpDesk(){
	_q = new ArrayPriorityQueue<Ticket>();
    }

    public static boolean addToQueue(Scanner superScanner){
	System.out.println("Ok. Como se llama?");
	Ticket newTicket = new Ticket();
	_q.add(newTicket);
	newTicket.setStatus(0);
	newTicket.setName(superScanner.nextLine());
	System.out.println("Okay. What seems to be the problem?");
	newTicket.setProblem(superScanner.nextLine());
	System.out.println("How would you rate the direness of your problem?(On a scale of 1-10)");
	newTicket.setPriority(Integer.parseInt(superScanner.nextLine()));
	System.out.println("Ok good. So is there another problem you or your friends need help with?");
	if (superScanner.nextLine().equals("yes")){
	    addToQueue(superScanner);
	}
	else{
	    System.out.println( "Thanks. Let's get started on the problems.");
	}	
	return true;
    }
    
    public static void helpThing(Scanner superScanner){
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
	    System.out.println("Sorry we couldn't be of assistance. We're not actully a helpdesk, but a malware that's been selling your data to the interwebs this whole time.");
	}
    }
    
    public static void main(String[] args){
	HelpDesk helpme = new HelpDesk();
	Scanner superScanner = new Scanner(System.in);
	String response = "";
	System.out.println("Hola. Como estas? Do you need help?");
	if(superScanner.nextLine().equals("yes")){
	    addToQueue(superScanner);
	    helpThing(superScanner);
	}
	else{
	    System.out.println("Ok. Thanks for wasting my time.");
	}
    }

}
