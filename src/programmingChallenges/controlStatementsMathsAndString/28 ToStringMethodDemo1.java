package src.programmingChallenges.controlStatementsMathsAndString;

class ToStringMethodDemo1 {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public ToStringMethodDemo1(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    // toString method using concatenate
    @Override
    public String toString() {
        return "ToStringMethodDemo1{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    // toString() method using StringBuilder
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("ToStringMethodDemo1{");
//        sb.append("noOfWheels=").append(noOfWheels);
//        sb.append(", noOfDoors=").append(noOfDoors);
//        sb.append(", maxSpeed=").append(maxSpeed);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", modelNumber='").append(modelNumber).append('\'');
//        sb.append(", company='").append(company).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

    public static void main(String[] args) {
        ToStringMethodDemo1 obj = new ToStringMethodDemo1(4,4, 160, "Verna", "SG", "Hyundai");
        System.out.println(obj);
    }
}
