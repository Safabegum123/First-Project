package Practice;

public class ifelsequs1 {
    public static void main(String[] args){
        int salary=10000;
        int year=15;
        //if employees service year more than 5 year bonus 5%
        //if empolyees service year more than 1o year bonus 10%
        //if employees service yrar more then 15 year bonus 30%
        if(year>=5 && year<10){
            System.out.println(10000*0.05);
        }else if(year>=10 && year<15) {
            System.out.println(10000*0.10);
        } else if(year>=15){
            System.out.println(10000*0.15);

            }
    }
        }

