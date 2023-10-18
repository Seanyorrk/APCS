package Store;

public class UEmployeeClient {
   public static void main (String[]args){
      //create names for employees

      UEmployee emp1 = new UEmployee("John", "Smith", 1234, 100000);
      UEmployee emp2 = new UEmployee("Jane", "Doe", 5678, 200000);
      UEmployee emp3 = new UEmployee("John", "Doe", 9012, 300000);

      //create job titles for employees

      emp1.setJobTitle("Manager");
      emp2.setJobTitle("Assistant Manager");
      emp3.setJobTitle("Cashier");

      //toString method

      System.out.println(emp1.toString());
      System.out.println(emp2.toString());
      System.out.println(emp3.toString());

      //equals method

      System.out.println(emp1.equals(emp2));
      System.out.println(emp1.equals(emp3));
      System.out.println(emp2.equals(emp3));
      

   }



}
