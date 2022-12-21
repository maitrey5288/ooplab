class FinalStudent {
    private int STIPEND = 100 ;
    private int studentId;
    private int aggregateMarks;
    double calculateTotalStipend;
    
    public FinalStudent (){
    this.STIPEND = STIPEND;
    this.studentId = studentId;
    this.aggregateMarks = aggregateMarks;
    }
    
    
    public int getstudentId() {
    return studentId;
    }
    public void setStudentId(int studentId) {
    this.studentId = studentId ;
    }
    public int getSTIPEND(){
    return STIPEND;
    }
    public void setSTIPEND(int STIPEND) {
    this.STIPEND = STIPEND;
    }
    
    public double calculateTotalStipend() {
    if(getaggregateMarks() >= 85 && getaggregateMarks() < 90) {
    return STIPEND +10;
    }
    else if(getaggregateMarks() >= 90 && getaggregateMarks() < 95) {
    return STIPEND +15;
    }
    else if(getaggregateMarks() >= 95 && getaggregateMarks() < 100) {
    return STIPEND +20;
    }
    else return STIPEND ;
    }
    
    public int getaggregateMarks() {
    return aggregateMarks;
    }
    
    public void setaggregateMarks(int aggregateMarks) {
    this.aggregateMarks = aggregateMarks;
    }
    }
    
   public class Stipend_5 {
    
    public static void main(String[] args) {
    FinalStudent student1 = new FinalStudent() ;
    student1.setStudentId(1212);
    student1.setaggregateMarks(93);
    
    double totalStipend = student1.calculateTotalStipend();
    System.out.println("The final stipend of " + student1.getstudentId()+" is $" + totalStipend);
    
    
    }
    }
    

    