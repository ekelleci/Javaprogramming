package taskSolutions.day38;

public class StateObject {
    public static void main(String[] args) {

        Virginia state1=new Virginia("VA","Democrat","Alex","Patrycja",3456000,7.45,"29334");

        System.out.println(state1.getName());

        System.out.println(state1.getGovernor());

        state1.makingWine();
        System.out.println(state1);
    }
}
