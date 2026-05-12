
package builderdesignpattern;

public class Main {
    public static void main(String[] args) {
      PatientRecord p = new PatientRecord.Builder().setPatientName("sdffs").setAge(20).setBillAmt(15000).setDoctorName("Dr. Vishwa").setDisease("Fever").setRoomType("Deluxe").build();
      p.display();
    }
}
