def running_total(arr):
    total = 0;
    for i in arr:
        total += i
        print(total)


running_total([1, 2, 3, 5, 6])