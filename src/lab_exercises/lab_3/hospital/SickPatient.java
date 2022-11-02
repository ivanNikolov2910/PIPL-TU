package lab_exercises.lab_3.hospital;

public class SickPatient extends Patient{
    private String epicrisis;

    public SickPatient(String name, String address, String egn) {
        super(name, address, egn);
    }


    @Override
    public void cure(String pill, int days) {
        String data = pill + " " + days;
        setEpicrisis(data);
    }

    public String getEpicrisis() {
        return epicrisis;
    }

    public void setEpicrisis(String epicrisis) {
        this.epicrisis = epicrisis;
    }
}
