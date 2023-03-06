import java.util.*;
public class tuitionCentre{

    private String address;
    private String headmaster;
    private ArrayList<Tutor> tutors = new ArrayList<Tutor>();
    private ArrayList<Student> students = new ArrayList<Student>();
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getHeadmaster() {
        return headmaster;
    }
    public void setHeadmaster(String headmaster) {
        this.headmaster = headmaster;
    }
    public ArrayList<Tutor> getTutors() {
        return tutors;
    }
    public void setTutors(Tutor tutor) {
        tutors.add(tutor);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(Student student) {
        students.add(student);
    }

    public int numStudents(){
        return students.size();
    }

    public int numTutors(){
        return tutors.size();
    }

    public float avgMarks(){
        float sum = 0, average;
        for (int i = 0; i < students.size(); i++){
            sum += students.get(i).calcAverage();
        }
        average = sum/students.size();
        return average;
    }

    public String minMarks(){
        float lowest = 100;
        String name = "name";
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).calcAverage() <= lowest){
                lowest = students.get(i).calcAverage();
                name = students.get(i).getName();
            }
        }
        return "Lowest marks is " + lowest + " by " + name;
    }

    public String maxMarks(){
        float highest = 0;
        String name = "placeholder";
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).calcAverage() >= highest){
                highest = students.get(i).calcAverage();
                name = students.get(i).getName();
            }
        }
        return "Highest marks is " + highest + " by " + name;
    }

    public String tutorQual(String name){
        for (int i = 0; i < tutors.size(); i++){
            Tutor findTutor = tutors.get(i);
            if (findTutor.getName() == name){
                return findTutor.getQualification();
            }
        }
        return "Tutor not found, re-enter name.";
    }
}