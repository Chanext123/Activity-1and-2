class generic_Student<student> {
    
    student stu;
    generic_Student(student stu) { 
        this.stu = stu;
     } 
    public student getObject() {
        return this.stu;
     }
}
