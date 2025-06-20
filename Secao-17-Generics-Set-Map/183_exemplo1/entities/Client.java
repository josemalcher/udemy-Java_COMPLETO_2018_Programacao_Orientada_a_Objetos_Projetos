package entities;

import java.util.Objects;

public class Client {
    private String name;
    private String emails;

    public Client(String name, String emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(emails, client.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, emails);
    }
}
