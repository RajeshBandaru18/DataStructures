package Sorting_Techniques;

public class StaticKeyWord {
    static int count;
    StaticKeyWord(){
        count++;
    }
    void display(){
        System.out.println(count);
    }
    
    public static void main(String[] args){
        StaticKeyWord obj = new StaticKeyWord();
        obj.display();
        StaticKeyWord obj2 = new StaticKeyWord();
        obj2.display();
    }
}
