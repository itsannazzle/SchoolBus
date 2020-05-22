package visual.route;


public class busrouteclass {
     private String RID,RDEP,RNUM,NAME,CLS,ADRS,ACT,BN,DN,CN;
     public busrouteclass(String rid,String busnum, String drivname, String chapname,String RouteDep, String RouteNumber,String Name, String Cls, String Address,String Act){
        
        this.RDEP = RouteDep;
        this.RNUM = RouteNumber;
        this.NAME = Name;
        this.CLS = Cls;
        this.ADRS = Address;
        this.ACT = Act;
        this.BN =busnum;
        this.DN=drivname;
        this.CN=chapname;
        this.RID=rid;
     }
//     
//             
//     
    
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
    public String getBusNum(){
        return BN;
    }
    public String getDrivName(){
        return DN;
    }
    public String getChapName(){
        return CN;
    }
    public String getRouteId(){
        return RID;
    }
}
