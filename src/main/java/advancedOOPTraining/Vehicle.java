package advancedOOPTraining;

public abstract class  Vehicle {

   private String vehicleName;
   private String vehicleNumber;
   private String vehicleColor;
   private int id;


   public Vehicle(String name,String number, String color, int id){
     this.vehicleName = name;
      this.vehicleNumber= number;
      this.vehicleColor = color;
      this.id = id;


   }



   public String getVehicleName() {
      return vehicleName;
   }

   public void setVehicleName(String vehicleName) {
      this.vehicleName = vehicleName;
   }


   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }



   public String getVehicleNumber() {
      return vehicleNumber;
   }

   public void setVehicleNumber(String vehicleNumber) {
      this.vehicleNumber = vehicleNumber;
   }

   public String getVehicleColor() {
      return vehicleColor;
   }
   public void setVehicleColor(String vehicleColor) {
      this.vehicleColor = vehicleColor;
   }
public  String toString() {
   String txt = String.format(" %s  %s  number %s parked on spot %d", vehicleColor, vehicleName, vehicleNumber, id);
return txt;
}


}
