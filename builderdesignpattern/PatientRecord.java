
package builderdesignpattern;


public class PatientRecord {
    private String patientName;
    private int age;
    private String disease;
    private String doctorName;
    private String roomType;
    private double billAmt;

    private PatientRecord(Builder builder) {
        this.patientName = builder.patientName;
        this.age = builder.age;
        this.disease = builder.disease;
        this.doctorName = builder.doctorName;
        this.roomType = builder.roomType;
        this.billAmt = builder.billAmt;
    }
    
    public void display(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Age: "+age);
        System.out.println("Disease: "+disease);
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Room Type: "+roomType);
        System.out.println("Bill Amount: "+billAmt);
    }
    
    static class Builder{
        private String patientName;
        private int age;
        private String disease;
        private String doctorName;
        private String roomType;
        private double billAmt;

        public Builder setPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDisease(String disease) {
            this.disease = disease;
            return this;
        }

        public Builder setDoctorName(String doctorName) {
            this.doctorName = doctorName;
            return this;
        }

        public Builder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder setBillAmt(double billAmt) {
            this.billAmt = billAmt;
            return this;
        }
        
        PatientRecord build(){
            return new PatientRecord(this);
        }
        
    }
  
    
}
