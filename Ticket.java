public class Ticket implements Comparable<Ticket>{

    private int status;
    private int priority;
    private String name;
    private String problem;
    private int id;
    private static int prevId = 0;
  
    public Ticket(){
	status = -1;
	priority = 10000;
	name = "irrelevant";
	problem = "irrelevant";
	prevId += 1;
	id = prevId;
    }
    public String setName(String newname){
	name = newname;
	return name;
    }
    public void setPriority(int newpriority){
	priority = newpriority;
    }
    public void setStatus(int newstatus){
	status = newstatus;
    }
    public void setID(int newid){
	id = newid;
    }
    public String setProblem(String newproblem){
	problem = newproblem;
	return problem;
    }  
    public String getName(){	 
	return name;
    }
    public int  getPriority(){
	return priority;
    }
    public int getStatus(){
	return status;
    }
    public int getID(){
	return id;
    }
    public String getProblem(){
	return problem;
    }
    public int compareTo(Ticket other){
	return 1;
    }
}
