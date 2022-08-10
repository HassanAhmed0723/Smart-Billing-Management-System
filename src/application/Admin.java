package application;

public class Admin {

	private String username;
    private String password;
    private String name;

    public Admin(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (username != null ? !username.equals(admin.username) : admin.username != null) return false;
        if (password != null ? !password.equals(admin.password) : admin.password != null) return false;
        return name != null ? name.equals(admin.name) : admin.name == null;



        

}

    public void editAccount(String username, String password, String name) {
           this.username = username;
           this.password = password;
           this.name = name;
       }

    public void update(Admin admin) {
           this.username = admin.username;
           this.password = admin.password;
           this.name = admin.name;
       }
}
