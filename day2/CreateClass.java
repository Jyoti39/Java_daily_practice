package WileyProject;

public class CreateClass implements Cloneable {
	 int a=10;
     public void add() {
     	System.out.println("Number Adding");}
	
	public static void main(String[] args)throws InstantiationException, IllegalAccessException,CloneNotSupportedException {
		// TODO Auto-generated method stub
		//Create object with new keyword
        CreateClass cc=new CreateClass();
        cc.add();
        System.out.println(cc);
          //creating object with instance
        try {
        	Class c=Class.forName("WileyProject.CreateClass");
        	CreateClass ci=(CreateClass) c.newInstance();
        	ci.add();
        	System.out.println(ci);
        }
        catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }
        //create class using clone
        CreateClass objClone=(CreateClass) cc.clone();
        objClone.add();
        System.out.println("objet clone:- "+objClone);
	}

}
