import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Birthday month: ");
        int month = input.nextInt();

        System.out.println("Enter your Birthday day: ");
        int day = input.nextInt();

        if(month > 0 && month < 13 && day > 0 && day < 32){
            if(month == 1){
                if(day <= 21){
                    System.out.println("You are Capricorn");
                }else{
                    System.out.println("You are Aquarius");
                }
            }else if(month == 2){
                if(day <=19){
                    System.out.println("You are Aquarius");
                }else{
                    System.out.println("You are Pisces");
                }
            }else if(month == 3){
                if(day <=20){
                    System.out.println("You are Pisces");
                }else{
                    System.out.println("You are Aries");
                }
            }else if(month == 4){
                if(day <=20){
                    System.out.println("You are Aries");
                }else{
                    System.out.println("You are Taurus");
                }
            }else if(month == 5){
                if(day <=21){
                    System.out.println("You are Taurus");
                }else{
                    System.out.println("You are Gemini");
                }
            }else if(month == 6){
                if(day <=22){
                    System.out.println("You are Cancer");
                }
            }else if(month == 7){
                if(day <=22){
                    System.out.println("You are Cancer");
                }else{
                   System.out.println("You are Leo");
                }
            }else if(month == 8){
                if(day <=22){
                    System.out.println("You are Leo");
                }else{
                    System.out.println("You are Virgo");
                }
            }else if(month == 9){
                if(day <=22){
                    System.out.println("You are Virgo");
                }else{
                    System.out.println("You are Libra");
                }
            }else if(month == 10){
                if(day <=22){
                    System.out.println("You are Libra");
                }else {
                    System.out.println("You are Scorpio");
                }
            }else if(month == 11){
                if(day <=21){
                    System.out.println("You are Scorpio");
                }else {
                    System.out.println("You are Sagittarius");
                }
            }else if(month == 12){
                if(day <=21){
                    System.out.println("You are Sagittarius");
                }else{
                    System.out.println("You are Capricorn");
                }
            }


        }else{
            System.out.println("Invalid Birthday");
        }
    }
}