def palindrome(word):
    return word == word[::-1]


print(palindrome("dog"))
print((palindrome("gog")))