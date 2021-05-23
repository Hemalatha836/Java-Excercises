public class Employee
{
    //All final attributes
    private final String firstName; // required
    private final String lastName; // optional
    private final int age; // optional
    private final String company; // optional
    private final String exp; // optional
 
    private Employee(EmployeeBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.company = builder.company;
        this.exp = builder.exp;
    }
 
    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getcompany() {
        return company;
    }
    public String getexp() {
        return exp;
    }
 
    @Override
    public String toString() {
        return "Employee: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.company+", "+this.exp;
    }
 
    public static class EmployeeBuilder
    {
        private final String firstName;
        private String lastName;
        private int age;
        private String company;
        private String exp;
 
        public EmployeeBuilder(String firstName) {
            this.firstName = firstName;
        }
        public EmployeeBuilder lastName(String firstName) {
            this.lastName = lastName;
            return this;
        }
        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }
        public EmployeeBuilder company(String company) {
            this.company = company;
            return this;
        }
        public EmployeeBuilder exp(String exp) {
            this.exp = exp;
            return this;
        }
        //Return the finally consrcuted Employeeobject
        public Employee build() {
            Employee employee=  new Employee(this);
            validateEmployeeObject(employee);
            return employee;
        }
        private void validateEmployeeObject(Employee employee) {
            //Do some basic validations to check
            //if Employeeobject does not break any assumption of system
        }

    }
}