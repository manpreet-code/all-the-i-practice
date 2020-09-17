class person{
    private String name;
   
    public  String getter(){
        return name;
        
    }
    public void setter(String name){
         this.name=name;
    }
}
class employee extends person{
    double salary;
    String year;
    String nin;
    public employee(double salary,String year, String nin){
        this.salary=salary;
        this.nin=nin;
        this.year=year;
        
    }
    
}
public class testemployee {
    public static void main(String[] args) {
        
        employee ob=new employee(1234.0,"2020","-098089");
        ob.setter("simar");
        String x= ob.getter();
        System.out.println(x);
        System.out.println(ob.nin);
        System.out.println(ob.salary);
        System.out.println(ob.year);
    }
    
}
