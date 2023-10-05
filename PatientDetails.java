package javaproject;

public class PatientDetails {
    private String name = "Williams";
    int age = 40;
    String complaint = "Palpitations";  

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String args[]){
        PatientDetails patient = new PatientDetails();
        System.out.println(patient.name);
        System.out.println(patient.age);
        System.out.println(patient.complaint);
    }
    
}
