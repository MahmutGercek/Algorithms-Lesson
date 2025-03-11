public class Week4_OOP_ProgStu {
    int number;
    String name;
    String surname;
    String department;
    String class_;
    double first_exam;
    double secondst_exam;
    double average;
    String letternote;

    // CONSTRUCTOR
    Week4_OOP_ProgStu(int number, String name,String surname, String department, String class_, double first_exam, double secondst_exam) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.class_ = class_;
        this.first_exam = first_exam;
        this.secondst_exam = secondst_exam;
    }
    Week4_OOP_ProgStu(int number_ex, String name_ex,String Surname_ex){ //TERCİH EDİLMEZ!!!!!!
        number = number_ex;
        name = name_ex;
        surname = Surname_ex;
    }
    void calculatenote(){
        average = (first_exam * 0.4) + (secondst_exam * 0.6);
    }
    void calculateharfletter() {
        if(average<50){
            letternote = "F";
        }
        else if (51<= average && average<= 60){
            letternote = "C";
        }
        else{
            letternote = "A";
        }
    }
}