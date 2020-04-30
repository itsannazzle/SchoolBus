
package visual.bususer;


public class user {
    private String firstname,midname,lastname,gender,class1,address,activity,emergencynum,user_number;
    public user(String FName, String MidName,String Lname,String gender,String class1, String Address,String Act,String Emergencynum, String user_number){
        
        this.midname = MidName;
        this.firstname = FName;
        this.gender = gender;
        this.class1 = class1;
        this.address = Address;
        this.activity = Act; 
        this.emergencynum = Emergencynum;
        this.user_number = user_number;
        this.lastname = Lname;
        
        
    }
    
    
    
    public String getLname(){
        return lastname;
    }
    public String getMidName(){
        return midname;
    }
    public String getFName(){
    return firstname;
    }
    public String getgender(){
        return gender;
    }
    public String getclass1(){
        return class1;
    }
    public String getAddress(){
        return address;
    }
    public String getAct(){
        return activity;
    }
    public String getEmergencynum(){
        return emergencynum;
    }
    public String getuser_number(){
        return user_number;
}
  
    
    
    
}
