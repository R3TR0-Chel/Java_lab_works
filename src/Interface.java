public class Interface {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.getDetails();
        User u1 = new User() {
            @Override
            public void getDetails() {
                System.out.println("User Details");
            }
        };
        u1.getDetails();
    }
}

interface User {
    void getDetails();
}

class Admin implements User{
    public void getDetails(){
        System.out.println("Admin Details");
    }
}

