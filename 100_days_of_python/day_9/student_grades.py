student_grades = {
    "Harry": 81,
    "Ron": 78,
    "Hermione": 99,
    "Droco": 74,
    "Neville": 62
}
for key in student_grades:
    if student_grades[key] >= 91:
        student_grades[key] = "Outstanding"
    elif student_grades[key] >= 81:
        student_grades[key] = "Exceeds expectation"
    elif student_grades[key] >= 71:
        student_grades[key] = "Acceptable"
    else:
        student_grades[key] = "Fail"


print(student_grades)