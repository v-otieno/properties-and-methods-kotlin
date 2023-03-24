/*In a class of 57 students the teacher was collecting data of her students,
 * The data she required was:
 * The gender of the students
 * The course they are doing
 * the feedback on boys playing football
 * the feedback on the ladies playing hockey
 * the feedback on the curriculum
 * Using inheritance, represent the gender and the course as
 * properties and the feedback as methods*/




open class Student(val gender: String, val course: String) {
    fun footballFeedback(feedback: String) {
        println("Feedback on boys playing football: $feedback")
    }

    fun hockeyFeedback(feedback: String) {
        println("Feedback on ladies playing hockey: $feedback")
    }
}

class MaleStudent(course: String) : Student("Male", course)

class FemaleStudent(course: String) : Student("Female", course)

class CurriculumFeedbackStudent(gender: String, course: String) : Student(gender, course) {
    fun curriculumFeedback(feedback: String) {
        println("Feedback on the curriculum: $feedback")
    }
}
fun main(){
    val maleStudent = MaleStudent("Computer Science")
maleStudent.footballFeedback("I love playing football!")
maleStudent.hockeyFeedback("I don't really follow hockey.")

val femaleStudent = FemaleStudent("Biology")
femaleStudent.footballFeedback("I'm not really into football.")
femaleStudent.hockeyFeedback("I enjoy watching hockey.")

val curriculumStudent = CurriculumFeedbackStudent("Female", "Mathematics")
curriculumStudent.curriculumFeedback("The curriculum is challenging but interesting.")
}