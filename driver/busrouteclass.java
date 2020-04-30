
package visual.route;


public class busrouteclass {
     private String RID,UID,RDEP,RNUM,NAME,CLS,ADRS,ACT;
     public busrouteclass(String RouteId,String UserId,String RouteDep, String RouteNumber,String Name, String Cls, String Address,String Act){
        this.RID = RouteId;
        this.UID = UserId;
        this.RDEP = RouteDep;
        this.RNUM = RouteNumber;
        this.NAME = Name;
        this.CLS = Cls;
        this.ADRS = Address;
        this.ACT = Act;
     }
     
    public String getRouteId(){
        return RID;
    }
    public String getUserId(){
        return UID;
    }
    public String getRouteDep(){
        return RDEP;
    }
    public String getRouteNumber(){
        return RNUM;
    }
    
    public String getName(){
        return NAME;
    }
     public String getCls(){
        return CLS;
    }
    public String getAddress(){
        return ADRS;
    }
    public String getAct(){
        return ACT;
    }
}
