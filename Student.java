public class Student {
    int id; int age; int yearLevel; String firstName; String lastName; static int studentCount;

    Student(String fN, String lN, int a, int yL ){
        firstName = fN; lastName = lN; age = a; yearLevel = yL;
        id++;
    }
    public int getid(){return id;}
    public int getAge(){return age;}
    public void setAge(int i){age = i;}
    public int getYearLevel(){return yearLevel;}
    public void setYearLevel(int i){yearLevel = i;}
    public int getStudentCount(){return studentCount;}
    public String getFirstName(){return firstName;}
    public void setFirstName(String i){firstName = i;}
    public String getLastName(){return lastName;}
    public void setLastName(String i){lastName = i;}

    public boolean equals(Student student1){
        if(student1.id == id){
            return true;
        }else{return false;}
    }
    public String toString(){
        return firstName + " " + lastName + " Age = " + age + " YearLevel = " + yearLevel + " id = " + id;
    }
}
