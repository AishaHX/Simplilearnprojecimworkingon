package OOPsDataStructure;

 class ArrayStudent {
     int reg_Num;
     String StudentName;
     ArrayStudent(int reg_no, String Name){
         this.reg_Num = reg_no;
         this.StudentName=Name;

     }

}



public class StudentMain{

    public static void main(String[] args) {
        ArrayStudent  arrayStudents[] =new ArrayStudent[5];
        arrayStudents[0]= new ArrayStudent (2,"aisha");
        arrayStudents[1] = new ArrayStudent(3,"hassan");
        arrayStudents[2] = new ArrayStudent(5,"Odawa");
        arrayStudents[3] = new ArrayStudent(5,"Odawa");
        arrayStudents[4] = new ArrayStudent(5,"Odawa");

        for (int i = 0; i < arrayStudents.length; i++) {
            System.out.println(arrayStudents[i].StudentName +" : " + arrayStudents[i].reg_Num);

        }

    }
}

