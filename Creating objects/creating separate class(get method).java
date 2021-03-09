public class person
{
    private String name;
    
    //GETTER
    private String getName()
    {
        return name;
    }
    
    //SETTER
    private void setName(String newName)
    {
        this.name = newName;
    }
}

public class main()
{
    public static void main (String[] args)
    {
        person myObj = new person();
        myObj.name = "Nimal";
        System.out.println(myObj.name);
    }

}

//https://www.w3schools.com/java/java_encapsulation.asp