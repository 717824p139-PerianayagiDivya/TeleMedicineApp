package assignment;

public class User {
    protected String id;
    protected String name;
    protected String email;
    protected String role; // Doctor or Patient

    // Constructor
    public User(String id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    // Methods
    public void displayProfile() {
        System.out.println("User: " + name + " (" + role + ")");
    }

    public void sendNotification(String msg) {
        System.out.println("Notification to " + name + ": " + msg);
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
        System.out.println("Email updated for " + name);
    }

    public void login() {
        System.out.println(name + " logged into TeleMed.");
    }

    public void logout() {
        System.out.println(name + " logged out of TeleMed.");
    }
}


