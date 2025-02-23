package aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;
// Creating generic class Resume
public class Resume<T extends JobRole>
{
    private List<T> resumes;

    // Default constructor
    public Resume()
    {
        resumes = new ArrayList<>();
    }
    // Adding resumes
    public void addResume(T newResume)
    {
        resumes.add(newResume);
    }

    public List<T> getResumes()
    {
        return resumes;
    }

    // Wildcard Method to print the details
    public static void processResumes(List<? extends JobRole> resumes)
    {
        for (JobRole role : resumes)
        {
            System.out.println("\nResume processing for " + role.getRoleName());
            System.out.println("For Salary " + role.getSalary());
            System.out.println("Candidate name is " + role.getName());
        }
    }
}
