student_heights = input("Enter your student height seperated by space: ").split()
total = 0
number_of_students = 0
for i in range(0, len(student_heights)):
    total += int(student_heights[i])
    number_of_students += i

average_height = round(total / number_of_students)
print(average_height)