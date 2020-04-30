
package visual.chaperone;


public class BusChaperoneClass {
    String RID,RDEP,RNUM,EN,NAME,SB,CP,ADRS;
    public BusChaperoneClass(String RouteId,String RouteDep, String RouteNumber,String EmpNum, String Name, String ChapStandby, String ChapPhoneNum, String ChapAddress){
        this.RID = RouteId;
        this.RDEP = RouteDep;
        this.RNUM = RouteNumber;
        this.EN = EmpNum;
        this.NAME = Name;
        this.SB = ChapStandby;
        this.CP = ChapPhoneNum;
        this.ADRS = ChapAddress;
    }
    
    
    public String getRouteId(){
        return RID;
    }
    public String getRouteDep(){
        return RDEP;
    }
    public String getRouteNumber(){
        return RNUM;
    }
    public String getEmpNum(){
        return EN;
    }
    public String getChapPhoneNum(){
        return CP;
    }
    public String getName(){
        return NAME;
    }
    public String getChapStandby(){
        return SB;
    }
    public String getChapAddress(){
        return ADRS;
    }
}
