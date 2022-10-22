def list_of_digits(number):
    new_lst = []
    for i in str(number):
        new_lst.append(int(i))
    return new_lst


print(list_of_digits(1234))
