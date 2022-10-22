from pathlib import Path
my_file = Path.home() / "hello.txt"
my_file.touch()
with my_file.open(mode = 'r', encoding = 'utf-8') as file:
    text = file.read()

print(text)
