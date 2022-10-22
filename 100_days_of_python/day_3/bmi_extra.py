height = float(input("What's your height: "))
weight = int(input("Enter your weight: "))

bmi = round(weight / (height ** 2))

if bmi < 18.5:
    print(f"Your bmi is {bmi}, you're underweight")
elif 18.5 < bmi < 25:
    print(f"Your bmi is {bmi}, you've normal weight")
elif 25 < bmi < 30:
    print(f"Your bmi is {bmi}, you're overweight")
elif 30 < bmi < 35:
    print(f"Your bmi is {bmi},you're obese")
else:
    print(f"Your bmi is {bmi}, you're clinically obese")

