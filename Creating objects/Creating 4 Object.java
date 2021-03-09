class Person 
{
    public String name; 

    public String getName() 
    {
        return name;
    }
 
    public void setName(String newName)
    {
        this.name = newName;
    }
}

    public class Main{
    
     public static void main(String[] args) 
     {
        Person myObj = new Person();
        myObj.name = "John"; 
        System.out.println(myObj.name); 
    }
}