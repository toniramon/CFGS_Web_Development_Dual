package debugging;

public class ExceptionExamples {
    public static void main(String[] args) {
        Person employee = new Person();
        printPerson(employee);
    }

    public static void printPerson(Person myPerson) {

        System.out.println(myPerson.name + " is " + myPerson.age +
                " years old and works as a " + myPerson.job.JobName);
    }
}

class Person {
    String name;
    int age;
    JobType job;

    Person() {
    }
}

class JobType {
    String JobName;
    int salaryBand;

    JobType() {
    }
}