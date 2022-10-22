def even_position(arr):
    for i in range(len(arr)):
        if i % 2 == 0 and i != 0:
            print(arr[i])


even_position([1, 5, 6, 8, 9, 10, 11])
