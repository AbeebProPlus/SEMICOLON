def sum_of_numbers_for_loop(arr):
    sum = 0
    for i in arr:
        sum += i
    return sum


print(sum_of_numbers_for_loop([1, 2, 3, 4, 5, 6]))


def sum_of_numbers_while_loop(arr):
    total = 0
    counter = 0
    while counter < (len(arr)):
        total += arr[counter]
        counter += 1
    return total


print(sum_of_numbers_while_loop([1, 2, 3, 4, 5, 6]))
