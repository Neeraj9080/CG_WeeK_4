package multileveluniversitycoursemanagementsystem;

// Creating abstract class CourseType for different courses
public abstract class CourseType
{
    // Attribute of the class
    final private String courseName;
    final private String courseDuration;
    final private double coursePrice;

    // Parameterized constructor of the class
    public CourseType(String courseName, String courseDuration, double coursePrice)
    {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.coursePrice = coursePrice;
    }
    // Getter methods
    public String getCourseName()
    {
        return courseName;
    }

    public String getCourseDuration()
    {
        return courseDuration;
    }

    public double getCoursePrice()
    {
        return coursePrice;
    }
}


