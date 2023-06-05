import java.util.*;
class MarksOutOfBoundsException extends Exception  {}

class DataEnterer{
    public Vector<Integer> marks;
    DataEnterer(){
        marks = new Vector<Integer>(5); 
    }

    public void newEntry(int mark) throws MarksOutOfBoundsException{
        if(mark > 100 || mark < 0){
            throw new MarksOutOfBoundsException();
        }
        marks.add(mark);
    }

}


public class Expriment10B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of students");
        int total = sc.nextInt();

        DataEnterer dataEnterer = new DataEnterer();
        for(int i=0;i<total;i++){
            System.out.println("New Entry:");
            try {
                dataEnterer.newEntry(sc.nextInt());
            } catch (MarksOutOfBoundsException e){
                e.printStackTrace();
            }
        }
    }
}
