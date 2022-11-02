package lab_exercises.lab_3.hospital;

public class Main {
    public static void main(String[] args) {
        SickPatient patient = new SickPatient("Some", "addres ", "9512122121");
        patient.cure("paracetamol", 7);
        System.out.println(patient.getEpicrisis());
    }
}
