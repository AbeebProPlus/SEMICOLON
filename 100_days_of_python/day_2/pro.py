print("Welcome to the tip calculator")
initial_bill = float(input("What was the initial bill? $"))
percentage_tip = int(input("What percentage tip would you like to give? 10, 12, 15? "))
people_to_pay_bill = int(input("How many people to spilt the bill? "))
each_person_pay = (initial_bill + (initial_bill * (percentage_tip / 100))) / people_to_pay_bill
print(f"Each person should pay ${round(each_person_pay, 2)}")
