package exercise1;

public class EmployeeRecord {
    public static void main(String []args){
      //  double [] salary = new double[5];
        double salary[] = {23500.0,25080.0,28760.0,22340.0,19890.0};
        double average = (salary[0]+salary[1]+salary[2]+salary[3]+salary[4])/5;
        int greaterNumber=0;
        int lesserNumber=0;
        for(int i =0;i< salary.length;i++){
            if(salary[i]>average){
                greaterNumber =+i;
            }
             lesserNumber = salary.length - greaterNumber;
        }
        System.out.println("The average salary of the employee is "+average);
        System.out.println("The number of the employees having salary greater than the average is "+greaterNumber);
        System.out.println("The number of the employees having salary lesser than the average is "+lesserNumber);

    }
}
