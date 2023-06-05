n = 3
queries = [[0,0,4],[0,1,2],[1,0,1],[0,2,3],[1,2,1]]
row = [0 for i in range(n)]
col = [0 for j in range(n)]
a = [[0 for i in range(n)] for j in range(n)]

for query in queries:
    if query[0] == 1:
        col[query[1]] = query[2]
    if query[0] == 0:
        row[query[1]] = query[2]
print(row, col)