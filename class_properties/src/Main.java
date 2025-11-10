class Employee {

    private String name;
    private float salary;


    //Constructor
    Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public void  setSalary(float salary) {
        this.salary = salary;
    }

    //Instance method

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println(("Salary: " + salary));
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee employee = new Employee("Geek", 10000.0f);
        employee.displayDetails();
//        System.out.println(employee.getName());
         employee.setName("Tom");
         employee.setSalary(12.15f);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
