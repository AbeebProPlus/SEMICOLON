def add(a, b):
    return a + b


def sub(a, b):
    return a - b


def mul(a, b):
    return a * b


def div(a, b):
    return a / b


arithmetic_options = {
    "+": add,
    "-": sub,
    "/": div,
    "*": mul,
}


def calculate():
    choice = "yes"
    response = "no"
    result = 0
    while choice == "yes":
        if response == "yes":
            first_number = result
        else:
            first_number = float(input("Enter your first number: "))
        option = input("Enter a choice.\n+ for addition\n- for subtraction\n/ for division\n* for multiplication\n")
        second_number = float(input("Enter your second number: "))
        result = arithmetic_options[option](first_number, second_number)
        print(f"{first_number} {option} {second_number} = {result}")
        response = input(f"Do you want to continue using {result}?: ")
        if response == "no":
            choice = input("Do you want to continue. Press yes to continue or no to terminate: ")
