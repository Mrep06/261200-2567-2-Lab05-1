import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // 2. สร้าง Getter/Setter เพื่อควบคุมการเข้าถึงข้อมูล

    // สำหรับ name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // สำหรับ dob
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void displayInfo() {
        System.out.println("User Name: " + name);
        System.out.println("Birthday: " + dob);
    }
}