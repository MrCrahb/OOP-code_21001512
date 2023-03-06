import java.util.*;
public class Main{
    public static void main(String[] args) {

        tuitionCentre PandaiOne = new tuitionCentre();
        Tutor Michael = new Tutor();
        Student Ali = new Student();
        Student Abu = new Student();

        //set tuitioncentre attributes
        PandaiOne.setAddress("Jalan Permai Damai 7/5");
        PandaiOne.setHeadmaster("Encik Ahmad");
        PandaiOne.setStudents(Ali);
        PandaiOne.setStudents(Abu);
        PandaiOne.setTutors(Michael);

        //set student (Ali) attributes

        Ali.setName("Ali");
        Ali.setAddress("Jalan Damai 01");
        Ali.setIc("030375124444");
        Ali.setSchoolname("Sekolah School");
        Ali.setYear("17");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println(Ali.getName() + ": Enter score for subject " + (i+1) + ": ");
            Ali.setScores(input.nextFloat(), i);
        }


        //set student (Abu) attributes
        Abu.setName("Abu");
        Abu.setAddress("Jalan Damai 02");
        Abu.setIc("031212121243");
        Abu.setSchoolname("School of Sekolah");
        Abu.setYear("17");

        for (int i = 0; i < 5; i++){
            System.out.println(Abu.getName() + ": Enter score for subject " + (i+1) + ": ");
            Abu.setScores(input.nextFloat(), i);
        }

        //set tutor (Michae) attributes

        Michael.setName("Michael");
        Michael.setAddress("Jalan Permai 111");
        Michael.setDateJoined("6/3/2021");
        Michael.setIc("030211121235");
        Michael.setNumYearsCentre(2);
        Michael.setNumYearsExp(12);
        Michael.setQualification("PhD in Mathematics with Honours");

        //run required methods in report

        System.out.println("Number of students in PandaiOne: " + PandaiOne.numStudents());
        System.out.println("Number of tutors in PandaiOne: " + PandaiOne.numTutors());
        System.out.println("Average marks in PandaiOne: " + PandaiOne.avgMarks());
        System.out.println("Minimum marks in PandaiOne: " + PandaiOne.minMarks());
        System.out.println("Maximum marks in PandaiOne: " + PandaiOne.maxMarks());
        System.out.println("Enter name of tutor to search: ");
        String searchTutor = input.next();
        System.out.println("Qualification of tutor: " + PandaiOne.tutorQual(searchTutor));

        input.close();
    }}