package OOPsDataStructure;

public class ParameterPassing {
    int v = 500;
    void change (int v) {
      v = v + 100; //changes will be in the local variabel only


}
 public static void main(String[] args){
ParameterPassing O = new ParameterPassing();
     System.out.println("Before making change " + O.v);
     O.change(50);
     System.out.println("After change made " + O.v);         // only copys the value of v = 500



         }
}
