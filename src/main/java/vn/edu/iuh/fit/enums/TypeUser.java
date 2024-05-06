package vn.edu.iuh.fit.enums;

public enum TypeUser {
    STUDENT("student"),
    LECTURE("lecture");
    private String type;

    TypeUser(String type) {
        this.type = type;
    }
}
