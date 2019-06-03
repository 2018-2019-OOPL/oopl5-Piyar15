package pl.edu.ur.oopl5;

import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Pan Tadeusz", "Adam Mickiewicz", 300, 1834, 20);
        System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPages() + " " + book.getYear() + " " + book.getPrice());
        Employee employee = new Employee("Jan", "Kowalski", 25, "CEO");
        System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getAge() + " " + employee.getPosition());

    }

}
