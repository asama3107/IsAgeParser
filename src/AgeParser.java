public class AgeParser {


    public static void main(String[] args) {


          String ageString = "25";

          int age = Integer.parseInt(ageString);





          if ((age >= 1) && (age <=120)) {
              System.out.println(age);
          } else {

              System.out.println("IllegalArgumentException");
          }
    }

}