package Other.user;

public class Admin implements User {
    @Override
    public void showInfo() {
        System.out.println(name + " to admin");
    }
}
