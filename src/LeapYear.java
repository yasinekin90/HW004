public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1600));
    }
   public static boolean isLeapYear(int year){

    if(year>=1 && year<=9999){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("This year is a leap year and it has 366 days ");
                    return true;
                }else {
                    System.out.println("This year is not a leap year.Since it has 365 days ");
                }
            }else return false;
        }else return false;
    }
       return false;
   }
}
