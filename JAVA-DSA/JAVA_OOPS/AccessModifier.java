package JAVA_OOPS;

/*
access modifier | within class | within package | outside package by sunclssOnly | outside package 

pivate                Y                 N                  N                               N
defalut               Y                 Y                  N                               N
proctected            Y                 Y                  Y                               N
public                Y                 Y                  Y                               Y 
*/

public class AccessModifier {
    public static void main(String[] args) {

        Bank b = new Bank();
        b.userName = "Md akhlak";
        b.setPass("23243434sfs");
        // b.password = "ewrwerew32423"; // -> can't access

    }
}

class Bank {
    public String userName;
    private String password;

    void setPass(String pass) {
        password = pass;
    }
}