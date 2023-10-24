public class PolymorpismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ali");
        employee.sayHello("Tyo");

        employee = new Manager("Eko");
        employee.sayHello("Tyo");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Eko"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof  Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
