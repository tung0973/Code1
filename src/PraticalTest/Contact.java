package PraticalTest;

public class Contact {

    private String Name;
    private String ComName;
    private String Num;
    private String email;



    public Contact(String n, String nu,String co, String e) {
        Name= n;
        ComName= co;
        Num= nu;
        email= e;

    }

    public void setName(String urName){
        Name = urName ;
    }
    public void setNum(String newNumber){
        Num = newNumber;
    }
    public void ComName(String newCom){
        ComName = newCom;
    }
    public void setemail(String newemailAdd){
        email = newemailAdd;
    }
    public String getName(){
        return Name;
    }

    public String getNum(){
        return Num;
    }
    public String getemail(){
        return email;
    }
    public String getCom(){
        return ComName;
    }

}
