class Studentt {

    private int age;
    void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Studentt s = new Studentt();

        s.setAge(20);
        System.out.println(s.getAge());
    }
}
