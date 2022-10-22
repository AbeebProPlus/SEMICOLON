import string

alphabets = list(string.ascii_lowercase) + list(string.ascii_lowercase)


def caesar_cipher(message, shift, direction):
    coded_message = ""
    if direction == "decode":
        shift *= -1
    for letter in message:
        if letter not in alphabets:
            coded_message += letter
        else:
            coded_message += alphabets[alphabets.index(letter) + shift]
    return f"Your {direction}d message is {coded_message}"


response = "Yes"
while response == "Yes":
    text = input("Enter a message: ").lower()
    shift_amount = int(input("Enter shift amount: ")) % 25
    print(shift_amount)
    encrypt_type = input("Type 'encode' to decode your text or 'decode' to decode your text: ")
    result = caesar_cipher(message=text, shift=shift_amount, direction=encrypt_type)
    print(result)
    response = input("Do you want to proceed again? Type Yes to continue: ")
