package aidrivenresumescreeningsystem;

// Creating main class AIDrivenResumeScreeningSystem
public class AIDrivenResumeScreeningSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating objects of SoftwareEngineer, ProductManager and DataScientist classes
        SoftwareEngineer resume1 = new SoftwareEngineer("Neeraj", 100000);
        ProductManager resume2 = new ProductManager("Abhishek", 50000);
        DataScientist resume3 = new DataScientist("Rishab", 90000);

        // Creating objects of Resume class
        Resume <SoftwareEngineer> softwareEngineerResume = new Resume<>();
        Resume <ProductManager> productManagerResume = new Resume<>();
        Resume <DataScientist> dataScientistResume = new Resume<>();

        // Adding resumes to Resume class
        softwareEngineerResume.addResume(resume1);
        productManagerResume.addResume(resume2);
        dataScientistResume.addResume(resume3);

        // Displaying details of resume using wildcard method
        Resume.processResumes(softwareEngineerResume.getResumes());
        Resume.processResumes(productManagerResume.getResumes());
        Resume.processResumes(dataScientistResume.getResumes());
    }
}
