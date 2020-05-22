
package visual.driver;


public class BusDriverClass {
    private String RID,RDEP,RNUM,EN,BNUM,NAME,CP,ADRS;
    public BusDriverClass (String RouteId,String RouteDep, String RouteNumber,String EmpNum,String BusNumber, String DriverName,String PhoneNum, String Address){
        this.RID = RouteId;
        this.RDEP = RouteDep;
        this.RNUM = RouteNumber;
        this.EN = EmpNum;
        this.BNUM = BusNumber;
        this.NAME = DriverName;
        this.CP = PhoneNum;
        this.ADRS = Address;
        
    }
    public String getRouteId() {
     return RID;
}
     public String getRouteDep() {
     return RDEP;
}
      public String getRouteNumber() {
     return RNUM;
}
    public String getempnum() {
     return EN;
}
    public String getBusNumber() {
     return BNUM;
}
     public String getBusDriver() {
     return NAME;
}
    public String getPhoneNum() {
     return CP;
}
     public String getAddress() {
     return ADRS;
}
     
    
    
}
