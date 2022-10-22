def alternate_elements(arr, arr2):
    new_arr = []
    for i in range(len(arr)):
        new_arr.append(arr[i]), new_arr.append(arr2[i])
    return new_arr


print(alternate_elements(['a', 'b', 'c'], [1, 2, 3]))
print(alternate_elements(['a', 'b', 'c', 'd', 'e'], [1, 2, 3, 4, 5]))