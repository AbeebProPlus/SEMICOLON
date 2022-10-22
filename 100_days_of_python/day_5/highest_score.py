scores = input("Enter student scores seperated by spaces: ").split()
highest = scores[0]
for i in scores:
    if i > highest:
        highest = i

print(highest)