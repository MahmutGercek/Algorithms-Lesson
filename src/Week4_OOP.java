public class Week4_OOP {
    public static void main(String[] args) {
        Week4_OOP_ProgStu student1 = new Week4_OOP_ProgStu(241550,"Mahmut","Gerçek","Software Engineering","2",50.5,72);
        Week4_OOP_ProgStu student2 = new Week4_OOP_ProgStu(241551,"Mete","Gerçek");

        System.out.println(student1.name + " " +  student1.surname);
        System.out.println(student2.name + " " +  student2.surname);
        student1.calculateharfletter();
        student1.calculatenote();
        System.out.println(student1.name + " " +  student1.surname + " " + student1.average + " " + student1.letternote);
        student2.first_exam = 25;
        student2.secondst_exam = 75;
        student2.calculatenote();
        student2.calculateharfletter();
        System.out.println(student2.name + " " +  student2.surname + " " + student2.average + " " + student2.letternote);

    }
}

