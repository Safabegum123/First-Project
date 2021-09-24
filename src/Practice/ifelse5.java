package Practice;

public class ifelse5 {
    public static void main(String[]args){
        int accident=5;
        int insurance=500;
        //1 accident =50
        //2 accident=120
        //3 accident=220
        //4 accident=370
        //5 accident=570
        //6 or more no insurance
        if(accident==1){
            System.out.println(500+50);
        }else if(accident==2){
            System.out.println(500+120);
        }else if(accident==3){
            System.out.println(500+220);
        }else if(accident==4){
            System.out.println(500+370);
        }else if(accident==5){
            System.out.println(500+570);
        }else if(accident<=6){
            System.out.println("no insurance");
        }
    }
}
