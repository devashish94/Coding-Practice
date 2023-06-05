a = [
    [1, 0, 0, 0],
    [1, 1, 0, 1],
    [1, 1, 0, 0],
    [0, 1, 1, 1]
]

# a = [
#     [1, 1, 0],
#     [0, 1, 0],
#     [0, 1, 1]
# ]


def printer(a: list[list[int]]):
    for row in a:
        print(row)


def f(row: int, col: int, a: list[list[int]], save, output):
    if row == len(a) - 1 and col == len(a[0]) - 1:
        output.append(save)
        print(f'end reached {row, col} \nsave = {save}\n---------------------')
        return

    if row + 1 < len(a) and a[row + 1][col] == 1:
        print(f'({row}, {col}) and next is D: {a[row + 1][col]}')
        a[row + 1][col] = 0
        f(row + 1, col, a, save + 'D', output)
        a[row + 1][col] = 1

    if row - 1 > 0 and a[row - 1][col] == 1:
        print(f'({row}, {col}) and next is U: {a[row - 1][col]}')
        a[row - 1][col] = 0
        f(row - 1, col, a, save + 'U', output)
        a[row - 1][col] = 1

    if col + 1 < len(a[0]) and a[row][col + 1] == 1:
        print(f'({row}, {col}) and next is R: {a[row][col + 1]}')
        a[row][col + 1] = 0
        f(row, col + 1, a, save + 'R', output)
        a[row][col + 1] = 1

    if col - 1 > 0 and a[row][col - 1] == 1:
        print(f'({row}, {col}) and next is L: {a[row][col - 1]}')
        a[row][col - 1] = 0
        f(row, col - 1, a, save + 'L', output)
        a[row][col - 1] = 1


output = []
f(0, 0, a, '', output)
print(f'list in the end:')
printer(a)
print(output)