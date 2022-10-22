def odd_position(arr):
    lst = []
    for j in range(len(arr)):
        if j % 2 != 0:
            print(arr[j])


odd_position([1, 2, 5, 6, 7, 8])
