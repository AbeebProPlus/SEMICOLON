def prime_checker(number):
    count, i = 0, 1
    while i < number:
        if number % i == 0:
            count += 1
        if i > 2:
            break
        i += 1
    if count > 1:
        return False
    else:
        return True


print(prime_checker(13))