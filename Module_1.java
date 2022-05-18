public class Module_1 {
    String fname, lname, university_id, user_id;
    int semester;

    public void getData(String fname, String lname, String university_id, String user_id, int semester) {
        this.fname = fname;
        this.lname = lname;
        this.university_id = university_id;
        this.user_id = user_id;
        this.semester = semester;
    }

    public void SetData() {
        System.out.println("\t Student First Name => "+fname);
        System.out.println("\t Student Last Name => "+lname);
        System.out.println("\t Student University Name => "+university_id);
        System.out.println("\t Username => "+user_id);
        System.out.println("\t Semester => "+semester);
    }
}
