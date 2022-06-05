public class UserData {
    private String username;
    private String emailAdress;

    public UserData(String username, String emailAdress) {
        this.username = username;
        this.emailAdress = emailAdress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
