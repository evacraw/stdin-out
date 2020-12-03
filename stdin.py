lines = []
while True:
    try:
        i = list(map(str, input().split()))
        lines += i
    except EOFError:
        break
print(lines)
