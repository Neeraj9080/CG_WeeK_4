package aidrivenresumescreeningsystem;

//Creating abstract class JobRole
public abstract class JobRole
{
    final private String roleName;
    final private String name;
    final private double salary;

    public JobRole(String roleName, String name, double salary)
    {
        this.roleName = roleName;
        this.name = name;
        this.salary = salary;
    }

    // Creating Getter Methods
    public String getRoleName()
    {
        return roleName;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }
}
