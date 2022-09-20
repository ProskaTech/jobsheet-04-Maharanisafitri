/*
 created by 21343008-Maharani Safitri 
 */
package jobsheet4;
public class KondisiOperator {
    public static void main(String[] args) {
       String status = "";
       int grade = 50;
    
       //mendapatkan status pelajar
       status = (grade >= 60) ? "passed" : "Fail";
    
       //print status 
       System.out.println(status);
    
     } 
}
