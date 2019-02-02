/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;
    
    //напишите тут ваш код
    
    public Cat(){
        catCount++;
    }
    
     protected finalize(){
        catCount--;
     }
    
    

    public static void main(String[] args) {

    }
}
