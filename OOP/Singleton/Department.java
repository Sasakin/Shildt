package Singleton;


public class Department {
    private static Department department;

    public static synchronized Department getDepartment() {
        if(department!=null) {
            department = new Department();
        }
        return department;
    }
}
