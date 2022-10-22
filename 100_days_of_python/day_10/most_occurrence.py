def common_prefix(lst):
    if len(lst) == 0:
        return "List is empty"
    lst = sorted(lst)
    print(lst)
    prefix = ""
    k = 0
    for i in lst[0]:
        if i == lst[-1][k]:
            prefix += i
        else:
            break
        k += 1
    return prefix


lst1 = ["flower", "flow", "floight"]
print(common_prefix(lst1))
