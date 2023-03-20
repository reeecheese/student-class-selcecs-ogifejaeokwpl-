import java.util.ArrayList;
public class ClassSection {
    String subject; int capacity; int yearLevel; ArrayList<Student> students;

    ClassSection(String s, int c, int yL){
        subject = s; capacity = c; yearLevel = yL;
    }

    public String getSubject(){return subject;}
    public void setSubject(String i){subject = i;}
    public int getCapacity(){return capacity;}
    public void setCapacity(int i){capacity = i;}
    public int getYearLevel(){return yearLevel;}
    public void setYearLevel(int i){yearLevel = i;}
    public ArrayList getStudents(){return students;}

    public void addStudent(Student s){
        boolean a = isStudentEnrolled(s);
        if(!a){
            getStudents().add(s);
        }
    }
    public void removeStudent(Student s){
        boolean a = isStudentEnrolled(s);
        if(a){
            getStudents().remove(s);
        }
    }
    public boolean isStudentEnrolled(Student s){
        String objectName = "student";
        for(int i = 0; i < getStudents().size(); i++){
            if(getStudents().get(i).equals(s)){
                return true;
            }}return false;

    }
    public String toString(){
        return getStudents().toString();
    }

}
