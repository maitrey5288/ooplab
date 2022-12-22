// 15. Write a program to implement following inheritance.
//  Accept data for 5 persons and display the name of employee 
//  having salary greater than 5000. Class Name: Person Member 
//  variables: Name, age Class Name: Employee Member variables: Designation, salary.

class Person{
    String name;
    int age;
    Person(int age, String name) {
       this.name = name;
       this.age = age;
    }
}
class Employee extends Person{
    String designation;
    int salary;
    Employee(String designation, String name, int age, int salary) {
        super(age, name);
        this.designation = designation;
        this.salary = salary;
        if (salary>5000){
           System.out.println(name);
            }
      } 
    }
public class inheritance_employee_15{
    public static void main (String [] args){
        Employee emp = new Employee("Developer","Naman",19,45000);
        Employee emp1 = new Employee("Manager","Karan",25,4000);
        Employee emp2 = new Employee("Accountant","Akash",26,5000);
        Employee emp3 = new Employee("Developer","Yash",22,6000);
        Employee emp4 = new Employee("Data Scientist","Sahil",23,2000);     
    }
}
