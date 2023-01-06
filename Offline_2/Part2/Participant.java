public abstract class Participant {
    private ExamControllerOffice examControllerOffice;
    private int id;

    public Participant(ExamControllerOffice examControllerOffice, int id) {
        this.examControllerOffice = examControllerOffice;
        this.id = id;
    }

    public ExamControllerOffice getExamControllerOffice() {
        return examControllerOffice;
    }
    public int getID() {
        return id;
    }

    public abstract void receive(Documents docs);
}
