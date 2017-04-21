import java.util.Scanner;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> _q;
    
    public HelpDesk(){
	_q = new ArrayPriorityQueue<Ticket>();
    }
    
    public static void main(String[] args){
	HelpDesk helpme = new HelpDesk();
	Scanner superScanner = new Scanner(System.in);
	String response = "";
	System.out.println("Hola. Como estas? Do you need help?");
	if(superScanner.nextLine().equals("yes")){
	    System.out.println("Okay. What seems to be the problem?");
	}
    }

}
