from pathlib import Path
my_file = Path.home() / "hello.txt"
lst_of_words = [
    "\nThis is coming from the write_lines file\n",
    "This is coming from the write_lines file\n",
    "This is coming from the write_lines file\n",
    "This is coming from the write_lines file\n"
]
with my_file.open(mode = "a", encoding = "utf-8") as file:
    file.writelines(lst_of_words)
