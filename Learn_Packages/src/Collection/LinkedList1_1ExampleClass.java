package Collection;

public class LinkedList1_1ExampleClass {

//Variables
private String data;
private LinkedList1_1ExampleClass link;


//Constructor
public LinkedList1_1ExampleClass (String newdata, LinkedList1_1ExampleClass newlink) {
    data = newdata;
    link = newlink;
}

//Get-Set (4) Methods
public void setData(String newdata) {
    data = newdata;
}
public String getData() {
    return data;
}
public void setData(LinkedList1_1ExampleClass newlink) {
    link = newlink;
}
public LinkedList1_1ExampleClass getLink() {
    return link;
    }
}
