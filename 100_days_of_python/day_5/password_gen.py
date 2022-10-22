import random
import string

alphabet, punctuation, numbers = string.ascii_letters, string.punctuation, [str(i) for i in range(0, 10)]

amount_of_alphabets = int(input("How many letters do you want? "))
amount_of_punctuations = int(input("How many symbols do you want? "))
amount_of_numbers = int(input("How many numbers do you want? "))

password_list = []
for i in range(0, amount_of_alphabets):
    password_list.append(random.choice(alphabet))
for i in range(0, amount_of_punctuations):
    password_list.append(random.choice(punctuation))
for i in range(0, amount_of_numbers):
    password_list.append(random.choice(numbers))

random.shuffle(password_list)
strong_password = ''.join(password_list)
print(strong_password)
