package multileveluniversitycoursemanagementsystem;
// Creating main class MultilevelUniversityCourseManagementSystem
public class MultilevelUniversityCourseManagementSystem
{
        // Main method
        public static void main(String[] args)
        {
                // Creating objects of ExamCourse, AssignmentCourse and ResearchCourse classes
                ExamCourse course1 = new ExamCourse("Data Structures", "6 Month", 3000);
                AssignmentCourse course2 = new AssignmentCourse("Basic Programming" , "2 Month", 1000);
                ResearchCourse course3 = new ResearchCourse("BlockChain","1 year", 10000);

                // Creating objects of Couse class
                Course <ExamCourse> examCourse = new Course<>();
                Course <AssignmentCourse> assignmentCourse = new Course<>();
                Course <ResearchCourse> researchCourse = new Course<>();

                // Adding courses to Course class
                examCourse.setCourses(course1);
                assignmentCourse.setCourses(course2);
                researchCourse.setCourses(course3);

                // Displaying course details
                Course.courseDetails(examCourse.getCourses());
                Course.courseDetails(assignmentCourse.getCourses());
                Course.courseDetails(researchCourse.getCourses());
        }
}
