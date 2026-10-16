public class Ifelse {
    public static void main(String[] args) {
       
       int age = 16;

       if(age >= 18){
        System.out.println("adult: vote, drive etc.");
       }
       
       if(age >= 13 && age <18){
        System.out.println("teengar");
       }
       else{
        System.out.println("Not adult");
       }

    }
}