package ClassLearningExamples.N.Encapsulation;

public class EmployeeData {
    //    2.
    public int Id;
    public String Name;
    private int Salary;

    //    3.
    public void getEmpName() {
        System.out.println("Employee Name");
    }

    public void getEmpBonus() {
        System.out.println("Employee Bonus");
    }

//   4.
//    public EmployeeData(int Id, String Name, int Salary){  //this: When you have to give local variable to class variable
//        this.Id =Id;
//        this.Name = Name;
//        this.Salary =Salary;
//
//    }


    //    1.
    public static void main(String[] args) {
//    Simple Variable Access
//    EmployeeData EmpData = new EmployeeData();
//    EmpData.Id = 001;
//    EmpData.Name = "Chetan";
//    EmpData.Salary = 40000;
//
//        System.out.println("Id: "+EmpData.Id+"\nName: "+EmpData.Name+"\nSalary: "+ EmpData.Salary);

//    Method Access
//      EmployeeData EmpData1 = new EmployeeData();
//      EmpData1.getEmpName();
//      EmpData1.getEmpBonus();

//    Constructor Access
//        EmployeeData EmpData2 = new EmployeeData(003,"Tester",50000);
//        System.out.println(EmpData2.Id);
//        System.out.println(EmpData2.Name);
//        System.out.println(EmpData2.Salary);


    }
//    6. Getter and Setter Method.
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public int getSalary(){
       return Salary;
    }

}