package other.user;

public class Developer implements User {
    @Override
    public void showInfo() {
        System.out.println(name + " to developer");
    }
}
