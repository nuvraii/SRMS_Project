public class User{
    
    // ATTRIBUTES
    private int id;
    private String name;
    private String emailAddress;
    private String phoneNumber;

    // METHODS
    // DEFUALT CONSTRUCTOR:
    public User(){
        // set defualt values
        this.id = 0;
        this.name= "Unknown";
        this.emailAddress="Unknown";
        this.phoneNumber= "Unknown";
    }

    // PARAMETERIZE COSTRUCTOR:
    public User(int id, String name, String emailAddress, String phoneNumber){
        this.id= id;
        this.name= name;
        this.emailAddress= emailAddress;
        this.phoneNumber= phoneNumber;
    }
    // Setters:
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmailAddress(String email){
        this.emailAddress = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    // override method toString() to display the user data:
    @Override
    public String toString(){
        return "---- User Informations ----\n" +
                "ID : "+ getId() + "\n" +
                "Name : "+ getName() + "\n" +
                "Email : "+ getEmailAddress() + "\n" +
                "Phone Number : "+ getPhoneNumber() + "\n";
    }
}