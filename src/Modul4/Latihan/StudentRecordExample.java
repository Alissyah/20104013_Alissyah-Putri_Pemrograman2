package Modul4.Latihan;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord Danisasa = new StudentRecord();
        StudentRecord Ini = new StudentRecord();
        StudentRecord Nama  = new StudentRecord();

        Danisasa.setName("Danisasa");
        Ini.setName("Ini");
        Nama.setName("Nama");

        System.out.println(Danisasa.getName());
        System.out.println("Hitung\t: " +StudentRecord.getStudentCount());
    }
}
