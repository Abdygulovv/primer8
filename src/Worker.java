public class Worker {
    private String name;
    private String position;
    private double salary;

    public String getInfo(int month) {
        double totalSalary = salary * month;
        return " Worker: " + " name: " + name + " position: " + position + " salary: " + salary + " Total salary for " + month + " month: " + totalSalary;
    }


    public Worker(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}