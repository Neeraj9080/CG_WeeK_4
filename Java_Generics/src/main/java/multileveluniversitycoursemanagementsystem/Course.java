package multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Creating generic class Course
class Course<T extends CourseType>
{
    private List<T> courses;

    // Default constructor of the class
    public Course()
    {
        courses = new ArrayList<>();
    }

    public void setCourses(T courseDetails)
    {
        courses.add(courseDetails);
    }

    public List<T> getCourses()
    {
        return courses;
    }
    // Wildcard method courseDetails to display course details
    public static void courseDetails(List<? extends CourseType> courses)
    {
        for (CourseType course : courses)
        {
            System.out.println("\nCourse Name is " + course.getCourseName());
            System.out.println("Course Duration is " + course.getCourseDuration());
            System.out.println("Course Price is " + course.getCoursePrice());
        }
    }
}
